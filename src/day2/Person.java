package day2;

public class Person {
	
	private boolean isAlive;

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public void kill(){
		setAlive(false);
	}

}
