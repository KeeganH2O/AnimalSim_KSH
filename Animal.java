import java.util.Random;
public abstract class Animal extends Location{
	protected int simID;
	protected Location location = new Location();
	protected boolean full;
	protected boolean rested; 
	
	/**
	 * empty contructor sets all data to default (0) values
	 * @throws InvalidCoordinateException 
	 */
	public Animal() throws InvalidCoordinateException{
		simID = 0;
		location.update(0,0);
		full = false;
		rested = true;
	}
	
	/**
	 * takes in int simID and Location l and passes that onto simID and location
	 * @param simID
	 * @param l
	 * also makes full false and rested true
	 */
	public Animal(int simID,int x, int y)throws InvalidCoordinateException{
		this.simID = simID;
		location.update(x, y);;
		location.update(1,1);
		full = false;
		rested = true;
	}
	
	/**
	 * makes random and sees if less than or == 0.5 if so then full is false.
	 * if not then full becomes true.
	 * returns full
	 * @return 
	 */
	public boolean eat(){
		Random rand = new Random();
		double ratio = rand.nextDouble();
		if(ratio >= 0.5) {
			full = false;
		}
		else {
			full = true;
		}
		return full;
	}
	
	/**
	 * makes random and checks if less than or == 0.5 if so then rested is false
	 * if not then rested becomes true
	 * returns rested
	 * @return
	 */
	public boolean sleep() {
		Random rand2 = new Random();
		double ratio2 = rand2.nextDouble();
		if(ratio2 <= 0.5) {
			rested = false;
		}
		else {
			rested = true;
		}
		return rested;
	}
	
	/**
	 * Getters and Setters for 
	 * SimID, location, full, rested
	 */
	//Getters and Setters for all variables
	public int getSimID() {
		return simID;
	}

	public void setSimID(int simID) {
		try {
			if(simID < 0) {
				throw new SimIDException("Not a valid Sim ID, needs to be greater than 0");
			}
			else {
				this.simID = simID;
			}
		}
		catch(SimIDException e) {
			e.printStackTrace();
		}
	}

	public String getLocation() {
		return location.getCoordinates();
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public boolean isRested() {
		return rested;
	}

	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
	
	
	
}
