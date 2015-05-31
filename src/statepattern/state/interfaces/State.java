package statepattern.state.interfaces;

public interface State {
	/**
	 * 投币
	 */
	void insertQuater();
	
	/**
	 * 退币
	 */
	void ejectQuarters();
	
	/**
	 * 转动曲柄
	 */
	void turnCrank();
	
	/**
	 * 发放糖果
	 */
	void dispense();
}
