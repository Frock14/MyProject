package hm0912;

/**
 * 문제) 전자 계산기 기능 (+,-,*,/,%)을 구현하되, 정수, 실수 연산이 모두 가능한 기능을 메서도 오버로딩을 이용하여 구현하고,
 * 다음 연산 결과를 출력하세요.
 * 
 * (1) 345+417.14 (2) 25859.7142-345 (3) 487*25 (4) 345.25/12 (5) 412%4
 */

public class Hw0912 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("345 + 417.14 = " + calc.addTwoNum(345, 417.14));
		System.out.println("25859.7142 - 345 = " + calc.subTwoNum(25859.7142, 345));
		System.out.println("487 * 25 : " + calc.mulTwoNum(487, 25));
		System.out.println("345.25  / 12 =" + calc.dviTwoNum(345.25, 12));
		System.out.println("412 % 4 = " + calc.remTwoNum(412, 4));

	}

}
