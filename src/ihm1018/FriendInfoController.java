package ihm1018;

/**다형성 사용*/
import java.util.Scanner;

class FriendInfoController { // 데이터 입력 후 자료형 저장

	private Friend[] friend;
	private int indexOfFriend;
	private int MAX_FRIEND;

	FriendInfoController(int count) {

		friend = new Friend[count];

		indexOfFriend = 0;
		MAX_FRIEND = count;

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
			System.out.print("결혼 유무를 입력하세요");
			married = input.nextLine();

			friend[indexOfFriend++] = new MiddleFriend(name, phone, address, married);

		} else if (choice == 2) {
			System.out.print("직업을 입력하세요 : ");
			work = input.nextLine();

			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);

		} else if (choice == 3) {
			System.out.print("전공을 입력하세요 : ");
			major = input.nextLine();

			friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);

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
		boolean b = true;
		if (num == 6) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof MiddleFriend) {
					friend[i].showFriend();
					b = false;
				}
			}
			if (b) {
				System.out.println("중학교 학생 정보가 없습니다.");

			}

		} else if (num == 7) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof HighFriend) {
					friend[i].showFriend();
				}
			}
			if (b) {
				System.out.println("고등학교 학생 정보가 없습니다.");

			}
		} else if (num == 8) {
			for (int i = 0; i < indexOfFriend; i++) {
				if (friend[i] instanceof UnivFriend) {
					friend[i].showFriend();
				}
			}
			if (b) {
				System.out.println("대학교 학생 정보가 없습니다.");

			}

		}

	}

	public void searchFRD() { // 검색 메소드
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("친구 이름을 입력하세요");
		name = sc.nextLine();
		for (int i = 0; i < indexOfFriend; i++) {
			if (friend[i].getName().compareTo(name) == 0) {
				friend[i].showFriend();
				return;
			}
		}
		System.out.println("해당 이름의 학생이 존재하지 않습니다.");

	}

	public void removeFRD() {// 삭제
		if (indexOfFriend == 0) {
			System.out.println("삭제할친구가없습니다.");
			return;
		}
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("친구 이름을 입력하세요");
		name = sc.nextLine();
		for (int i = 0; i < indexOfFriend; i++) {
			if (friend[i].getName().compareTo(name) == 0) {// Equals(boolean)을 써도 된다.

				for (int j = i; j < indexOfFriend - 1; j++) {

					friend[j] = friend[j + 1];
				}
				friend[--indexOfFriend] = null;
				System.out.println("삭제 완료!");

				return;
			}
		}
		System.out.println("해당 이름의 학생이 존재하지 않습니다.");

	}

}
