package ihm1017;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
	FriendInfoController controller;

	Menu(ArrayList<Friend> list) {

		controller = new FriendInfoController(list);

	}

	public void displayMenu() {
		while (true) {
			System.out.println("*****  메뉴 선택  *****");
			System.out.println("0. 저장 후 프로그램 종료");
			System.out.println("1. 중학교 친구 정보 저장.");
			System.out.println("2. 고등학교 친구 정보 저장.");
			System.out.println("3. 대학교 친구 정보 저장.");
			System.out.println("4. 친구 정보 출력.");
			System.out.println("5. 친구 기본 정보 출력.");
			System.out.println("6. 중학교 친구 정보만 출력.");
			System.out.println("7. 고등학교 친구 정보만 출력.");
			System.out.println("8. 대학교 친구 정보만 출력.");
			System.out.println("9. 친구 검색.");
			System.out.println("10. 친구 삭제");
			System.out.print("원하는 항목 번호를 선택하세요 >>");

			Scanner input = new Scanner(System.in);

			int choice = input.nextInt();

			switch (choice) {
			case 0:
				controller.outputFile();
				System.out.println("저장 후 프로그램을 종료합니다.");

				return;

			case 1:
			case 2:
			case 3:
				controller.addFriend(choice);
				break;
			case 4:
				controller.showInfoFriend();
				break;
			case 5:
				controller.showBasicInfoFriend();
				break;
			case 6:
			case 7:
			case 8:
				controller.showOne(choice);
				break;
			case 9:
				controller.searchFRD();
				break;
			case 10:
				controller.removeFRD();
				break;
			default:
				System.out.println("잘못된 입력입니다. 번호를 확인하세요.");
				break;
			}
		}
	}
}
