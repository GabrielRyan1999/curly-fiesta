/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class RumahSakit {

    private String nama;

    private ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public RumahSakit() {
    }

    public RumahSakit(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }

    public void tambahDokter(Dokter dokter) {
        if (cariDokter(dokter.getNama()) < 0) {
            daftarDokter.add(dokter);
        } else {
            System.out.println("Dokter Dah Daftar");
        }

    }

    public void tambahKlinik(Klinik Klinik) {
        if (cariKlinik(Klinik.getNamaKlinik()) < 0) {
            daftarKlinik.add(Klinik);
        } else {
            System.out.println("Klinik Dah Ada");
        }

    }

    public int cariDokter(String nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).getNama().equalsIgnoreCase(nama)) {
                return 1;
            }

        }
        return -1;
    }

    public int cariKlinik(String nama) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNamaKlinik().equalsIgnoreCase(nama)) {
                return 1;
            }
        }
        return -1;
    }
    
   
}
