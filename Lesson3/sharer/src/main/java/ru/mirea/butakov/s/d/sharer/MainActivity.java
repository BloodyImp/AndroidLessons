package ru.mirea.butakov.s.d.sharer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickNewActivity(View view)
    {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("*/*");
        startActivityForResult(intent, 1);
    }
    public void onClickNewActivity2(View view)
    {
        Intent intent = new Intent(this, ShareActivity.class);
        startActivity(intent);
    }
}