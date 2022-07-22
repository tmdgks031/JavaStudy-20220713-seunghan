package j09_클래스;
/*
 * 클래스: Car
 * 변수 
 * 		company
 * 		model
 * 		color
 * 
 * 메소드 
 * 		showCarInfo()
 * 			회사명: 000
 * 			모델명: 000
 * 			색상: 	000
 * 
 * 3대
 * 현대자동차
 * 쏘나타
 * 화이트
 * 
 * 기아
 * k5
 * 블랙
 * 
 * 현대자동차
 * 아반떼
 * 그레이
 * 
 */

public class Car {
	String company;
	String model;
	String color;

	Car() {
		// 생성자는 무조건 주소값을 리턴한다.
		System.out.println("생성자 호출?");
	}

	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}

}
