package com.example.hp.prueba2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.prueba2.adapters.BooksAdapter;
import com.example.hp.prueba2.models.Book;

/**
 * A placeholder fragment containing a simple view.
 */
public class BooksFragment extends Fragment  implements BookClickListener{

    private BooksAdapter adapter;
    public BooksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bookRv);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        for (int i = 0; i < 2; i++) {
            Book book = new Book();
            book.setName(String.valueOf(i));
            book.setProgress((i * 20));
            book.setAuthor("marcela paz");
            book.save();
        }


        adapter = new BooksAdapter(this);
        recyclerView.setAdapter(adapter);


    }
    public void updateList(Book book){
        adapter.update(book);

    }

    @Override
    public void clickedID(long id) {

    }
}
