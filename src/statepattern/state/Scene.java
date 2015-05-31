package statepattern.state;

import statepattern.machine.GumballMachine;

public class Scene {

	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(2);
		
		machine.insertQuarter();
		machine.turnCrank();
		
		
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.turnCrank();
	}

}
