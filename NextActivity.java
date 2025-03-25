package com.example.slip8q1;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class NextActivity extends AppCompatActivity{
    private TextView textViewMessage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("welcome to the next activity!");
    }
}
