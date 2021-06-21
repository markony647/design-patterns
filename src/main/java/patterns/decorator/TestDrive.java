package patterns.decorator;

public class TestDrive {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage espressoWithMocha = new Mocha(espresso);
        Beverage espressoWithDoubleMocha = new Mocha(espressoWithMocha);
        Beverage houseBlendWithSoyAndWhip = new HouseBlend();
        houseBlendWithSoyAndWhip = new Soy(houseBlendWithSoyAndWhip);
        houseBlendWithSoyAndWhip = new Whip(houseBlendWithSoyAndWhip);
        System.out.println(espressoWithMocha.cost());
        System.out.println(espressoWithMocha.getDescription());

        System.out.println("=========");

        System.out.println(espressoWithDoubleMocha.cost());
        System.out.println(espressoWithDoubleMocha.getDescription());

        System.out.println("=========");

        System.out.println(houseBlendWithSoyAndWhip.cost());
        System.out.println(houseBlendWithSoyAndWhip.getDescription());


        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + String.format("%.2f", beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + String.format("%.2f", beverage3.cost()));


        Beverage espresso2 = new Espresso();
        espresso2.setSize(Beverage.Size.VENTI);
        Beverage espressoWithMochaGrande2 = new Mocha(espresso2);

        System.out.println(espressoWithMochaGrande2.cost());
        System.out.println(espressoWithMochaGrande2.getDescription());

    }
}
