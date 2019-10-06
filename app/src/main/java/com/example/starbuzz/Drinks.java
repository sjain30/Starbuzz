package com.example.starbuzz;

public class Drinks {
    private String name;
    private String description;
    private int imageresource;

    public static final Drinks[] drinks = {
            new Drinks("Latte","A couple of espresso shots with streamed milk", R.drawable.latte),
            new Drinks("Cappuccino","Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drinks("Filter","Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drinks(String name, String description, int imageresource)
    {
        this.name=name;
        this.description=description;
        this.imageresource=imageresource;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getImageresource()
    {
        return imageresource;
    }

    public String toString()
    {
        return this.name;
    }
}
