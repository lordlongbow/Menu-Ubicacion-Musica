package com.example.tporepaso1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogginActivity extends AppCompatActivity {

        private EditText etUsuario, etContrasenia;

        private Button btIngresar;
        private LogginActivityViewModel viewModel;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_loggin);

            etUsuario = findViewById(R.id.etUsuario);
            etContrasenia = findViewById(R.id.etContrasenia);
            btIngresar = findViewById(R.id.btIngresar);

            viewModel = new ViewModelProvider(this).get(LogginActivityViewModel.class);
            viewModel.setContext(this);
            btIngresar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = etUsuario.getText().toString();
                    String password = etContrasenia.getText().toString();

                    viewModel.setUsuario(username);
                    viewModel.setContrasenia(password);
                    viewModel.validoUsuario();
                }
            });

            viewModel.getValidado().observe(this, new Observer<Boolean>() {
                @Override
                public void onChanged(Boolean validado) {
                    if (validado) {

                        Intent intent = new Intent(LogginActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
}

