package loops;

import javax.swing.JOptionPane;

public class Ex35 {

	public static void main(String[] args) {

		int tableValue;

		tableValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input table value: "));

		if (tableValue < 0) {

			JOptionPane.showInputDialog(null, "Please input a value greater than zero!");

			return;

		}

		else {

			for (int i = 0; i <= 10; i++) {

				System.out.println(tableValue + " X " + i + " = " + tableValue * i);
			}
		}

	}

}
