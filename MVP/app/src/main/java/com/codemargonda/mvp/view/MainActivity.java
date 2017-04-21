package com.codemargonda.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.codemargonda.mvp.presenter.NamaPresenter;

public class MainActivity extends AppCompatActivity {

    NamaPresenter hai;
    TextView txtTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hai = new NamaPresenter();

        txtTest = (TextView) findViewById(R.id.txt_test);
        txtTest.setText(hai.setNama("Muh Isfahani Ghiyath"));
    }
}
