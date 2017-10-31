package ihm1020;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Cal extends JFrame implements ActionListener {
	JTextArea result;
	JTextField jtf1;
	JTextField jtf2;

	Cal() {

		JLabel jl1 = new JLabel("달력 프로그램");
		JLabel jl2 = new JLabel("년");
		JLabel jl3 = new JLabel("월");

		jtf1 = new JTextField(8);
		jtf2 = new JTextField(4);

		result = new JTextArea(60, 70);

		JButton jb1 = new JButton("입력");

		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		container.add(jl1);
		container.add(jtf1);
		container.add(jl2);
		container.add(jtf2);
		container.add(jl3);
		container.add(jb1);
		container.add(result);

		jb1.addActionListener(this);

		setSize(650, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText("");

		int year = Integer.valueOf((jtf1).getText());
		int month = Integer.valueOf((jtf2).getText());

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);

		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
		String[][] days = new String[6][7];
		int row = 0;
		int inputdate = 1;
		int lastday = calendar.getActualMaximum(Calendar.DATE);

		for (int i = 1; inputdate <= lastday; i++) {
			if (i < calendar.get(Calendar.DAY_OF_WEEK)) {
				days[row][i - 1] = "";
			} else {

				if (inputdate < 10) {
					days[row][(i - 1) % 7] = "  " + Integer.toString(inputdate);
				}

				else {
					days[row][(i - 1) % 7] = Integer.toString(inputdate);
				}
				inputdate++;
			}

			if (i % 7 == 0) {
				row++;
			}

		}

		for (int i = 0; i < 7; i++) {
			result.append(week[i] + "\t");

		}
		result.append("\n");

		row = 0;

		for (int j = 1; j < lastday + calendar.get(Calendar.DAY_OF_WEEK); j++) {
			result.append(days[row][(j - 1) % 7] + "\t");

			if ((j - 1) % 7 == 6) {
				result.append("\n");

				row++;
			}

			// TODO Auto-generated method stub

		}
	}
}

public class guiCalendar {
	public static void main(String[] args) {

		new Cal();
	}

}
