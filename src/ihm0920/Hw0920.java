package ihm0920;

/**
 * 문제) 고등학교 / 대학교 정보 저장.
      - 고등학교 : 이름, 폰번호, 주소, 직업
      - 대학교 : 이름, 폰번호, 주소, 전공

      기능1)키보드로 부터 고등학교 친구 전달 받아서 저장.
      기능2)키보드로 부터 대학교 친구 전달 받아서 저장.
      기능3)친구 정보 전체 출력
      기능4)고등학교 친구 정보(이름, 폰번호) / 대학교(이름, 주소, 전공)
    
 *  상속 없이 프로그램 작성. */
import java.util.Scanner;

class HighSchoolFriends {
	private String name;
	private String phoneNumber;
	private String address;
	private String job;

	HighSchoolFriends() { // 생성자에 scanner 넣어서 생성할때 입력하게함.
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 :");
		name = sc.nextLine();

		System.out.print("폰 번호 :");
		phoneNumber = sc.nextLine();

		System.out.print("주소 :");
		address = sc.nextLine();

		System.out.print("직업 :");
		job = sc.nextLine();

	}

	public void displayHSFriends() {// 출력하는 메소드

		System.out.println("이름 : " + name);
		System.out.println("핸드폰 번호 : " + phoneNumber);
		System.out.println("주소 : " + address);
		System.out.println("직업 : " + job);

	}

}

class UniversityFriends { // 고등학교 클래스랑 구조는 동일
	private String name;
	private String phoneNumber;
	private String address;
	private String major;

	UniversityFriends() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 :");
		name = sc.nextLine();

		System.out.print("폰 번호 :");
		phoneNumber = sc.nextLine();

		System.out.print("주소 :");
		address = sc.nextLine();

		System.out.print("전공 :");
		major = sc.nextLine();

	}

	public void displayUVFriends() { // 대학교 출력 메소드

		System.out.println("이름 : " + name);
		System.out.println("핸드폰 번호 : " + phoneNumber);
		System.out.println("주소 : " + address);
		System.out.println("전공 : " + major);

	}

}

public class Hw0920 {
	static HighSchoolFriends[] hsf = new HighSchoolFriends[3];
	static UniversityFriends[] unf = new UniversityFriends[3];
	static Scanner sc = new Scanner(System.in); // 전역변수로 추가할 배열과 스캐너 선언

	public static void main(String[] args) {

		int a;
		for (;;) {
			System.out.print("1 : 추가  2 : 출력 3 : 전체출력( 종료는 0 )");
			a = sc.nextInt();
			switch (a) {

			case 0:
				return;

			case 1:
				addMenu();
				break;
			case 2:
				displayMenu();
				break;
			case 3:
				displayHFriends();
				displayUFriends();
			}

		}
	}

	public static void addMenu() { // 학생 입력받는 메뉴 출력
		int a;
		System.out.print("1 : 고등학교  2 : 대학교 ");
		a = sc.nextInt();

		switch (a) {

		case 1:

			addHSFriends();
			break;
		case 2:
			addUVFriends();
			break;
		}

	}

	public static void addHSFriends() { // 고등학교 학생 추가 메소드
		for (int i = 0; i < hsf.length; i++) {

			hsf[i] = new HighSchoolFriends();

		}
	}

	public static void addUVFriends() {// 대학교 학생 추가 메소드
		for (int i = 0; i < unf.length; i++) {

			unf[i] = new UniversityFriends();

		}
	}

	public static void displayHFriends() { // 고등학교 학생 출력 메소드
		for (int i = 0; i < hsf.length; i++) {

			hsf[i].displayHSFriends();
		}

	}

	public static void displayUFriends() {// 대학교 학생 출력 메소드
		for (int i = 0; i < unf.length; i++) {

			unf[i].displayUVFriends();
		}

	}

	public static void displayMenu() {
		int a;
		System.out.print("1 : 고등학교  2 : 대학교 ");
		a = sc.nextInt();

		switch (a) {

		case 1:
			displayHFriends();
			break;
		case 2:
			displayUFriends();
			break;
		}

	}

}
// 메인 클래스에 선언된 많은 메소드를 다시 하나의 클래스로 묶을수 있을까?