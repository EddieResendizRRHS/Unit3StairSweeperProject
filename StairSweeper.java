import kareltherobot.*; 

public class StairSweeper extends UrRobot
{
	public StairSweeper()
	{
		super(1, 1, East, 0);
	}
	
	public StairSweeper(int st, int ave, Direction d, int n)
	{
		super(st, ave, d, n);
	}
	
	public void stepUp()
	{
		turnLeft(); 
		move(); 
		turnRight(); 
		move(); 
		pickBeeper(); 
	}
	
	public void turnRight()
	{
		turnLeft(); 
		turnLeft(); 
		turnLeft(); 
	}
	
	public void sweepStairs()
	{
		stepUp(); 
		stepUp(); 
		stepUp(); 
		turnOff(); 
	}
}
