package statepattern.state.actualstate;

import statepattern.machine.GumballMachine;
import statepattern.state.interfaces.State;

/**
 * 糖果售完状态
 * @author shengyuan
 *
 */
public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("Gumball sold out, don't insert any quarters");
	}

	@Override
	public void ejectQuarters() {
		System.out.println("You must insert one quarter, then I can eject one");
	}

	@Override
	public void turnCrank() {
		System.out.println("Gumball sold out");
	}

	@Override
	public void dispense() {
		System.out.println("Gumball sold out, no gumballs to dispense");
	}

}
