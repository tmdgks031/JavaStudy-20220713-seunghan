package J12_다형성.Factory;

import j11_상속.factory.Factory;

public class FactoryService {
	private Factory factory;
	
	public FactoryService(Factory factory) { 
		this.factory = factory;		//DI방식 : 원래는 factory자리에 samsung ,lG잇어야는데 안하고 외부로부터 주입하겟다고 하는것
	}
	
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	
	
}
