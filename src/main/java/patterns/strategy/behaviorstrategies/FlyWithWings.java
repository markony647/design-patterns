package patterns.strategy.behaviorstrategies;

import patterns.strategy.behaviorstrategies.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
