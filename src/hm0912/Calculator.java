package hm0912;

class Plus {

	Plus() {

	}

	public int addTwoNum(int n1, int n2) {

		return n1 + n2;
	}

	public double addTwoNum(double n1, double n2) {// 자동 형 변환이 가능하므로 1개의 오버로딩만 하면 됨.

		return n1 + n2;
	}
}

class Minus {

	Minus() {
	}

	public int subTwoNum(int n1, int n2) {

		return n1 - n2;
	}

	public double subTwoNum(double n1, double n2) {

		return n1 - n2;
	}
}

class Multiple {

	public Multiple() {
		// TODO Auto-generated constructor stub
	}

	public int mulTwoNum(int n1, int n2) {

		return n1 * n2;
	}

	public double mulTwoNum(double n1, double n2) {

		return n1 * n2;
	}
}

class Divide {

	public Divide() {
		// TODO Auto-generated constructor stub
	}

	public int dviTwoNum(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("분모를 0으로 나눌 수 없습니다.");
			return -1; // 리턴을 위해 의미없는 값을 넣었음
		} else

			return n1 / n2;
	}

	public double dviTwoNum(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("분모를 0으로 나눌 수 없습니다.");
			return -1; // 리턴을 위해 의미없는 값을 넣었음
		} else

			return n1 / n2;
	}
}

class Remainder {
	public Remainder() {
		// TODO Auto-generated constructor stub
	}

	public int remTwoNum(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("분모를 0으로 나눌 수 없습니다.");
			return -1; // 리턴을 위해 의미없는 값을 넣었음
		} else

			return n1 % n2;
	}

	public void remTwoNum(double n1, double n2) {

		System.out.println("실수 연산에서는 의미가 없습니다.");

	}
}

public class Calculator {

	Plus plus;
	Minus minus;
	Multiple multiple;
	Divide divide;
	Remainder remainder;

	public Calculator() {

		plus = new Plus();
		minus = new Minus();
		multiple = new Multiple();
		divide = new Divide();
		remainder = new Remainder();
	}

	public int addTwoNum(int n1, int n2) {

		return plus.addTwoNum(n1, n2);
	}

	public double addTwoNum(double n1, double n2) {// 자동 형 변환이 가능하므로 1개의 오버로딩만 하면 됨.

		return plus.addTwoNum(n1, n2);
	}

	public int subTwoNum(int n1, int n2) {

		return minus.subTwoNum(n1, n2);
	}

	public double subTwoNum(double n1, double n2) {

		return minus.subTwoNum(n1, n2);
	}

	public int mulTwoNum(int n1, int n2) {

		return multiple.mulTwoNum(n1, n2);
	}

	public double mulTwoNum(double n1, double n2) {

		return multiple.mulTwoNum(n1, n2);
	}

	public int dviTwoNum(int n1, int n2) {

		return divide.dviTwoNum(n1, n2);
	}

	public double dviTwoNum(double n1, double n2) {

		return divide.dviTwoNum(n1, n2);
	}

	public int remTwoNum(int n1, int n2) {
		return remainder.remTwoNum(n1, n2);
	}

	public void remTwoNum(double n1, double n2) {

		remainder.remTwoNum(n1, n2);

	}
}
// 메소드 안에서 '선언' 하는거랑 값을 넣는거랑 햇갈리지 말자.