package com.example.tporepaso1.ui.Musica;

import android.content.Context;
import android.content.Intent;

import androidx.lifecycle.ViewModel;

public class MusicaViewModel extends ViewModel {

    private Context contexto;

    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    public void reroducir() {

        Intent intent = new Intent(contexto, ServicioMusical.class);
        contexto.startService(intent);
    }

    public void stopService() {

        Intent intent = new Intent(contexto, ServicioMusical.class);
        contexto.stopService(intent);
    }
}
}