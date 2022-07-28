package j09_클래스3;

public class Person {
	private String name;
	private int age;

	public Person() { //기본생성자는 넣어줄게없을때나 넣기싫어서 setter을 쓸때 사용한다
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name; //this는 자기자신의 주소
		this.age = age;
	}
	
//	public void test() {
//		System.out.println(name); //이 name은 바로 위에 클래스의 name이랑 상관없다. 
//		
//		String name ="김준일"; //별개의 name을 찍고난후에
//		System.out.println(this.name); // 맨위에 name을 쓰고싶으면 this를 찍는다.
//	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}
	
}
