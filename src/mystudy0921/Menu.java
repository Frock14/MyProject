package mystudy0921;

import java.util.Scanner;

class Menu {
	StudentController sController;

	Menu(int i) {
		sController = new StudentController(i);

	}

	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int input;

		while (true) {
			System.out.println("===학생성적관리프로그램===");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 중간고사 입력");
			System.out.println("3. 기말고사 입력");
			System.out.println("4. 학생정보 보기");
			System.out.println("=====종료는 0========");
			System.out.print("입력하시오>>");
			input = sc.nextInt();

			switch (input) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1:
				sController.addStudent();
				break;
			case 2:
				midTermMenu();
				break;
			case 3:
				finalTermMenu();
				break;
			case 4:
				sController.showScore();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");

			}

		}
	}

	public void midTermMenu() {
		int i = sController.searchStd();
		sController.addMidTerm(i);

	}

	public void finalTermMenu() {
		int i = sController.searchStd();
		sController.addFinalTerm(i);

	}

}
