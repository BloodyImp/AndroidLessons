package ru.mirea.butakov.s.d.looper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import ru.mirea.butakov.s.d.looper.databinding.ActivityLooperBinding;
public class LooperActivity extends AppCompatActivity {

    private ActivityLooperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(binding.getRoot());



        Handler mainThreadHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {

                Log.d(LooperActivity.class.getSimpleName(), "Task execute. This is result: " + msg.getData().getString("result"));
            }
        };
        MyLooper myLooper = new MyLooper(mainThreadHandler);
        myLooper.start();

        binding.btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message msg = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString("KEY", "безработным");
                bundle.putInt("let", 21);
                msg.setData(bundle);
                myLooper.mHandler.sendMessage(msg);
                binding.textView2.setText("Мой номер по списку № 4");
            }
            ;
        });
    }
}