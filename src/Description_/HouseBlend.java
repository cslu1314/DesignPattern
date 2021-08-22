package Description_;

public class HouseBlend extends Beverage {
    public HouseBlend() {  //混合搅拌咖啡
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;  //价格是 $0.89
    }
}
