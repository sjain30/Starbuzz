package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Drinks.drinks);
        ListView listView = findViewById(R.id.drinks_list);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DrinkCategoryActivity.this, DrinksActivity.class);
                intent.putExtra(DrinksActivity.DrinkId, (int)l);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
