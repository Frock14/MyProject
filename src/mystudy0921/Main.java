package mystudy0921;
/**
 *     학생 정보 입력 프로그램
 *     입력 : 입력할 학생 수, 입력할학생 이름과 번호, 중간고사 성적, 기말고사 성적(국,영, 수)
 *     
 *     기능
 *     1. 학생 정보 입력
 *     2. 중간고사 정보 입력
 *     3. 기말고사 정보 입력
 *     4. 입력된 정보 출력.
 *     
 *     예외처리
 *     점수 입력시 이미 입력된 경우 -입력못하게 처리
 *     배열이 가득 찬 경우 - 입력못하게 처리
 *     중간 점수 없이 기말 입력하려는 경우 - 경고 메시지 출력 후 초기화면 복귀
 * */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 학생 수 : ");
		number = sc.nextInt();
		Menu menu = new Menu(number);
		menu.displayMenu();

	}

}
