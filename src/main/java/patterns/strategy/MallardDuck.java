package patterns.strategy;

import patterns.strategy.behaviorstrategies.FlyWithWings;
import patterns.strategy.behaviorstrategies.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
