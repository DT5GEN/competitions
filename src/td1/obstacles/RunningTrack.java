package td1.obstacles;

import td1.skill.Skills;
import td1.skill.endurance;

public class RunningTrack implements Obstacle{

	private final int distance;
	
	public RunningTrack(int distance) {
		this.distance = distance;
	}

	@Override
	public boolean createObstacle(Skills a) {
		if(!(a instanceof endurance)) {
			return false;	
		}
		else {
			return ((endurance)a).run(distance);
		}
	}


	@Override
	public String toString() {
		return "\n------------------------\n"
				+ "Преодолеть "+distance+" метров"+
				"\n-----------------------";
	}
	
}
