package patterns.decorator.coffewithaditiondecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Size: " + beverage.getSize() + ", Soy";
    }

    public double cost() {
        return .15 + getAdditionalFeeForSize(beverage.getSize()) + beverage.cost();
    }

    @Override
    public double getAdditionalFeeForSize(Size size) {
        if (size.equals(Size.TALL)) {
            return .0;
        }
        if (size.equals(Size.GRANDE)) {
            return .10;
        }
        if (size.equals(Size.VENTI)) {
            return .15;
        }
        return 0;
    }
}
