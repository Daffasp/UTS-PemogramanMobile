package com.example.beritabola;

public class News {
    private String title;
    private String content;
    private String summary;
    private String imageUrl;  // URL gambar

    // Konstruktor dengan 4 parameter
    public News(String title, String content, String summary, String imageUrl) {
        this.title = title;
        this.content = content;
        this.summary = summary;
        this.imageUrl = imageUrl;  // Menginisialisasi imageUrl
    }

    // Getter untuk title
    public String getTitle() {
        return title;
    }

    // Getter untuk content
    public String getContent() {
        return content;
    }

    // Getter untuk summary
    public String getSummary() {
        return summary;
    }

}
