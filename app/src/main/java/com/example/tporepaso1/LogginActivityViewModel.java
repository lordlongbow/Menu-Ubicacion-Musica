package com.example.tporepaso1;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class LogginActivityViewModel extends AndroidViewModel {

    private Context context;
        private MutableLiveData<Boolean> validado = new MutableLiveData<>();
        private String usuario = "";
        private String contrasenia = "";

    public LogginActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Boolean> getValidado() {
            return validado;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public void setContrasenia(String contrasenia) {
            this.contrasenia = contrasenia;
        }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void validoUsuario() {
            if (usuario.equals("usuario") && usuario.equals("contrasenia")) {
                validado.setValue(true);

            } else {
                validado.setValue(false);
                Toast.makeText(context, "Credenciales inválidas", Toast.LENGTH_SHORT).show();
            }
        }
    }


