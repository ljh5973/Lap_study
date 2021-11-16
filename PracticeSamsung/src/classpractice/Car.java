package classpractice;

public class Car implements CarMain{

	
	String carName;
	int carNum;
	Person oner;
	
	int carSpeed;
	
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String carName, int i, Person oner) {
		super();
		this.carName = carName;
		this.carNum = i;
		this.oner = oner;
	}
	
	public String toString() {
		
		
		return "carName = "+carName+"\ncarNum = "+carNum+"\nonerName = "+oner.name+"\nonerAge = "+oner.age;
		
	}

	@Override
	public void speedUp(int speed) {

		System.out.println("속도를 올립니다.");
		carSpeed+=speed;
		
	}

	@Override
	public void speedDown() {
		System.out.println("속도를 낮춥니다.");
		carSpeed--;
	}

	
}
