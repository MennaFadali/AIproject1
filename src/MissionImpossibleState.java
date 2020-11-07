
public class MissionImpossibleState implements State{
	int x , y , carrying , time , safe , dead, totalDamage;

	public MissionImpossibleState(int x, int y, int carrying, int time, int safe, int dead, int totalDamage) {
		super();
		this.x = x;
		this.y = y;
		this.carrying = carrying;
		this.time = time;
		this.safe = safe;
		this.dead = dead;
		this.totalDamage = totalDamage;
	}
	
	
	
}
