package ru.mirea.butakov.s.d.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment firstfragment, secondfragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstfragment = new FirstFragment();
        secondfragment = new SecondFragment();
    }
    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()){
            case R.id.btnFragment1:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        firstfragment).commit();
                break;
            case R.id.btnFragment2:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        secondfragment).commit();
                break;
            default:
                break;
        }
    }
}