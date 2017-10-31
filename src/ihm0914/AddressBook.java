package ihm0914;

import java.util.Scanner;

class Friends {
	private String name;
	private String phoneNumber;
	private String address;
	private int age;

	Friends(String name, String phoneNumber, String address, int age) {
		

	}

	public void display() {

		System.out.printf("이름 : %s \n", name);
		System.out.printf("핸드폰 번호 : %s\n", phoneNumber);
		System.out.printf("주소 : %s\n", address);
		System.out.printf("나이 : %d\n", age);

	}

}

public class AddressBook {
	public static void main(String[] args) {
	
		addFriends();
		
		

	}

	public static void addFriends() {
		String name;
		String phoneNumber;
		String address;
		int age;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " 번째 친구 ");
			System.out.println("친구의 이름을 입력하세요");
			name = sc.nextLine();

			System.out.println("친구의 핸드폰 번호를 입력하세요");
			phoneNumber = sc.nextLine();

			System.out.println("친구의 주소를 입력하세요");
			address = sc.nextLine();

			System.out.println("친구의 나이를 입력하세요");
			age = sc.nextInt();
			
			sc.nextLine(); //더미코드

			Friends friends = new Friends(name, phoneNumber, address, age);
			friends.display();

		}

	}

}
