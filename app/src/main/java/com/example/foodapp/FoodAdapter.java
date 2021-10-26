package com.example.foodapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class FoodAdapter extends
        RecyclerView.Adapter<FoodAdapter.MahasiswaViewHolder> {
    private ArrayList<Food> dataList;

    public FoodAdapter(ArrayList<Food> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public FoodAdapter.MahasiswaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_makanan, parent, false);
        return new MahasiswaViewHolder(view);
    }

    public void onBindViewHolder(MahasiswaViewHolder holder, int
            position) {
        holder.txtName.setText(dataList.get(position).getName());
        holder.txtAuthor.setText(dataList.get(position).getAuthor());
        holder.txtTime.setText(dataList.get(position).getTime());

        holder.imvFood.setBackgroundResource(dataList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends
            RecyclerView.ViewHolder {
        private TextView txtName, txtAuthor, txtTime;
        private ImageView imvFood;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView)
                    itemView.findViewById(R.id.txt_name);
            txtAuthor = (TextView)
                    itemView.findViewById(R.id.txt_author);
            txtTime = (TextView)
                    itemView.findViewById(R.id.txt_time);
            imvFood = (ImageView)
                    itemView.findViewById(R.id.imv_food);
        }
    }
}

