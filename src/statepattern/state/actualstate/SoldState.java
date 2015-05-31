package statepattern.state.actualstate;

import statepattern.machine.GumballMachine;
import statepattern.state.interfaces.State;

/**
 * 销售糖果状态
 * @author shengyuan
 *
 */
public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("Solding, please wait");
	}

	@Override
	public void ejectQuarters() {
		System.out.println("ejected");
	}

	@Override
	public void turnCrank() {
		System.out.println("You can't turn the crank twice");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Out of gumballs ");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
