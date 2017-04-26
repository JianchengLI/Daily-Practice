package perso.daily.dp.command;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor _door;
	
	public GarageDoorOpenCommand(GarageDoor door) {
		_door = door;
	}
	@Override
	public void execute() {
		_door.open();
	}

}
