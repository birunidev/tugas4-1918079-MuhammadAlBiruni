package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private ArrayList<Food> foodArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycleview);
        adapter = new FoodAdapter(foodArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        foodArrayList = new ArrayList<>();
        foodArrayList.add(new Food("Menu Pilihan 1", "Albiruni",
                "5 Menit", R.drawable.food_1));
        foodArrayList.add(new Food("Menu Pilihan 2", "Albiruni",
                "5 Menit", R.drawable.food_2));
        foodArrayList.add(new Food("Menu Pilihan 3", "Albiruni",
                "5 Menit", R.drawable.food_3));
        foodArrayList.add(new Food("Menu Pilihan 4", "Albiruni",
                "5 Menit", R.drawable.food_4));
        foodArrayList.add(new Food("Menu Pilihan 5", "Albiruni",
                "5 Menit", R.drawable.food_5));
        foodArrayList.add(new Food("Menu Pilihan 6", "Albiruni",
                "5 Menit", R.drawable.food_6));
        foodArrayList.add(new Food("Menu Pilihan 7", "Albiruni",
                "5 Menit", R.drawable.food_7));
        foodArrayList.add(new Food("Menu Pilihan 8", "Albiruni",
                "5 Menit", R.drawable.food_8));



    }
}