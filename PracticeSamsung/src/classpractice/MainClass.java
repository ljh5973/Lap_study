package classpractice;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1=new Person("이",25);
		
		Car c1=new Car("소나타",1515,p1);
		
		Car c2= new Car();
		
		
		c2.carName="aa";
		
		System.out.println(c2.carName);
		
		System.out.println(c1.oner.name);
		System.out.println(c1.carName);
		System.out.println(c1.toString());
		
		c1.speedUp(5);
		System.out.println(c1.carSpeed);
		c1.speedUp(3);
		System.out.println(c1.carSpeed);
		
		
	}
}
