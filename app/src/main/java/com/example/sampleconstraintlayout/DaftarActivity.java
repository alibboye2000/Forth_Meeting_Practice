package com.example.sampleconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepass);

        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(view -> {
            if (edtNama.getText().toString().isEmpty() ||
            edtAlamat.getText().toString().isEmpty() ||
            edtPassword.getText().toString().isEmpty() ||
            edtrepass.getText().toString().isEmpty()) {
                Snackbar.make(view, "wijab isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
            }
            else
            {
                if (edtPassword.getText().toString().equals(edtrepass.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
                else
                {
                    Snackbar.make(view,"Password dan Repassword haus sama!!!!",
                            Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}