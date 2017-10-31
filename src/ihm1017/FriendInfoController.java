package ihm1017;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**다형성 사용*/
import java.util.Scanner;

class FriendInfoController { // 데이터 입력 후 자료형 저장
	ArrayList<Friend> list;

	FriendInfoController(ArrayList<Friend> list) {

		this.list = list;

	}

	public void addFriend(int choice) {

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

			list.add(new MiddleFriend(name, phone, address, married));

		} else if (choice == 2) {
			System.out.print("직업을 입력하세요 : ");
			work = input.nextLine();

			list.add(new HighFriend(name, phone, address, work));

		} else if (choice == 3) {
			System.out.print("전공을 입력하세요 : ");
			major = input.nextLine();

			list.add(new UnivFriend(name, phone, address, major));

		}

	}

	public void showInfoFriend() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showFriend();

		}

	}

	public void showBasicInfoFriend() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showBasicFriend();
		}

	}

	public void showOne(int num) { // 6,7,8번기능
		boolean b = true;
		if (num == 6) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof MiddleFriend) {
					list.get(i).showFriend();
					b = false;
				}
			}
			if (b) {
				System.out.println("중학교 학생 정보가 없습니다.");

			}

		} else if (num == 7) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof HighFriend) {
					list.get(i).showFriend();
					b = false;
				}
			}
			if (b) {
				System.out.println("고등학교 학생 정보가 없습니다.");

			}
		} else if (num == 8) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) instanceof UnivFriend) {
					list.get(i).showFriend();
					b = false;
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
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().compareTo(name) == 0) {
				list.get(i).showFriend();
				return;
			}
		}
		System.out.println("해당 이름의 학생이 존재하지 않습니다.");

	}

	public void removeFRD() {// 삭제
		if (list.size() == 0) {
			System.out.println("삭제할친구가없습니다.");
			return;
		}
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("친구 이름을 입력하세요");
		name = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().compareTo(name) == 0) {// Equals(boolean)을 써도 된다.

				list.remove(i);
				System.out.println("삭제 완료!");

				return;
			}
		}
		System.out.println("해당 이름의 학생이 존재하지 않습니다.");

	}

	public void outputFile() {

		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("Friends.bin")));

			out.writeObject(list);

			out.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
