package ihm1011_1;

/**
int형 배열로 45개의 숫자 배열을 만들어서 하나씩 뽑을때마다 배열에서 삭제하는 방식

*/
import java.util.Random;

class RandomNumber {
	int[] num;  //로또 번호만큼의 배열을 만듬
	int[] subNum; //뽑을 숫자의 배열
	int lottoNum; // 로또 숫자 갯수 =45

	RandomNumber(int a) {
		num = new int[45];
		for (int i = 0; i < 45; i++) {

			num[i] = i + 1;

		}

		subNum = new int[a];
		lottoNum = 45;

	}

	public void choice() { //번호 추출 메소드
		Random ran = new Random();
		ran.setSeed(System.currentTimeMillis());

		for (int i = 0; i < subNum.length; i++) {

			subNum[i] = num[ran.nextInt(lottoNum)];
			removeArray(subNum[i]);

		}

	}

	public void removeArray(int i) { //번호 뽑을때마다 뽑은 번호를 배열에서 삭제해주는 메소드
		for (i = i - 1; i < lottoNum-1; i++) {
			num[i] = num[i + 1];
		}
		num[--lottoNum] = 0;
		return;
	}

	public void printNum() {

		for (int i = 0; i < subNum.length; i++) {

			System.out.println(subNum[i]);
		}
	}
}

public class Lotto {
	public static void main(String[] args) {

		RandomNumber rn = new RandomNumber(6);
		rn.choice();
		rn.printNum();

	}
}
