package com.sngomez27.misaficiones.fr.aficiones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.sngomez27.misaficiones.R;

import org.jetbrains.annotations.Nullable;

public class Foto_SM extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return  inflater.inflate(R.layout.fragment_sobree_mi_foto, container,false);

    }

}