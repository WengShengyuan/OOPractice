package methodinvocation;

import methodinvocation.commands.commandImpl.NoCommand;
import methodinvocation.commands.commandinterface.Command;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		
		for(int i=0;i < 7 ; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot){
		onCommands[slot].execute();
	}
	
	public void offButtonPushed(int slot){
		offCommands[slot].execute();
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-------Remote Control--------\n");
		for(int i = 0 ; i < 7 ;  i ++){
			sb.append(String.format("slot[%s]: %s | %s \n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
		}
		return sb.toString();
	}
	

}
