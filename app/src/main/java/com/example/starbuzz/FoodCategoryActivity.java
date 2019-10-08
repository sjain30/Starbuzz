package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);
        ArrayAdapter<Foods> listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Foods.foods);
        ListView listView = findViewById(R.id.food_list);
        listView.setAdapter(listAdapter);
        /*
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FoodCategoryActivity.this, FoodsActivity.class);
                intent.putExtra(FoodsActivity.FoodId, (int)l);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
        */
    }
}
