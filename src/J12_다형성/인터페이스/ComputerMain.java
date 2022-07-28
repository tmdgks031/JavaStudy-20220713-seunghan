package J12_다형성.인터페이스;

import java.util.Scanner;

public class ComputerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		ConnetionTerminal connetionTerminal = null;
		
		System.out.println("[컴퓨터 연결 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝트 연결");
		System.out.println("선택 >> ");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			connetionTerminal = new Monitor();
		}else if(select.equals("2")) {
			connetionTerminal = new BeamProject();
		}else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		
		Computer computer = new Computer(connetionTerminal);
		
		HDMI monitor = new Monitor();
		BeamProject beamProject = new BeamProject();
				
		computer.powerOn();
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		computer.powerOff();
	}
	
}
