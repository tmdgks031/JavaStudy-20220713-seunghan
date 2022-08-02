package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
	private int carNumber;
	private String Company;
	private String model;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
