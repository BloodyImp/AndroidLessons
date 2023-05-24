package ru.mirea.butakov.s.d.musicplayer;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ru.mirea.butakov.s.d.musicplayer.databinding.ActivityMusicMainBinding;
public class MusicMain extends AppCompatActivity {
    private ActivityMusicMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMusicMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastBack("Запуск предыдущей композиции");
            }
        });
        binding.imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastNext("Запуск следующей композиции");
            }
        });
        binding.imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastPause("Композиция на паузе");
            }
        });
        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastPred("Запуск предыдущего альбома исполнителя");
            }
        });
        binding.imageButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastDal("Запуск следующего альбома исполнителя");
            }
        });

    }

    private void ToastBack(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    private void ToastNext(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    private void ToastPause(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    private void ToastPred(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    private void ToastDal(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}