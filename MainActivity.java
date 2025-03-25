package com.example.slip8q1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                if (!username.isEmpty() && !password.isEmpty()) {
                    if (username.equals("user") && password.equals("pass")) {
                        Toast.makeText(MainActivity.this, "Login Successful! Go to next activity.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, com.example.slip8q1.NextActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "invalid username and password.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
