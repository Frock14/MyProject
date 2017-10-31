package hw0915;

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

public class Hw0915 {
	public static void main(String[] args) {
		Friend[] friend = new Friend[5];
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, addr = null;
		int age = 0;

		System.out.println("5명의 친구 정보를 입력하세요.");

		for (int i = 0; i < friend.length; i++) {
			System.out.println((i + 1) + " 번째 친구 이름을 입력하세요.");
			name = input.nextLine();

			System.out.println((i + 1) + "번째 친구 핸드폰번호를 입력하세요.");
			phone = input.nextLine();

			System.out.println((i + 1) + "번째 친구 주소를 입력하세요.");
			addr = input.nextLine();

			System.out.println((i + 1) + "번째 친구 나이를 입력하세요.");
			age = input.nextInt();
			input.nextLine(); // 더미 소스

			friend[i] = new Friend(name, phone, addr, age);
		}
		
		System.out.println("=== 입력된 친구 출력 ===");
		
		for (int i = 0; i < friend.length; i++) {
			friend[i].showFriendInfo();
			
			
		}
		
	}

}
