package patterns.strategy.behaviorstrategies;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying on the rocket!");
    }
}
