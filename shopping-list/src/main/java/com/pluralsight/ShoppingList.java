package com.pluralsight;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("milk");
        items.add("yogurt");
        items.add("bread");
        items.add("cheese");
        items.add("oatmeal");
        items.add("water");
        items.add("cereal");
        items.add("poptarts");
        items.add("candy");
        items.add("pie");

        for(String listItems: items) {
            System.out.println(listItems);
        }



    }
}
