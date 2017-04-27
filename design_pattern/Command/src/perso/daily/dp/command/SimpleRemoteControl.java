package perso.daily.dp.command;

public class SimpleRemoteControl {
	private Command _slot;
	
	public SimpleRemoteControl(){
	}
	
	public void setCommand(Command command){
		this._slot = command;
	}
	
	public void butttonWasPressed(){
		_slot.execute();
	}
	
	public void buttonUndoPressed(){
		_slot.undo();
	}
}
