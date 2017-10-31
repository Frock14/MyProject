package mystudy0921;

import java.util.Scanner;

class StudentController {

	private FinalTerm[] ft;
	private int indexOfStd;
	private int MAX_INDEX;

	StudentController(int i) {
		ft = new FinalTerm[i];
		indexOfStd = 0;
		MAX_INDEX = i;

	}

	public void addStudent() {

		Scanner sc = new Scanner(System.in);
		String name;
		int number;

		System.out.print("학생의 이름을 입력하시오.");
		name = sc.nextLine();
		System.out.print("학생의 번호를 입력하시오.");
		number = sc.nextInt();

		sc.nextLine();

		ft[indexOfStd++] = new FinalTerm(name, number);

	}

	public void addMidTerm(int i) {
		if (i == -1) {
			System.out.println("해당 이름의 학생이 없습니다.");

			return;
		}
		if (ft[i].getKor() != 0) {

			System.out.println("점수가 이미 입력되어 있습니다.");
			return;

		}

		else {
			Scanner sc = new Scanner(System.in);
			int k_score, e_score, m_score;
			System.out.print("국어 점수 입력");
			k_score = sc.nextInt();
			System.out.print("영어 점수 입력");
			e_score = sc.nextInt();
			System.out.print("수학 점수 입력");
			m_score = sc.nextInt();

			ft[i].setMidScore(k_score, e_score, m_score);
		}
	}

	public void addFinalTerm(int i) {
		
		

		if (i == -1) {
			System.out.println("해당 이름의 학생이 없습니다.");

			return;
		}
		if (ft[i].getKor() != 0) {

			System.out.println("점수가 이미 입력되어 있습니다.");
			return;

		}
		if(ft[i].getMidKor() ==0){
			System.out.println("중간고사 결과를 먼저 입력하세요");
			return;
		}

		else {
			Scanner sc = new Scanner(System.in);
			int k_score, e_score, m_score;
			System.out.print("국어 점수 입력");
			k_score = sc.nextInt();
			System.out.print("영어 점수 입력");
			e_score = sc.nextInt();
			System.out.print("수학 점수 입력");
			m_score = sc.nextInt();

			ft[i].setScore(k_score, e_score, m_score);

		}
	}

	public int searchStd() { // 인트 리턴값으로!
		Scanner sc = new Scanner(System.in);
		String name;
		int result = 0;
		System.out.println("학생 이름을 입력하세요.");
		name = sc.nextLine();
		for (int i = 0; i < indexOfStd; i++) {
			if ((ft[i].getName()).compareTo(name) == 0) {
				return i;

			}

		}
		return -1;
	}

	public void showScore() {
		for (int i = 0; i < indexOfStd; i++) {
			ft[i].show();
			ft[i].showMidTerm();
			ft[i].showFinalTerm();
		}

	}

}
