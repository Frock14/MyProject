package ihm0922;

class UnivFriend extends Friend { // 대학교 친구
	String major;

	UnivFriend(String name, String phoneNum, String address, String major) {
		super(name, phoneNum, address);
		this.major = major;

	}

	public void showFriend() {

		super.showFriend();

		System.out.println("전공 : " + major);

	}

	public void showBasicFriend() {
		System.out.println("이름 : " + getName());
		System.out.println("주소 : " + getAddress());
		System.out.println("전공 : " + major);

	}

}
