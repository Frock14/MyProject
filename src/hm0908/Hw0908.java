package hm0908;

public class Hw0908 {
	public static void main(String[] args) {
		AppleBuyer cheolsoo = new AppleBuyer("철수", 10000);
		AppleBuyer younghee = new AppleBuyer("영희", 30000);
		AppleBuyer miae = new AppleBuyer("미애", 50000);

		AppleSeller e_mart = new AppleSeller("이마트", 100, 1000);
		AppleSeller homeplus = new AppleSeller("홈플러스", 50, 2000);

		cheolsoo.buyerApple(5000, e_mart);
		cheolsoo.buyerApple(2000, homeplus);

		younghee.buyerApple(8000, e_mart);
		younghee.buyerApple(12000, homeplus);

		miae.buyerApple(20000, e_mart);
		miae.buyerApple(10000, homeplus);
		
		
		System.out.println("=== 구매자 ===");
		cheolsoo.displayBuyer();
		younghee.displayBuyer();
		miae.displayBuyer();
		
		System.out.println();
		System.out.println("=== 판매자 ===");
		e_mart.displaySeller();
		homeplus.displaySeller();

	}

}
