package com.example.beritabola;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private List<News> newsList;
    private Context context;

    public NewsAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.titleTextView.setText(news.getTitle());
        holder.summaryTextView.setText(news.getSummary());

        // Memuat gambar menggunakan Glide
        Glide.with(context)
                .load(news.getImageUrl())  // Menggunakan URL gambar
                .into(holder.newsImageView);

        // Menambahkan listener klik untuk item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("title", news.getTitle());
            intent.putExtra("summary", news.getSummary());
            intent.putExtra("image", news.getImageUrl());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView summaryTextView;
        ImageView newsImageView;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.news_title);
            summaryTextView = itemView.findViewById(R.id.news_summary);
            newsImageView = itemView.findViewById(R.id.news_image);
        }
    }
}
