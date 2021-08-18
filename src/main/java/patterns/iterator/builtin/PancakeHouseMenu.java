package patterns.iterator.builtin;

import patterns.iterator.inhouse.IhHouseIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, and toast", false,
                2.99);


        addItem("Blueberry Pancakes",
                "Pancakes with scrambled eggs, and toast", true,
                3.49);


        addItem("Waffles",
                "Your choise", true,
                3.59);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
