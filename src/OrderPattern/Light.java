package OrderPattern;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    void on() {
        System.out.println(this.name + "Light is On");
    }

    void off() {
        System.out.println(this.name + "Light is off");
    }
}
