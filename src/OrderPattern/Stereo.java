package OrderPattern;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    void on() {
        System.out.println(this.name + "Light is On");
    }

    void off() {
        System.out.println(this.name + "Light is off");
    }

    void setCD() {
        System.out.println(this.name + "stereo is set for CD input");
    }
    void setVolume() {
        System.out.println(this.name + "stereo volume set to 11");
    }
}
