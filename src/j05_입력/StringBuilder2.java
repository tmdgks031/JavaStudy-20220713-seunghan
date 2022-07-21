package j05_입력;

public class StringBuilder2 {

	public static void main(String[] args) {
		int index = 0;
		String names = "신승한님, 서재효님, 임나영님, 문창배님, 전나경님";
		// 신승한/서재효/임나영/문창배/전나경
		
		
		StringBuilder stringBuilder = new StringBuilder();	
		index = names.indexOf("님");		
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index -3 , index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index -3 , index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index -3 , index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index -3 , index));
		
		System.out.println(stringBuilder.toString());
		
		System.out.println();
		
		StringBuilder stringBuilder2 = new StringBuilder();	
		stringBuilder2.append(names);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");		
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");		
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");		
		stringBuilder2.delete(index, index + 3);
		
		
		
		System.out.println(stringBuilder2.toString());
		
	}

}

