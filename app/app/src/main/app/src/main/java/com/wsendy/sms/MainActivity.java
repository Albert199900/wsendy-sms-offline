package com.wsendy.sms;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.view.View;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean isDarkMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(50, 50, 50, 50);
        layout.setBackgroundColor(Color.WHITE);

        final TextView title = new TextView(this);
        title.setText("WSendy SMS Gateway");
        title.setTextSize(24);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);

        final TextView status = new TextView(this);
        status.setText("Hali ya Mfumo: ONLINE\nInasoma kutoka: https://wsendy.download");
        status.setTextSize(16);
        status.setTextColor(Color.GRAY);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 40, 0, 40);

        Button btnTheme = new Button(this);
        btnTheme.setText("Badili Muonekano (Theme)");

        Button btnSend = new Button(this);
        btnSend.setText("Jaribu Kutuma SMS");

        layout.addView(title);
        layout.addView(status);
        layout.addView(btnTheme);
        layout.addView(btnSend);

        setContentView(layout);

        btnTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDarkMode = !isDarkMode;
                if (isDarkMode) {
                    layout.setBackgroundColor(Color.parseColor("#121212"));
                    title.setTextColor(Color.WHITE);
                    status.setTextColor(Color.LIGHTGRAY);
                } else {
                    layout.setBackgroundColor(Color.WHITE);
                    title.setTextColor(Color.BLACK);
                    status.setTextColor(Color.GRAY);
                }
            }
        });
    }
}
