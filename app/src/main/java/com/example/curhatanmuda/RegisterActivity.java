package com.example.curhatanmuda;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText nameInput;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameInput = findViewById(R.id.etName);
        registerBtn = findViewById(R.id.btnRegister);

        registerBtn.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            Toast.makeText(this, "Selamat datang, " + name, Toast.LENGTH_SHORT).show();
            Log.d("REGISTER", "User registered: " + name);
        });
    }
}