package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinksActivity extends AppCompatActivity {

    public static final String DrinkId = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        int drinkId = (Integer) getIntent().getExtras().get(DrinkId);

        Drinks drink = Drinks.drinks[drinkId];

        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageresource());
        photo.setContentDescription(drink.getName());
    }
}
