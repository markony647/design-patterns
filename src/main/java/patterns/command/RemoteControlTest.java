package patterns.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();

        remoteControl.setCommand(new MusicOnCommand());
        remoteControl.buttonPressed();
    }
}
