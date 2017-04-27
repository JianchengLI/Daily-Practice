package perso.daily.dp.command;

public class StackRemoteControlTest {

	public static void main(String[] args) {
		StackRemoteControl remoteControl = new StackRemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
		
		Runnable productor1 = ()-> {
			while(true){
				if (remoteControl.leftCommandsNumber() < 100) {
					remoteControl.pushCommand(lightOnCommand);
				}
				if((remoteControl.leftCommandsNumber() == 100))
					return;
				
			}
		};
		Runnable productor2 = ()-> {
			while(true){
				if (remoteControl.leftCommandsNumber() < 100) {
					remoteControl.pushCommand(garageDoorOpenCommand);
				}
				if((remoteControl.leftCommandsNumber() == 100))
					return;
			}
		};
		
		new Thread(productor1).start();
		new Thread(productor2).start();
		
		Runnable consumer = () -> {
			while(true){
				if (remoteControl.leftCommandsNumber() > 0) {
					remoteControl.butttonWasPressed();
				}
			}
		};
		new Thread(consumer).start();
	}

}
