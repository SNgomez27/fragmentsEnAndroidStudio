package com.sngomez27.misaficiones;

import android.os.Bundle;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;
import com.sngomez27.misaficiones.databinding.ActivityAficionesBinding;
import com.sngomez27.misaficiones.databinding.ActivitySobreeMiBinding;
import com.sngomez27.misaficiones.ui.frmanager.Paginador_SB;

public class sobreeMi extends AppCompatActivity {

    private ActivitySobreeMiBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        binding = ActivitySobreeMiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador_SB paginadorSb = new Paginador_SB(this,getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginadorSb);

        TabLayout tabLayout = binding.textoSobreeMi;
        tabLayout.setupWithViewPager(viewPager);

    }
}