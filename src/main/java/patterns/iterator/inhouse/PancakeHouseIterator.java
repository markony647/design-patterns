package patterns.iterator.inhouse;

import java.util.List;

public class PancakeHouseIterator implements IhHouseIterator {
    private final List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
