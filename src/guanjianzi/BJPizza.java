package guanjianzi;

public class BJPizza extends Pizza{
    public int i = 2;
    public static void main(String[] args) {
        Pizza pizza = new BJPizza();
//        System.out.println(pizza.i);
        BJPizza bjPizza = (BJPizza) pizza;
        System.out.println(bjPizza.i);
        System.out.println("============");
        System.out.println(new Pizza() instanceof BJPizza);
        System.out.println(new BJPizza() instanceof Pizza);
        System.out.println(new BJPizza() instanceof BJPizza);
        final int  i =2;

         }
}
