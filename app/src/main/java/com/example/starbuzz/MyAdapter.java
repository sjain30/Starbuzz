package com.example.starbuzz;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

//    private List<Foods> foodsList;
    private Context context;

    public MyAdapter(Context context) {
//        this.foodsList = foodsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Foods food =Foods.foods[position];
        holder.imageView.setImageResource(food.getImageresource());
        holder.textView.setText(food.getName());
    }

    @Override
    public int getItemCount() {
        return Foods.foods.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public EditText textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView2);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
