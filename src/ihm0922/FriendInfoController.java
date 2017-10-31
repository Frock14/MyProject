package ihm0922;

/**다형성 사용*/
import java.util.Scanner;

class FriendInfoController { // 데이터 입력 후 자료형 저장

	private Friend[] friend;
	private int indexOfFriend;
	private int MAX_FRIEND;

	FriendInfoController(int count) {

		friend = new Friend[3 * count];// 하나의 인스턴스 배열에 세 종류의 데이터를 받아야 하기 때문에 입력받은 값의 3배의 배열 공간이 필요함.

		indexOfFriend = 0;
		MAX_FRIEND = 3 * count;

	}

	public void addFriend(int choice) {
		if ((indexOfFriend >= MAX_FRIEND)) {
			System.out.println("더 이상 저장할 공간이 없습니다.");
			return;

		}

		Scanner input = new Scanner(System.in);
		String name, phone, address, work, major, married;

		System.out.print("이름을 입력하세요 : ");
		name = input.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		phone = input.nextLine();
		System.out.print("주소를 입력하세요 : ");
		address = input.nextLine();

		if (choice == 1) {
			System.out.print("직업을 입력하세요 : ");
			work = input.nextLine();

			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);

		} else if (choice == 2) {
			System.out.print("전공을 입력하세요 : ");
			major = input.nextLine();

			friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);
		} else if (choice == 3) {

			System.out.print("결혼 유무를 입력하세요");
			married = input.nextLine();

			friend[indexOfFriend++] = new MiddleFriend(name, phone, address, married);

		}

	}

	public void showInfoFriend() {
		for (int i = 0; i < indexOfFriend; i++) {
			friend[i].showFriend();
		}

	}

	public void showBasicInfoFriend() {
		for (int i = 0; i < indexOfFriend; i++) {
			friend[i].showBasicFriend();
		}

	}

	public void showOne(int num) { // 6,7,8번기능

		if (num == 6) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof MiddleFriend) {
					friend[i].showFriend();
				}
			}

		} else if (num == 7) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof HighFriend) {
					friend[i].showFriend();
				}
			}
		} else if (num == 8) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof UnivFriend) {
					friend[i].showFriend();
				}
			}
		}

	}

	public void searchFRD() { //검색 메소드
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("친구 이름을 입력하세요");
		name = sc.nextLine();
		for (int i = 0; i < indexOfFriend; i++) {
			if (friend[i].getName().compareTo(name) == 0) {
				friend[i].showFriend();
				break;
			}
		}
		System.out.println("해당 이름의 학생이 존재하지 않습니다.");

	}

}
