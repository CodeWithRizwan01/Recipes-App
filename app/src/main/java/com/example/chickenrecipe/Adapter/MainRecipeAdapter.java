package com.example.chickenrecipe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chickenrecipe.Model.Data;
import com.example.chickenrecipe.Model.MainRecipeModel;
import com.example.chickenrecipe.R;

import java.util.ArrayList;

public class MainRecipeAdapter extends RecyclerView.Adapter<MainRecipeAdapter.ViewHolder>{
    Context context;
    ArrayList<MainRecipeModel> mainRecipeModels;
    public MainRecipeAdapter(Context context, ArrayList<MainRecipeModel> mainRecipeModels) {
        this.context = context;
        this.mainRecipeModels = mainRecipeModels;
    }

    MainRecipeAdapter.onItemClickListener onItemClickListener;
    public void setOnItemClickListener(MainRecipeAdapter.onItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


    @NonNull
    @Override
    public MainRecipeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.main_list, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull MainRecipeAdapter.ViewHolder holder, int position) {
        MainRecipeModel model = mainRecipeModels.get(position);
        holder.itemImage.setImageResource(model.getRecipeImage());
        holder.itemTitle.setText(model.getRecipeTitle());
    }

    @Override
    public int getItemCount() {
        return mainRecipeModels.size();
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
        }
    }
        public interface onItemClickListener {
            void onItemClick(View view, int position);
        }
}