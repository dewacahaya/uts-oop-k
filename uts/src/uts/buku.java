/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Pongo
 */
public class buku{
    
    protected String judul;
    protected String penulis;
    protected int tahunTerbit;

    public buku() {
        this.judul = "";
        this.penulis = "";
        this.tahunTerbit = 0;
    }

    public buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter & Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("==============================");
        System.out.println("JUDUL       : " + judul.toUpperCase());
        System.out.println("PENULIS     : " + penulis.toUpperCase());
        System.out.println("TAHUN TERBIT: " + tahunTerbit);
        System.out.println("==============================");
    }
}
