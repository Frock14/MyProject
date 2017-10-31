package ihm1017;

import java.io.Serializable;

class HighFriend extends Friend implements Serializable{ // 고등학교 친구
	// 필드 - 직업
	private String work;

	HighFriend(String name, String phoneNum, String address, String work) {
		super(name, phoneNum, address);// 의무
		this.work = work;
	}

	public void showFriend() {

		super.showFriend();

		System.out.println("직업 : " + work);

	}

	public void showBasicFriend() {
		System.out.println("이름 : " + getName());
		System.out.println("폰 번호 : " + getPhoneNum());

	}
}
