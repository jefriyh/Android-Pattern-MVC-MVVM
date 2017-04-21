package com.codemargonda.mvp.presenter;

import com.codemargonda.mvp.model.Margonda;

/**
 * Created by Jefri Yushendri on 23/2/2017.
 */

public class NamaPresenter {

    public String setNama(String nama) {
        Margonda margonda = new Margonda();
        margonda.setNama(nama);
        return margonda.getNama();
    }
}
