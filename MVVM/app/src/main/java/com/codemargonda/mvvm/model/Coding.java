package com.codemargonda.mvvm.model;

/**
 * Created by Jefri Yushendri on 23/2/2017.
 */

public class Coding {
    private String ide;
    private String bahasa;

    public Coding(String ide, String bahasa) {
        this.ide = ide;
        this.bahasa = bahasa;
    }

    public String getIde() {
        return ide;
    }

    public String getBahasa() {
        return bahasa;
    }
}
