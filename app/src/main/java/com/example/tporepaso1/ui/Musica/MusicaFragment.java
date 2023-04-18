package com.example.tporepaso1.ui.Musica;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tporepaso1.R;

public class MusicaFragment extends Fragment {

    private MusicaViewModel mViewModel;

    public static MusicaFragment newInstance() {
        return new MusicaFragment();
    }




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar el ViewModel
        mViewModel = new ViewModelProvider(this).get(MusicaViewModel.class);
        mViewModel.setContexto(MusicaFragment.newInstance().getContext());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_musica, container, false);

        // Configurar el botón "Play"
        rootView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.reroducir();
            }
        });

        // Configurar el botón "Stop"
        rootView.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.stopService();
            }
        });

        return rootView;
    }
}



}