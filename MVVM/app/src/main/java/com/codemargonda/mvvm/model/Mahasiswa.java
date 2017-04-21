package com.codemargonda.mvvm.model;

/**
 * Created by Jefri Yushendri on 23/2/2017.
 */

public class Mahasiswa {
    private String namaDepan;
    private String namaBelakang;

    public Mahasiswa(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }
}
