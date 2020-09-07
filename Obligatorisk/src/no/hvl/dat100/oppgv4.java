package no.hvl.dat100;

import javax.swing.JOptionPane;

public class oppgv4 {

	public static void main(String[] args) {
		String inputboks = JOptionPane.showInputDialog("skriv bruttolønn");
		double inntekt = Double.parseDouble(inputboks);
		double trinnskatt = 0;
		double toppskatt1 = 164100;
		double toppskatt2 = 230950;
		double toppskatt3 = 580650;
		double toppskatt4 = 934051;

		if (inntekt <= toppskatt1) {
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt < toppskatt2 && inntekt > toppskatt1) {
			trinnskatt = inntekt * 0.0093;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt < toppskatt3 && inntekt > toppskatt2) {
			trinnskatt = inntekt * 0.0241;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt < toppskatt4 && inntekt > toppskatt3) {
			trinnskatt = inntekt * 0.1152;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt > toppskatt4) {
			trinnskatt = inntekt * 0.1452;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		}
	}
}
