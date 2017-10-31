package mystudy0921;

class MidTerm extends Student {
	private int kor;
	private int eng;
	private int math;

	MidTerm(String name, int studentNum) {
		super(name, studentNum);

	}

	public void setMidScore(int kor, int eng, int math) {

		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public int getKor() {

		return kor;

	}

	
	public void showMidTerm() {

		System.out.println("중간 국어 점수 : " + kor);
		System.out.println("중간 영어 점수 : " + eng);
		System.out.println("중간 수학 점수 : " + math);

	}

}
