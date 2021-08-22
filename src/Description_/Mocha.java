package Description_;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost(); //要计算Mocha的价钱，首先把调用委托给被装饰对象，以计算价钱，然后再加上Mocha的价钱，得到最后的结果
    }
}
