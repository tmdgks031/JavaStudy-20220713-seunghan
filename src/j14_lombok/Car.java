package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
	private String company;
	private String model;
	private String color;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
