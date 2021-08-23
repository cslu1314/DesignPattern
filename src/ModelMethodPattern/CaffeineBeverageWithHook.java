package ModelMethodPattern;

public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourIncup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {   //这就是一个钩子(Hook)！！！子类可以覆盖这个方法，但不见得一定要这么做
        return true;
    }
}
