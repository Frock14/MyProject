package ihm0914_2;

import java.util.Scanner;

class Friends {
	private String name;
	private String phoneNumber;
	private String homeAddress;
	private int age;

	Friends(String name, String phoneNumber, String homeAddress, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.homeAddress = homeAddress;
		this.age = age;

	}

	public void display() {

		System.out.printf("이름 : %s \n", name);
		System.out.printf("핸드폰 번호 : %s\n", phoneNumber);
		System.out.printf("주소 : %s\n", homeAddress);
		System.out.printf("나이 : %d\n", age);

	}

}

public class Address {
	public static void main(String[] args) {

		Friends[] friends = new Friends[5];

		for (int i = 0; i < friends.length; i++) {

			friends[i] = addFriends();

		}

	}

	public static Friends addFriends() {
		String name;
		String phoneNumber;
		String address;
		int age;

		Scanner sc = new Scanner(System.in);

		System.out.println("친구의 이름을 입력하세요");
		name = sc.nextLine();

		System.out.println("친구의 핸드폰 번호를 입력하세요");
		phoneNumber = sc.nextLine();

		System.out.println("친구의 주소를 입력하세요");
		address = sc.nextLine();

		System.out.println("친구의 나이를 입력하세요");
		age = sc.nextInt();

		sc.nextLine(); // 더미코드

		Friends friends = new Friends(name, phoneNumber, address, age);
		friends.display();
		return friends;
	}

}
