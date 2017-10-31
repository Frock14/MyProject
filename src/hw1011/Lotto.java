package hw1011;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1; // Random 인스턴스를 생성할 필요 없이 Math 클래스에 있는 random메소드를 사용해도 된다.

			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}

			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
