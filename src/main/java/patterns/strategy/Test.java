package patterns.strategy;

import patterns.strategy.behaviorstrategies.FlyNoWay;
import patterns.strategy.behaviorstrategies.FlyRocketPowered;

public class Test {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}
