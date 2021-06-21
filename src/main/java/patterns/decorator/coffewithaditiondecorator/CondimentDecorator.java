package patterns.decorator.coffewithaditiondecorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
    public abstract double getAdditionalFeeForSize(Beverage.Size size);
}
