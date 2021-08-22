package Description_;

public class StartbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
//        System.out.println(beverage2.getClass());
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getClass());
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
