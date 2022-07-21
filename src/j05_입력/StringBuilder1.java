package j05_입력;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();	
		stringBuilder.append("이름: ");
		stringBuilder.append("신승한");
		stringBuilder.delete(1, 2);
		
		System.out.println(stringBuilder.toString());
		
	}

}

