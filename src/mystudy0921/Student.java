package mystudy0921;

class Student {

	private String name;
	private int studentNum;

	Student(String name, int studentNum) {

		this.name = name;
		this.studentNum = studentNum;

	}

	public String getName() {

		return name;
	}
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + studentNum);
	}
}
