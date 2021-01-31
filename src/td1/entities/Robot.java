package td1.entities;

import td1.skill.endurance;
import td1.skill.Jump;

public class Robot implements endurance, Jump {

	private int power = 10000;
	private int maxJumpHeight=2;

	@Override
	public String toString() {
		return "Робот";
	}



	@Override
	public boolean jump(int height) {
		boolean canJump = height<=maxJumpHeight;
		System.out.println(canJump?"Робот перепрыгнул":"Робот сломался у стены");
		return canJump;
	}



	@Override
	public boolean run(int distance) {
		boolean canRun = power >=distance;
		power -=distance;
		System.out.println(canRun?"Робот доехал":"у робота села батарейка");
		return canRun;
	}
	
	
}
