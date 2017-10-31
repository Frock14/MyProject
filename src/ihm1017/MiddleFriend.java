package ihm1017;

import java.io.Serializable;

class MiddleFriend extends Friend implements Serializable {
	private String married;

	MiddleFriend(String name, String phoneNum, String address, String married) {
		super(name, phoneNum, address);
		this.married = married;

	}

	public void showFriend() {

		super.showFriend();
		System.out.println("결혼 유무 : " + married);
	}

	public void showBasicFriend() {

		System.out.println("이름 : " + getName());
		System.out.println("주소 : " + getAddress());

	}

	

}
