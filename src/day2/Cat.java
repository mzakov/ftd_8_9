package day2;

public class Cat implements Pet {
	void scrach() {
		
	}

	@Override
	public double wasteTimeAndMoney(int hours) {
		// TODO Auto-generated method stub
		return 50* hours;
	}
	
	private String secretName = "Mr.Jingles";
	
	public String getSecretName() {
		return secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
	}

	public Cat(String secretName) {
		super();
		this.secretName = secretName;
	}
	

}
