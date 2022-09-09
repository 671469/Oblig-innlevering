package Innleveringer;

import static javax.swing.JOptionPane.*;
import java.util.HashMap;
import java.util.Map;
import static java.lang.Integer.*;

public class OppgaveO1 {

	public static void main(String[] args) {

		String input = showInputDialog("Skriv inn lønn");
		int lønn = parseInt(input);

		int lønnstrinn = finnlønnstrinn(lønn);
		double skatt = beregntrinnskatt(lønn, lønnstrinn);

		showMessageDialog(null, "trinnskatt " + skatt + " NOK "+ ", lønnstrinn " + lønnstrinn);

	}

	public static int finnlønnstrinn(int lønn) {
		if (lønn <= 190349) {
			return 0;
		}
		else if (lønn <= 267899) {
			return 1;
		}
		else if (lønn <= 643799) {
			return 2;
		}
		else if (lønn <= 969199) {
			return 3;
		}
		else if (lønn <= 1999999) {
			return 4;
		}
		else { 
			return 5;
		}
	}

	public static double beregntrinnskatt(int lønn, int lønnstrinn) {
		Map<Integer, Double> satser = new HashMap();
		satser.put(0, 0.0);
		satser.put(1, 0.017);
		satser.put(2, 0.04);
		satser.put(3, 0.134);
		satser.put(4, 0.164);
		satser.put(5, 0.174);

		return lønn * satser.get(lønnstrinn);
	}
}
