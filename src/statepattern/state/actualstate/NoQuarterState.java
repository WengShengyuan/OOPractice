package statepattern.state.actualstate;

import statepattern.machine.GumballMachine;
import statepattern.state.interfaces.State;

/**
 * 等待投币状态
 * @author shengyuan
 *
 */
public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarters() {
		System.out.println("You haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You must insert a quarter to get candy");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
