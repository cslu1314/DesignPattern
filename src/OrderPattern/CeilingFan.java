package OrderPattern;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    void on() {
        System.out.println(this.name + "Light is On");
    }

    void off() {
        System.out.println(this.name + "Light is off");
    }
}
