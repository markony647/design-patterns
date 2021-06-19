package patterns.strategy.behaviorstrategies;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack!");
    }
}
