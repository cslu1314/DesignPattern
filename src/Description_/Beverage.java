package Description_;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();  //抽象方法不能使用private\final\static修饰，因为这些关键字都是和重写相违背的
}
