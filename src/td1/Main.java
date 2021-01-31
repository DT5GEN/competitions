package td1;

import td1.skill.Skills;
import td1.entities.Cat;
import td1.entities.Human;
import td1.entities.Robot;
import td1.obstacles.Obstacle;
import td1.obstacles.RunningTrack;
import td1.obstacles.Wall;

public class  Main {

	public static void main(String[] args) {

		Skills[] participants = {new Cat(), new Human(), new Robot()};
		Obstacle [] obstacles = {new Wall(2), new RunningTrack(1000), 
				new Wall(3), new RunningTrack(1500), new Wall(5)};
		
		for(Obstacle obstacle: obstacles) {
			System.out.println(obstacle);
			for(int i = 0; i<participants.length; i++) {
				if(participants[i] != null) {
					boolean isSucces = obstacle.createObstacle(participants[i]);
					if(!isSucces) {
						participants[i] = null;
					}	
				}
			}
			System.out.print("Прошли испытание :");
			printParticipants(participants);
		}		
	}
	
	public static void printParticipants(Skills[] participants) {
		for(Skills participant: participants) {
			if(participant!=null) {
				System.out.print(" "+participant);
			}
			
		}
	}
		
}
