package mystudy0921;

public class FinalTerm extends MidTerm {
	private int kor;
	private int eng;
	private int math;

	FinalTerm(String name, int studentNum) {
		super(name, studentNum);

	}

	public void setScore(int kor, int eng, int math) {

		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}
	public int getKor() {
		
		return kor;
		
	}
	public int getMidKor() {
		
		return super.getKor();
	}
	
public void showFinalTerm() {
		
		System.out.println("기말 국어 점수 : " + kor);
		System.out.println("기말 영어 점수 : " + eng);
		System.out.println("기말 수학 점수 : " + math);
		
		
	}
}