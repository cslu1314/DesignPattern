package guanjianzi;

public class Pizza {

    public static void main(String[] args) {
        new AA();
    }
}
class AA{
    public static int i =1;
    public static AA aa = new AA();
    private String a = "hello";
    public AA() {
        System.out.println("hello");
    }

    protected void method() {

    }
}

class BB extends AA{
    @Override
    public void method() {

    }
}
