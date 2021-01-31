

package td1.entities;

import td1.skill.endurance;
import td1.skill.Jump;

public class Human implements endurance, Jump {

	private int remainedDistanceForToday=10000;
	private int maxJumpHeight=2;

	@Override
	public String toString() {
		return "Человек";
	}


	@Override
	public boolean jump(int height) {
		boolean canJump = height<=maxJumpHeight;
		System.out.println(canJump?"Человек перепрыгнул":"Человек расшиб голову о стену");
		return canJump;
	}


	@Override
	public boolean run(int distance) {
		boolean canRun = distance<=remainedDistanceForToday;
		remainedDistanceForToday-=distance;
		System.out.println(canRun?"Человек осилил путь":"Человек упал где-то позади");
		return canRun;
	}	
}
