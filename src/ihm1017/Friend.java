package ihm1017;

import java.io.Serializable;

class Friend implements Serializable { // 공통 속성
	// 필드 - 이름, 폰번호, 주소
	private String name;
	private String phoneNum;
	private String address;

	// Constructor
	Friend(String name, String phoneNum, String address) { // ★생성자 안에서 입력받아도 되지만 생성자의 문법적인 의미에 맞지 않고, 상속을 사용시 코드가 꼬여버리기
															// 때문에 지양해야함.
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;

	}

	public String getName() {
		return this.name;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public String getAddress() {
		return this.address;
	}

	public void showFriend() {

		System.out.println("이름 : " + name);
		System.out.println("폰 번호 : " + phoneNum);
		System.out.println("주소 : " + address);

	}

	public void showBasicFriend() {

	}

}
