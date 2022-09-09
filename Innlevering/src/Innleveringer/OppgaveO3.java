package Innleveringer;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO3 {

	public static void main(String[] args) {
		String input = showInputDialog("tall");
		int n = parseInt(input);
		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;

		}

		showMessageDialog(null, factorial);
	}

}
