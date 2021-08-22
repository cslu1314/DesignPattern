package Description_;

public class Espresso extends Beverage{

    public Espresso() {   //浓缩咖啡
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
