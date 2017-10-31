package ihm1017;

public class AddressBook {
	public static void main(String[] args) {

		inputFile iFile = new inputFile();

		Menu menu = new Menu(iFile.loadFile());

		menu.displayMenu();

	}

}
// 프로그램 짤 때 다형성 정의를 잘 해주면 편하다... 상속과 오버라이딩...
