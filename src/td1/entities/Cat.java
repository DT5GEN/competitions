package td1.entities;

import td1.skill.endurance;
import td1.skill.Jump;

public class Cat implements endurance, Jump {
	
	private int remainedDistanceForToday=5000;
	private int maxJumpHeight=5;
	

	@Override
	public String toString() {
		return "Кот ";
	}


	@Override
	public boolean jump(int height) {
		boolean canJump = height<=maxJumpHeight;
		System.out.println(canJump?"Кот перепрыгнул":"Кот не перепрыгнул");
		return canJump;
	}


	@Override
	public boolean run(int distance) {
		boolean canRun = distance<=remainedDistanceForToday;
		remainedDistanceForToday-=distance;
		System.out.println(canRun?"Кот пробежал":"Кот потерялся..");
		return canRun;
	}
		
}
