package day2;

public class Tiger extends Cat {
	
	public Tiger(String secretName) {
		super(secretName);
		// TODO Auto-generated constructor stub
	}

	public void maul(Person person) {
		person.kill();
	}
	

}
