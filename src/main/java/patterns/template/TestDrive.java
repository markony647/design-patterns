package patterns.template;

public class TestDrive {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n");

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
