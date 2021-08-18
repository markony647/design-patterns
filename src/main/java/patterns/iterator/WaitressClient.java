package patterns.iterator;

import patterns.iterator.builtin.Menu;
import patterns.iterator.inhouse.DinerMenu;
import patterns.iterator.inhouse.IhHouseIterator;
import patterns.iterator.inhouse.MenuItem;
import patterns.iterator.inhouse.PancakeHouseMenu;

import java.util.Iterator;

public class WaitressClient {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    private Menu builtinPancakeHouseMenu;
    private Menu builtinDinerMenuMenu;

    public WaitressClient(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public WaitressClient(Menu builtinPancakeHouseMenu, Menu builtinDinerMenuMenu) {
        this.builtinPancakeHouseMenu = builtinPancakeHouseMenu;
        this.builtinDinerMenuMenu = builtinDinerMenuMenu;
    }

    public void printMenu() {
        IhHouseIterator pancakeIterator = pancakeHouseMenu.createIterator();
        IhHouseIterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        printMenu(dinerIterator);

    }

    public void printMenuBuiltIn() {
        Iterator<patterns.iterator.builtin.MenuItem> builtinPancakeHouseMenuIterator = builtinPancakeHouseMenu.createIterator();
        Iterator<patterns.iterator.builtin.MenuItem> builtinDinerMenuMenuIterator = builtinDinerMenuMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(builtinPancakeHouseMenuIterator);

        System.out.println("\nLUNCH");
        printMenu(builtinDinerMenuMenuIterator);

    }

    private void printMenu(IhHouseIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
