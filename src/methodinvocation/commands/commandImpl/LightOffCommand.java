package methodinvocation.commands.commandImpl;

import methodinvocation.commands.commandinterface.Command;
import methodinvocation.thing.Light;

public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}
