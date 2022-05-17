package com.example.edittext;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MySecondAdapter extends RecyclerView.Adapter<MySecondAdapter.MyViewHolder> {

    int[] imageResources;

    public MySecondAdapter(int[] imageResources) {
        this.imageResources = imageResources;
    }


    @NonNull
    @Override
    public MySecondAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design_for_viewpager2,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MySecondAdapter.MyViewHolder holder, int position) {

        holder.mg.setBackgroundResource(imageResources[position]);

    }

    @Override
    public int getItemCount() {
        return imageResources.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView mg;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mg=itemView.findViewById(R.id.image);

        }
    }
}
