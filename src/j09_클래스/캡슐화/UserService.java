package j09_클래스.캡슐화;

import java.util.Scanner;

public class UserService {

	private User user;
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디: " );
		username= scanner.nextLine();
		if(username == null || username.trim().isEmpty()) { // isBlank는 JDK11버전이상부터 가능
			return;
		}

		System.out.println("비밀번호: " );
		password= scanner.nextLine();
		if(isStrBlank(password)) { // 길게 안쓰고 밑에 boolean클래스를 만들면서 줄일수 있다.
			return;
		}
		
		System.out.println("이름: " );
		name= scanner.nextLine();
		if(isStrBlank(name)) { 
			return;
		}
		
		System.out.println("이메일: " );
		email= scanner.nextLine();
		if(isStrBlank(email)) { 
			return;
		}
	}
	
	public boolean isStrBlank(String str) {
		return str == null || str.isBlank();
	}
	
}



