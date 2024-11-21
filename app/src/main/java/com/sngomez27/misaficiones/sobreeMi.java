package com.sngomez27.misaficiones;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.StringRes;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.sngomez27.misaficiones.databinding.ActivityAficionesBinding;
import com.sngomez27.misaficiones.ui.frmanager.Paginador_SB;

public class sobreeMi extends AppCompatActivity {

    private ActivityAficionesBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador_SB paginadorSb = new Paginador_SB(this,getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginadorSb);
    }
}