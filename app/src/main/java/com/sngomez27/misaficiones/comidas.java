package com.sngomez27.misaficiones;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sngomez27.misaficiones.databinding.ActivitySobreeMiBinding;
import com.sngomez27.misaficiones.ui.frmanager.Paginador_C;
import com.sngomez27.misaficiones.ui.frmanager.Paginador_SB;
import com.sngomez27.misaficiones.ui.main.SectionsPagerAdapter;
import com.sngomez27.misaficiones.databinding.ActivityComidasBinding;

public class comidas extends AppCompatActivity {

    private ActivityComidasBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        binding = ActivityComidasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador_C paginadorC = new Paginador_C(this,getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginadorC);
    TabLayout tabLayout = binding.tab;
    tabLayout.setupWithViewPager(viewPager);

    }

}