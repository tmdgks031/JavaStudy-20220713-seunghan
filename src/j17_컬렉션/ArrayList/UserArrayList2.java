package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList2 {
	private List<User> userList;
	private Scanner scanner; 
	
	public UserArrayList2(){
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void Useradd() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("아이디: ");
		username = scanner.nextLine();
		System.out.println("비밀번호: ");
		password = scanner.nextLine();
		System.out.println("이름: ");
		name = scanner.nextLine();
		System.out.println("이메일: ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
	
		userList.add(user);
	}
	
	public void PrintUserlist() {
		// userList 반환
				/*
				 * 아이디	> aaa 
				 * 비밀번호 > 1234 
				 * 이름 	> 김준일 
				 * 이메일	> aaa@naver.com
				 * 
				 * 아이디 	> bbb 
				 * 비밀번호 > 1234 
				 * 이름 	> 김준일 
				 * 이메일 	> bbb@naver.com
				 */
		for(User user : userList) {
			
		
		System.out.println("아이디\t > " + user.getUsername());
		System.out.println("비밀번호 > " + user.getPassword());
		System.out.println("이름\t > " + user.getName());
		System.out.println("이메일\t > " + user.getEmail());
		System.out.println();
		
		}
	}
	
	public void UserRemove() {
		String username = null;
		String password = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		for(User user : userList) {			
			if(user.getName().equals(username)) {
				System.out.print("비밀번호: ");
				password = scanner.nextLine();
				if(password.equals(password)) {
					userList.remove(user);
					System.out.println(user);
					System.out.println("사용자 정보를 삭제하였습니다.");
					System.out.println();
					return;
				}else {
					System.out.println("비밀번호가 올바르지 않습니다.");
					return;
				}
			}
		}System.out.println("아이디가 올바르지 않습니다.");
	}
	
	
	
	public static void main(String[] args) {
		
		UserArrayList2 userArrayList2 = new UserArrayList2();
		/*
		 * [ 사용자 관리 프로그램]
		 * 1.사용자추가
		 * 2.사용자 리스트 출력
		 * 3.사용자 삭제
		 * q.프로그램 종료
		 * 
		 */
		
		while(true) {
			String select = null;

			System.out.println("[ 사용자 관리 프로그램 ] ");
			System.out.println("1. 사용자 추가 ");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제 ");
			System.out.println("q.  프로그램 종료");
			
			select = userArrayList2.getScanner().nextLine();
			if(select.equals("1")) {
				userArrayList2.Useradd();
			}else if(select.equals("2")) {
				userArrayList2.PrintUserlist();
			}else if(select.equals("3")) {
				userArrayList2.UserRemove();
			}else if(select.equals("q")) {
				System.out.println("시스템 종료");
				break;
			}else {
				System.out.println("입력이 잘못 되었습니다.");
			}
		}
		
		
	}

}
