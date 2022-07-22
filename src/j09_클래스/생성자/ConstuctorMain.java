package j09_클래스.생성자;

public class ConstuctorMain {

	public static void main(String[] args) {
		ConstuctorEx constuctorEx1 = new ConstuctorEx();
		ConstuctorEx constuctorEx2 = new ConstuctorEx("신승한");
		ConstuctorEx constuctorEx3 = new ConstuctorEx(27);
		ConstuctorEx constuctorEx4 = new ConstuctorEx("신승한",27);
		
		System.out.println(constuctorEx2.name);
		
	}

}
