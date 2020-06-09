package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class BooksRecyclerViewAdapter extends RecyclerView.Adapter<BooksRecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "BooksRecyclerViewAdapte";

    private ArrayList<Book> books = new ArrayList<>();
    private Context context;

    public BooksRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_book_rec_view,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.bookName.setText(books.get(position).getName());


        holder.bookCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,BookActivity.class);
                intent.putExtra("bookId",books.get(position).getId());
                context.startActivity(intent);
            }
        });

        Glide.with(context)
                .asBitmap()
                .load(books.get(position).getImageUrl())
                .into(holder.bookImage);

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView bookImage;
        private TextView bookName;
        private CardView bookCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
       // Here the simlpe findviewbyid cannot consider because this is not an main file
            bookImage = (ImageView) itemView.findViewById(R.id.bookImage);
            bookName = (TextView) itemView.findViewById(R.id.bookName);
            bookCard = (CardView) itemView.findViewById(R.id.bookCard);
        }
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
        notifyDataSetChanged();
    }
}

