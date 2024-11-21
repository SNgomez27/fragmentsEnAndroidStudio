package com.sngomez27.misaficiones;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.sngomez27.misaficiones.ui.frmanager.Paginador;
import com.sngomez27.misaficiones.databinding.ActivityAficionesBinding;

public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador paginador = new Paginador(this,getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_sobre_mi, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull  MenuItem item){
        int id = item.getItemId();
        if ( id == R.id.botonFav){
            Toast toast = Toast.makeText(this, "como me gustan mis aficiones", Toast.LENGTH_SHORT);
            toast.show();
        }
        if ( id == R.id.botonSobreMi) {
            Intent intent = new Intent(Aficiones.this, sobreeMi.class);
            startActivity(intent);
        }
        if (id == R.id.botonMycode){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/SNgomez27"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}

