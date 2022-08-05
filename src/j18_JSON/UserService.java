package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	
	public static User createUser() {
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"축구","농구","야구","골프"}));
		
		User user = User.builder()
				.userCode(1)
				.username(null)
				.password("1234")
				.name("신승한")
				.email("tmdgks031@naver.com")
				.address("부산 부산진구 전포동")
				.phone("010-9605-6081")
				.hobby(hobby)
				.build();
		return user;
	}
}
