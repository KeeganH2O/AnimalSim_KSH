
public class Location {
	int xCoord, yCoord;
	
	/**
	 * sets x and y Coord to 0
	 */
	public Location(){
		xCoord = 0;
		yCoord = 0;
		
	}
	
	/**
	 * passes these two parameters in and assigns them to respective
	 * x and y Coord variables
	 * @param x
	 * @param y
	 */
	public Location(int x, int y) {
		try {
		if(x < 0 || y < 0) {
			throw new InvalidCoordinateException("one or both Coords are less than 0");
		}
		else {
			xCoord = x;
			yCoord = y;
		}
		}
		catch(InvalidCoordinateException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * passes in these two params and assigns them to x and y Coord (updating them to actual value)
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		try {
		if(x < 0|| y < 0) {
			throw new InvalidCoordinateException("One or both Coords are less than 0");
		}
		else {
		xCoord = x;
		yCoord = y;
		}
		}
		catch(InvalidCoordinateException e){
			e.printStackTrace();
		}
	}
	public int getX() {
		return xCoord;
	}
	public int getY() {
		return yCoord;
	}
	
	public String getCoordinates() {
		StringBuilder sb = new StringBuilder("");
		sb.append("x:" + this.xCoord + " y:"+ this.yCoord);
		String end = sb.toString();
		return end;
	}
	
}
