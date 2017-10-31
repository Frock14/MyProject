package ihm1011_2;

import java.util.Scanner;

/**
 * 문제2) 키보드로부터 연도를 입력받아, 해당 연도가 윤년인지 아닌지를 
            출력하는 프로그램을 작성하세요.

          윤년의 정의
	  - 1년 365.242374
	  - 평년 = 365일 (2월달 - 28일까지)
	  - 윤년 = 366일 (2월달 - 29일까지)

	1. 해당 연도를 4로 나누어 떨어지면 윤년
	2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님
	3. 그 중에서 400으로 나누어 떨어지면 윤년
 * 
 * */

public class Calendar {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int a= sc.nextInt();
		
		if((a%4==0)&&(a%100!=0)||(a%400==0))
		{
			System.out.println(a + "년은 윤년입니다.");
		}
		else
			System.out.println(a + "년은 윤년이 아닙니다.");
		
		
		
		
	}
	
	

}
