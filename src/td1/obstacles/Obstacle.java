package td1.obstacles;

import td1.skill.Skills;

public interface Obstacle {
	default boolean createObstacle(Skills a) {
		return false;
	}
}
