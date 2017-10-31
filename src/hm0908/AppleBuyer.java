package hm0908;

public class AppleBuyer {// 구매자
	private String name;
	private int myMoney; // 가진 돈
	private int numOfApple;// 구매한 사과 갯수

	public AppleBuyer(String name, int money) {
		this.name = name;
		myMoney = money;
		numOfApple = 0;

	}

	// 행위, 기능
	// 사과 구매한다.

	public void buyerApple(int money, AppleSeller appleSeller) {// 메인 클래스 외의 다른 클래스에서는 static을 쓰지 않는다.

		numOfApple += appleSeller.saleApple(money);
		myMoney -= money;

	}

	public void displayBuyer() { // 출 력

		System.out.println(name + "이(가) 구매한 사과 갯수 : " + numOfApple);
		System.out.println(name + "의 남은 돈 : " + myMoney);

	}
}