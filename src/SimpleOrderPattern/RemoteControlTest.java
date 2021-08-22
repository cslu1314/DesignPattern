package SimpleOrderPattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();  //遥控器remote是命令调用者

        Light light = new Light();  //这个灯light是命令接收者
        LightOnCommand lightOn = new LightOnCommand(light); //LightOnCommand是命令对象

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);  //命令调用者接收一个命令对象
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
