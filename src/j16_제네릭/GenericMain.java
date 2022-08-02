package j16_제네릭;

import j15_스태틱.싱글톤.Car;

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<Integer, String> genericTest = new GenericTest<Integer ,String>();//int같은 일반자료형으로 못쓰고 Integer이라는 변수로 써야한다
		GenericTest<String, Car> genericTest2 = new GenericTest<String ,Car>();
		
		genericTest.setKey(100);
		genericTest.setValue("원");

		System.out.println(genericTest.getKey() + genericTest.getValue());
	}

}
