package patterns.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + getAdditionalFeeForSize(beverage.getSize()) + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Size: " + beverage.getSize() + ", Mocha";
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
