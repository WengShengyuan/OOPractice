package methodinvocation.commands.commandImpl;

import methodinvocation.commands.commandinterface.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No Commands");
	}

}
