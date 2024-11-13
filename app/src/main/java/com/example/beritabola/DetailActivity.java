package com.example.beritabola;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String summary = intent.getStringExtra("summary");

        // Mengatur judul dan isi berita pada TextView
        TextView titleTextView = findViewById(R.id.detail_title);
        TextView summaryTextView = findViewById(R.id.detail_summary);

        titleTextView.setText(title);
        summaryTextView.setText(summary);
    }
}
