/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        perpustakaan perpustakaan = new perpustakaan();

        int pilihan;
        do {
            System.out.println("\n--- ADMINISTRATOR PERPUSTAKAAN ---");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt(); scanner.nextLine();

            switch (pilihan) {
                case 1: perpustakaan.tambahBuku(scanner); break;
                case 2: perpustakaan.tampilkanSemuaBuku(); break;
                case 3: perpustakaan.ubahBuku(scanner); break;
                case 4: perpustakaan.hapusBuku(scanner); break;
                case 5: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
    
}
