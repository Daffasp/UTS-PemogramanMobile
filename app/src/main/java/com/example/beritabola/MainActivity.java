package com.example.beritabola;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.ArrayList;
import com.example.beritabola.News; // Import News class

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Contoh penggunaan getDummyNews
        List<News> newsList = getDummyNews();
        // Gunakan newsList untuk menampilkan atau memproses data
    }

    private List<News> getDummyNews() {
        List<News> newsList = new ArrayList<>();

        // Menambahkan data dummy dengan 4 parameter: title, content, summary, dan imageUrl
        newsList.add(new News("Title 1", "Content of the first news", "This is a summary of the first news", "https://example.com/image1.jpg"));
        newsList.add(new News("Title 2", "Content of the second news", "This is a summary of the second news", "https://example.com/image2.jpg"));
        newsList.add(new News("Title 3", "Content of the third news", "This is a summary of the third news", "https://example.com/image3.jpg"));

        return newsList;
    }

}

