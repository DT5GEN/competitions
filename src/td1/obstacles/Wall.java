package td1.obstacles;

import td1.skill.Skills;
import td1.skill.Jump;

public class Wall implements Obstacle{

	private int height;
	
	public Wall(int height) {

		this.height = height;
	}

	@Override
	public boolean createObstacle(Skills a) {
		if(!(a instanceof Jump)) {
			return false;	
		}
		else {
			return ((Jump)a).jump(height);
		}
	}

	@Override
	public String toString() {
		return "\n------------------------\n"
				+ "Перепрыгнуть стену в "+height+" метра"+
				"\n------------------------";
	}
	
}
