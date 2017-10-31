package ihm0927;

import java.util.Scanner;

class OneNameException extends Exception {
	OneNameException() {
		System.out.println("한 글자의 이름은 입력하실 수 없습니다.");

	}

}

public class Ihm0927 {

	public static void main(String[] args) {

		try {
			readName();
		} catch (OneNameException e) {
			// TODO Auto-generated catch block
			System.out.println("프로그램을 종료합니다.");
		}

	}

	public static void readName() throws OneNameException {
		System.out.println("이름을 입력하세요");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char[] cha = name.toCharArray();
		if (cha.length == 1) {

			OneNameException one = new OneNameException();
			throw one;

		}
		
		System.out.println("이름 : " + name);

	}

}
