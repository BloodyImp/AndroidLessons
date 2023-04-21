package ru.mirea.butakov.s.d.favoritebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {

    private EditText yourbookEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        yourbookEditText = findViewById(R.id.bookEditText);
        Button sendButton = findViewById(R.id.button2);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bookTitle = yourbookEditText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("book_title", bookTitle);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

}
