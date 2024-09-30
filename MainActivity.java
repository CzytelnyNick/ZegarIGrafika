package com.example.clock;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        
            TextView textView = findViewById(R.id.textView2);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

            ImageView imageView = findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.zdj2);
            Handler handler = new Handler();

            Runnable runable = new Runnable() {

                @Override
                public void run() {
                    Date date = new Date();
                    String t = simpleDateFormat.format(date);
                    textView.setText(t);
                    handler.postDelayed(this, 1000);
                }
            };
            handler.post(runable);
    }
    protected void
}