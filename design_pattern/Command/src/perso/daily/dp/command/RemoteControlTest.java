package perso.daily.dp.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
		
		remote.setCommand(lightOnCommand);
		remote.butttonWasPressed();
		remote.setCommand(garageDoorOpenCommand);
		remote.butttonWasPressed();
	}

}
