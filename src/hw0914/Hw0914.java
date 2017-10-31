package hw0914;

/**배열 없이 친구 5명 정보 저장, 출력*/
import java.util.Scanner;

class Friend {

	private String name;
	private String phoneNum;
	private String address;
	private int age;

	Friend(String name, String phoneNum, String address, int age) {

		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.age = age;

	}

	public void showFriendInfo() {

		System.out.println("이름 : " + name);
		System.out.println("핸드폰 번호 : " + phoneNum);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);

	}

}

public class Hw0914 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, addr = null;
		int age = 0;

		System.out.println("5명의 친구 정보를 입력하세요.");
		System.out.print("첫 번째 친구 이름을 입력하세요.");
		name = input.nextLine();

		System.out.println("첫번째 친구 핸드폰번호를 입력하세요.");
		phone = input.nextLine();

		System.out.println("첫번째 친구 주소를 입력하세요.");
		addr = input.nextLine();

		System.out.println("첫번째 친구 나이를 입력하세요.");
		age = input.nextInt();

		Friend friend1 = new Friend(name, phone, addr, age);

		// 위 내용을 5번 반복해야되는 번거로움이 있음. 반복문을 쓰면 scanner 부분 까지는 해결되지만, 객체 생성 부분에서 어려움이 있다.
		// 아래에 출력하는 부분도 넣어야하는데 이것도 반복해야됨(반복문 못씀)

	}

}
