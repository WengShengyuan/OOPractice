package statepattern.state.actualstate;

import statepattern.machine.GumballMachine;
import statepattern.state.interfaces.State;

/**
 * 赢家状态
 * @author shengyuan
 *
 */
public class WinnerState implements State {

	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarters() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

}
