
public class BrownBear extends Animal{
	String subSpecies; 
	String[] subSpeciesList = {"Alaskan","Asiatic","European","Grizzly","Kodiak","Siberian"};
	Location l = new Location();
	
	/**
	 * This empty argument constructor sets all to 0 (or base values)
	 * simID, location to zero
	 * full to false, rested to true
	 * subSpecies to "Alaskan"
	 */
	public BrownBear()throws InvalidCoordinateException{
		simID = 0;
		location = l;
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}
	
	/**
	 * This constructor (prefered) takes in simID, l, and subSpecies and assigns it to each respective
	 * simID, location, and subSpecies variable within BrownBear class.
	 * also sets full to false and rested to true
	 * @param simID
	 * @param l
	 * @param subSpecies
	 * @throws InvalidCoordinateException
	 */
	
	public BrownBear(int simID, Location l, String subSpecies) throws InvalidCoordinateException, InvalidSubspeciesException{
		this.simID = simID;
		location = l;
		setSubSpecies(subSpecies);
		full = false;
		rested = true;
	}
	
	/**
	 * implements walk and swim methods
	 * walk goes 1 unit in direction desired
	 * swim goes 2 units in direction desired
	 */
	
	public void walk(int direction){
		
		int a = location.getX();
		int b = location.getY();
		
		if(direction == 1)  {
			location.update(a+1,b);
		}
		else if(direction == 2) {
			location.update(a, b+1);
		}
	}
	public void swim(int direction) {
		
		int a = location.getX();
		int b = location.getY();
		
		if(direction == 1)  {
			location.update(a+2,b);
		}
		else if(direction == 2) {
			location.update(a, b+2);
		}
	}
	//getters and setters
	/**
	 * these are the getters and setters for subSpecies
	 **/
	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies){
		
		int a = 0;
		
		
		
			for(int i = 0; i < subSpeciesList.length;i++) {
				//System.out.println(subSpeciesList[i]);
				//System.out.println(subSpeciesList.length);
				//System.out.println(subSpecies.compareTo(subSpeciesList[i]));
				if(subSpecies.compareTo(subSpeciesList[i]) == 0){
					this.subSpecies = subSpeciesList[i];
					a = 1;
				}//end if loop
			}//end for
			
			try {
				if(a == 1) {
					
				}
				else {
					throw new InvalidSubspeciesException("not a proper subspecies");
				}
				
			}
			catch(InvalidSubspeciesException e) {
				e.printStackTrace();
			}
			
	}//end setter method
				
} //end class

