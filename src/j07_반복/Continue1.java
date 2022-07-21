package j07_반복;

public class Continue1 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue; //이게 해당되면 밑에걸 실행시키지말고 다시 위로 올라가라는뜻
			}
			System.out.println("i: " + i);
		}

	}

}
