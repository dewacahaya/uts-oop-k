/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class perpustakaan extends buku{
    private buku[] koleksi;
    private int jumlahBuku;

    public perpustakaan() {
        koleksi = new buku[100];
        jumlahBuku = 0;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("==============================");
        System.out.println("JUDUL       : " + judul.toUpperCase());
        System.out.println("PENULIS     : " + penulis.toUpperCase());
        System.out.println("TAHUN TERBIT: " + tahunTerbit);
        System.out.println("==============================");
    }

    public void tambahBuku(Scanner scanner) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = scanner.nextInt(); scanner.nextLine();

        koleksi[jumlahBuku++] = new buku(judul, penulis, tahun);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tampilkanSemuaBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku di perpustakaan.");
            return;
        }
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.print((i + 1) + ". ");
            koleksi[i].tampilkanInfo();
        }
    }

    public void ubahBuku(Scanner scanner) {
        tampilkanSemuaBuku();
        System.out.print("Pilih nomor buku yang akan diubah: ");
        int idx = scanner.nextInt(); scanner.nextLine();

        if (idx < 1 || idx > jumlahBuku) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        buku b = koleksi[idx - 1];
        System.out.print("Judul baru: ");
        b.setJudul(scanner.nextLine());
        System.out.print("Penulis baru: ");
        b.setPenulis(scanner.nextLine());
        System.out.print("Tahun terbit baru: ");
        b.setTahunTerbit(scanner.nextInt()); scanner.nextLine();

        System.out.println("Buku berhasil diubah!");
    }

    public void hapusBuku(Scanner scanner) {
        tampilkanSemuaBuku();
        System.out.print("Pilih nomor buku yang akan dihapus: ");
        int idx = scanner.nextInt(); scanner.nextLine();

        if (idx < 1 || idx > jumlahBuku) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        for (int i = idx - 1; i < jumlahBuku - 1; i++) {
            koleksi[i] = koleksi[i + 1];
        }
        koleksi[--jumlahBuku] = null;
        System.out.println("Buku berhasil dihapus!");
    }
}
