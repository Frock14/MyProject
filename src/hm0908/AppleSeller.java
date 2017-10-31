package hm0908;

class AppleSeller { // 사과장수 객체
	private String name;
	private int benefit; // 이윤
	private int numberApple;// 사과 갯수
	private final int EA_APPLE; // 사과 단가
	// 정보 은닉 - 클래스의 필드에 직접적으로 접근하지 못하게 하기 위해 private를 사용, 메소드에도 사용 가능.
	// final을 쓰면 최초 초기화 이외에는 값을 변경할 수 없음.
	// 접근제어지시자를 사용하지 않고 선언하는 경우 default로 설정되며, 같은 패키지 안에서는 접근 가능하다.

	AppleSeller(String name, int num, int price) {// 클래스의 변수에 직접 사용하지 않고 각 객체의 생성자를 통해 초기화함. 객체지향의 은닉성
		this.name = name;
		benefit = 0;
		numberApple = num;
		EA_APPLE = price;

	}

	public int saleApple(int cost) {

		int number = 0;
		benefit += cost;
		number = cost / EA_APPLE;
		numberApple -= number;
		return number;

	}

	// 메소드는 일반적으로 public을 쓴다. 접근성을 높이기 위해서
	public void displaySeller() { // 출력
		System.out.println(name + "의 이윤 : " + benefit);
		System.out.println(name + "의 남은 사과 갯수 : " + numberApple);

	}

}