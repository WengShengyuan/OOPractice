package methodinvocation;

import methodinvocation.commands.commandImpl.LightOffCommand;
import methodinvocation.commands.commandImpl.LightOnCommand;
import methodinvocation.thing.Light;

public class Scene {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(1, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
		
		System.out.println(remote);
		
		remote.onButtonPushed(1);
		remote.offButtonPushed(1);
		
	}

}
