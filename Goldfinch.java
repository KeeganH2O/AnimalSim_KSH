
public class Goldfinch extends Animal implements Flyable, Walkable{
	double wingSpan;
	Location l = new Location();
	
	/** 
	 * empty constructor sets:
	 * simID, location, full, rested, wingSpan
	 */
	public Goldfinch()throws InvalidCoordinateException{
		simID = 0;
		location = l; 
		full= false;
		rested = true;
		wingSpan = 9.0;
	}
	
	/**
	 * preferred constructor passes simID, l (location), and ws (wingspan)
	 * and assigns it to variables simID, location, wingSpan
	 * sets full to false and rested to true
	 * @param simID
	 * @param l
	 * @param ws
	 */
	public Goldfinch(int simID, int x,int y, double ws)throws InvalidCoordinateException, InvalidWingspanException{
		this.simID = simID;
		location = l;
		setWingSpan(ws);
		full = false;
		rested = true;
	}
	
	/**
	 * implemented methods b/c walks and flys 
	 * fly goes straight to location
	 * walk goes 1 step in each direction
	 */
	public void Fly(int x, int y) {
		try {
		if(x>0 && y>0) {
			location.update(x, y);
		}
		else {
			throw new InvalidCoordinateException("can't have a coord bellow 0 (Cannot go to hell)");
		}
		}
		catch(InvalidCoordinateException e) {
			e.printStackTrace();
		}
	}
	public void walk(int direction) {
		
		int a = location.getX();
		int b = location.getY();
		
		if(direction == 1)  {
			location.update(a+1,b);
		}
		else if(direction == 2) {
			location.update(a, b+1);
		}
	}
	
	/**
	 * getter and setter for wingSpan
	 */
	
	//getters and setters for wingSpan
	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		try {
			if(wingSpan < 5.0 || wingSpan > 11.0) {
				throw new InvalidWingspanException("Too big/small of a wingspan to be a finch");
			}
			else{
				this.wingSpan = wingSpan;
			}
		}//end try
		catch(InvalidWingspanException e) {
			e.printStackTrace();
		}
	}//end setter
	
}
