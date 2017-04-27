package perso.daily.dp.command;

import java.util.Stack;

public class StackRemoteControl {
	private Stack<Command> _commands;
	
	public StackRemoteControl() {
		_commands = new Stack<>();
	}

	public void pushCommand(Command command){
		_commands.push(command);
	}
	
	public int leftCommandsNumber(){
		return _commands.size();
	}
	
	public void butttonWasPressed(){
		while (!_commands.isEmpty()) {
			_commands.pop().execute();
			System.out.println("Commands left: " + _commands.size());
		}
	}
}
