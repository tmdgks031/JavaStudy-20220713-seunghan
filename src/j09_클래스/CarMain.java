package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
	
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		

		c1.company = "현대자동차";
		c1.model = "쏘나타";
		c1.color = "화이트";
		
		c2.company = "기아";
		c2.model = "k5";
		c2.color = "블랙";
		
		c3.company = "현대자동차";
		c3.model = "아반떼";
		c3.color = "그레이";

		c1.showCarInfo();
		c2.showCarInfo();
		c3.showCarInfo();
	}

}
