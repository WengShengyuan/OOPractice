package statepattern.state.actualstate;

import statepattern.machine.GumballMachine;
import statepattern.state.interfaces.State;

/**
 * 已投币状态
 * @author shengyuan
 *
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		System.out.println("you can't insert another quarter");
	}

	@Override
	public void ejectQuarters() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned crank...");
		gumballMachine.setState(gumballMachine.getSoldState());
		gumballMachine.releaseBall();
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
