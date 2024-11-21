package com.sngomez27.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sngomez27.misaficiones.R;
import com.sngomez27.misaficiones.fr.aficiones.Datos_SM;
import com.sngomez27.misaficiones.fr.aficiones.Foto_SM;

public class Paginador_SB extends FragmentPagerAdapter {
    public final Context mContext;
    public Paginador_SB(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new Datos_SM();
            case 1:
                return new Foto_SM();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

}
