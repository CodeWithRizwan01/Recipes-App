package com.example.chickenrecipe.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.chickenrecipe.DbHelper.DbHelper;
import com.example.chickenrecipe.Model.Data;
import com.example.chickenrecipe.R;

import java.util.ArrayList;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.ViewHolder> {

    Context context;
    ArrayList<Data> dataList;
    DbHelper dbHelper;

    public RecipesAdapter(Context context, ArrayList<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
        dbHelper = DbHelper.getInstance(context);
    }

    onItemClickListener onItemClickListener;
    public void setOnItemClickListener(RecipesAdapter.onItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    onFavoriteIconClickListener onFavoriteIconClickListener;

    public void setOnFavoriteIconClickListener(RecipesAdapter.onFavoriteIconClickListener onFavoriteIconClickListener) {
        this.onFavoriteIconClickListener = onFavoriteIconClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.list_item_recipe, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data data = dataList.get(position);
        holder.itemImage.setImageResource(data.getRecipeImage());
        holder.itemTitle.setText(data.getRecipeTitle());
        holder.itemCalories.setText(data.getCalories());
        holder.itemTime.setText(data.getCockingTime());

        boolean isFavourite = dbHelper.isDataExists(dataList.get(position).getRecipeTitle());
        if (isFavourite) {
            holder.itemFavorite.setImageResource(R.drawable.baseline_favorite_fill_red_24);
        } else {
            holder.itemFavorite.setImageResource(R.drawable.baseline_favorite_outline_black_24);
        }

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void filterList(ArrayList<Data> filteredList) {
        dataList = filteredList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage, itemFavorite;
        TextView itemTitle, itemCalories, itemTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.ivItemImage);
            itemFavorite = itemView.findViewById(R.id.ivItemFavorite);
            itemTitle = itemView.findViewById(R.id.tvItemTitle);
            itemCalories = itemView.findViewById(R.id.tvDetailCalories);
            itemTime = itemView.findViewById(R.id.tvDetailTime);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(itemView, getAdapterPosition());
                    }
                }
            });

            itemFavorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onFavoriteIconClickListener != null) {
                        onFavoriteIconClickListener.onFavoriteIconClick(itemFavorite, getAdapterPosition());
                    }
                }
            });

        }
    }

    public interface onItemClickListener {
        void onItemClick(View view, int position);
    }

    public interface onFavoriteIconClickListener {
        void onFavoriteIconClick(View view, int position);
    }

}
