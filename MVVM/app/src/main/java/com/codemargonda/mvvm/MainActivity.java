package com.codemargonda.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.codemargonda.mvvm.databinding.ContentMainBinding;
import com.codemargonda.mvvm.model.Coding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ContentMainBinding content = DataBindingUtil.setContentView(this, R.layout.content_main);
        Coding coding = new Coding("Android Studio", "Java");
        content.setCoding(coding);

//        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        Mahasiswa mahasiswa = new Mahasiswa("Code", "Margonda");
//        binding.setMahasiswa(mahasiswa);

//        setContentView(R.layout.activity_main);
//        TextView txtHello = (TextView) findViewById(R.id.txt_hello);
//        txtHello.setText("Halo, Codemargonda.com");
    }
}
