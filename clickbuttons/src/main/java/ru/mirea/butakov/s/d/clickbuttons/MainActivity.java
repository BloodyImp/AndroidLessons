package ru.mirea.butakov.s.d.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button buttonWhoAmI;
    private Button buttonItsNotme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonWhoAmI = findViewById(R.id.btnWhoAmI);
        buttonItsNotme = findViewById(R.id.btnItsNotme);

        //View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvOut.setText("Мой номер по списку №4");
//            }
//        };
//        // Присвоим обработчик кнопке WhoAmI:
//        buttonWhoAmI.setOnClickListener(oclBtnWhoAmI);



//            View.OnClickListener oclBtnItsNotme = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvOut.setText("Это не я сделал!");
//            }
//        };
//        // Присвоим обработчик кнопке ItsNotMe:
//       buttonItsNotme.setOnClickListener(oclBtnItsNotme);
//
    }


      public void onClickWhoAmIiButton(View view)
      {
          tvOut.setText("Мой номер по списку №4");
      }
      public void onClickItsNotmeButton(View view) {tvOut.setText("Это не я сделал!");}
}