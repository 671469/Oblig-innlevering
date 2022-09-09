package Innleveringer;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String input = showInputDialog("Skriv inn poengsum for " + i);
			int poeng = parseInt(input);
			String karakter = karakter(poeng);
			if (karakter != null) {
				showMessageDialog(null, poeng + " poeng " + " karakteren " + karakter + " for elev " + i);
			}
			else {
				i--;
			}
		}

	}

	public static String karakter (int poeng) {
		if (poeng < 0 || poeng > 100) {
			return null;
		}
		else if (poeng >= 90) {
			return "A";
		}
		else if (poeng >= 80) {
			return "B";
		}
		else if (poeng >=60) {
			return "C";
		}
		else if (poeng >= 50) {
			return "D";
		}
		else if (poeng >= 40) {
			return "E";
		}
		else {
			return "F"; 
		}

	}

}
