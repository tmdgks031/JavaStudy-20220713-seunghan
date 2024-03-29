package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		/*
		 * Factory Array 배열의 크기20\
		 * 
		 * 배열의 인덱스가 짝수이면 SamsungFactory 생성해서 대입 배열의 인덱스가 홀수이면 LgFacory 생성해서 대입
		 * 
		 * 삼성공장 1 ~ 10 LG 1 ~ 10
		 * 
		 * 삼성 모든 공장 가동
		 * 
		 * 모든 공장 생산
		 * 
		 * 모든 공장 중지
		 * 
		 * LG~
		 * 
		 */

		Factory[] factories = new Factory[100];
		for (int i = 0; i < factories.length; i++) {
			if (i % 2 == 0) {
				factories[i] = new SamsungFactory(i / 2 + 1);
			} else {
				factories[i] = new LGFactory(i / 2 + 1);
			}
		}
		for (int i = 0; i < factories.length; i++) {
			factories[i].start();
			if (factories[i] instanceof SamsungFactory) {
				((SamsungFactory) factories[i]).produceSmartPhone();
			} else {
				((LGFactory) factories[i]).produceSmartTv();
			}
			factories[i].stop();
			System.out.println();

		}

	}
}
