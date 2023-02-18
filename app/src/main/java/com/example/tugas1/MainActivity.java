package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNama, etNpm, etJurusan;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.edNama);
        etNpm = findViewById(R.id.edNPM);
        etJurusan = findViewById(R.id.edJurusan);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String npm = etNpm.getText().toString();
                String jurusan = etJurusan.getText().toString();

                // menyimpan string value ke dalam strings.xml
                getResources().getString(R.string.sNama, nama);
                getResources().getString(R.string.sNPM, npm);
                getResources().getString(R.string.sJurusan, jurusan);

                Toast.makeText(getApplicationContext(), nama ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}