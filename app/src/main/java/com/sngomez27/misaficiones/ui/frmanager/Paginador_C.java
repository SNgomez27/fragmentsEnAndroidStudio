package com.sngomez27.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.sngomez27.misaficiones.fr.aficiones.comida_asado;
import com.sngomez27.misaficiones.fr.aficiones.comida_empanadas;

public class Paginador_C extends FragmentPagerAdapter {

    public final Context mContext;

    public Paginador_C(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new comida_empanadas();
            case 1:
                return new comida_asado();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}