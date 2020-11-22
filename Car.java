package pethomework;

public class Car {
	
	private int speed;
	private String color;
	private String age;
	private Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Car(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
	private Car(int speed, String color, String age) {
		super();
		this.speed = speed;
		this.color = color;
		this.age = age;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public boolean doubleAge(int age){
		if(age>20){
			return true;
		}else {
			return false;
		}
		}
		
		
		public String color1(String color1){
			return color1;
			}
		
	}

	
	
}
