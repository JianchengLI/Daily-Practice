package perso.daily.dp.command;

public class LightOnCommand implements Command {
	
	private Light _light;
	
	public LightOnCommand(Light light) {
		this._light = light;
	} 
	@Override
	public void execute() {
		_light.on();
	}
	
	@Override
	public void undo() {
		_light.off();
	}

}
