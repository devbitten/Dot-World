
public class Protagonist {
	//variables that the protagonist has
	//(Note radius is defined by angle relative to the negative y-axis
	private double mapX, mapY, currentDirection;
	private int currentSpeed, currentHealth, maxHealth,
			secondsAlive, radius;
	
	public Protagonist(int x, int y, int r){
		//variables set up by constructor
		mapX = x;
		mapY = y;
		radius = r;
		
		//variables that have default initial values
		currentHealth = 100;
		maxHealth = 100;
		currentDirection = 0;
		currentSpeed = 0;
		secondsAlive = 0;
	
	}
	
	/* Returns the stored value for the 
	 * X coordinate of the Protagonist
	 */
	public double getMapX() {
		return mapX;
	}
	
	//Updates the Y coordinate for the Protagonist
	public void setMapX(double mapX) {
		this.mapX = mapX;
	}

	/* Returns the stored value for the 
	 * Y coordinate of the Protagonist
	 */
	public double getMapY() {
		return mapY;
	}
	
	//Updates the Y coordinate for the Protagonist
	public void setMapY(double mapY) {
		this.mapY = mapY;
	}
	
	//Returns the value stored for currentDirection
	public double getCurrentDirection() {
		return currentDirection;
	}
	
	//Updates the value stored for currentDirection
	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	//Returns current value stored for currentHealth
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	//Increases/decreases currentHealth by the argument
	public void setCurrentHealth(int h) {
		this.currentHealth += h;
	}
	
	//Returns value stored for maxHealth
	public int getMaxHealth() {
		return maxHealth;
	}
	
	//Increases maxHealth by 10
	public void setMaxHealth() {
		this.maxHealth += 10;
	}
	
	//Returns the value strode for secondsAlive
	public int getSecondsAlive() {
		return secondsAlive;
	}
	
	//Increments the secondsAlive variable by 1
	public void setSecondsAlive() {
		this.secondsAlive += 1;
	}
	
	//Returns the initial value for radius
	public int getRadius() {
		return radius;
	}
	
	//Will set the current speed to 1
	public void setCurrentSpeed() {
		this.currentSpeed = 1;
	}

}
