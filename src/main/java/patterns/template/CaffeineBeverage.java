package patterns.template;

public abstract class CaffeineBeverage {

    abstract void brew();

    abstract void addCondiments();

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
