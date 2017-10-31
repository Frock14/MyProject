package ihm1018;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("저장할 친구 수");
		int count = input.nextInt();
		Menu menu = new Menu(count);

		menu.displayMenu();

	}

}
// 프로그램 짤 때 다형성 정의를 잘 해주면 편하다... 상속과 오버라이딩...
