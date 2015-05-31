package methodinvocation.commands.commandImpl;

import methodinvocation.commands.commandinterface.Command;
import methodinvocation.thing.Light;

public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
