package ihm1017;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

class inputFile {

	ObjectInputStream in;

	inputFile() {
	}

	public ArrayList<Friend> loadFile() {

		try {

			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Friends.bin")));

			return (ArrayList<Friend>) in.readObject();

		}

		catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Friend>();

		}

	}
}
