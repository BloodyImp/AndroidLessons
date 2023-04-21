package ru.mirea.butakov.s.d.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String currentTime = getIntent().getStringExtra("dateString");
        String text = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 16, а текущее время " + currentTime;
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);
    }

}
