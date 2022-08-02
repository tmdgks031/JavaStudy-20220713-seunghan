package j14_lombok.builder;

public class ProductMain {

	public static void main(String[] args) {
		Product product = Product.builder()
				.productCode(20220001)
				.productCategory("텀블러")
				.productName("스타벅스 텀블러")
				.creatDate("2022-08-02")
				.build();
		
		System.out.println(product);

	}

}
