package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class opgv5 {

	public static void main(String[] args) {
		int k = 10;
		for (int i = 0; i <= k; i++) {

			double provepoeng = Double.parseDouble(showInputDialog("Skriv inn poengsum"));

			
			if (provepoeng >= 0 && provepoeng <= 39) {
				System.out.println("Karakter F");
			} else if (provepoeng >= 40 && provepoeng <= 49) {
				System.out.println("Karakter E");
			} else if (provepoeng >= 50 && provepoeng <= 59) {
				System.out.println("Karakter D");
			} else if (provepoeng >= 60 && provepoeng <= 79) {
				System.out.println("Karakter C");
			} else if (provepoeng >= 80 && provepoeng <= 89) {
				System.out.println("Karakter B");
			} else if (provepoeng >= 90 && provepoeng <= 100) {
				System.out.println("Karakter A");
			} else {
				showMessageDialog(null, "Poengsummen må være fra 0 til 100");
				k++;
			}
		}
	}
}
