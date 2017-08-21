package com.example.hp.prueba2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.hp.prueba2.BookClickListener;
import com.example.hp.prueba2.R;
import com.example.hp.prueba2.data.Queries;
import com.example.hp.prueba2.models.Book;

import java.util.List;

/**
 * Created by HP on 20-08-2017.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {
    private List<Book> books = new Queries().books();

    private BookClickListener listener;

    public BooksAdapter(BookClickListener listener) {
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_book, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Book book = books.get(position);
        holder.textView.setText(book.getName());
        holder.textView.setText(book.getAuthor());
        holder.textView.setText(book.getReview());
        holder.seekBar.setProgress(book.getProgress());
        holder.seekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Book auxBook=books.get(holder.getAdapterPosition());
                listener.clickedID(auxBook.getId());
            }
        });

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public void update(Book book){
        books.add(book);
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private SeekBar seekBar;
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            seekBar = (SeekBar) itemView.findViewById(R.id.userSb);
            textView = (TextView) itemView.findViewById(R.id.userTv);
        }
    }
}
