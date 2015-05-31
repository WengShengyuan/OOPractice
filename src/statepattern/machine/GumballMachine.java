package statepattern.machine;

import statepattern.state.actualstate.HasQuarterState;
import statepattern.state.actualstate.NoQuarterState;
import statepattern.state.actualstate.SoldOutState;
import statepattern.state.actualstate.SoldState;
import statepattern.state.interfaces.State;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	
	public GumballMachine(int initCandy){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = initCandy;
		if(initCandy > 0){
			state = noQuarterState;
		}
		
	}
	
	public void insertQuarter(){
		state.insertQuater();
	}
	
	public void ejectQuarters(){
		state.ejectQuarters();
	}
	
	public void turnCrank(){
		state.turnCrank();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out");
		if(count != 0){
			count = count -1;
		}
		if(count > 0){
			this.state = noQuarterState;
		} else {
			this.state = soldOutState;
		}
	}
	
	
	

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getCount() {
		return count;
	}

	
}
