package patterns.iterator;

import patterns.iterator.builtin.Menu;
import patterns.iterator.inhouse.DinerMenu;
import patterns.iterator.inhouse.PancakeHouseMenu;

public class TestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        WaitressClient waitress = new WaitressClient(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
