package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(matrise[i][j]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String stringen1 = "/";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i != 3 - 1) {
					stringen1 += matrise[i][j] + "/";
				} else {
					stringen1 += matrise[i][j];
				}
			}
		}
		return stringen1;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[2][2];
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sum = sum + (matrise[i][j] * tall);
				nymatrise[i][j] = sum;
			}
			sum = 0;
		}

		return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 0; j++) {
				if (lik == true && a[i][j] == b[j][i]) {
					lik = true;
				} else {
					lik = false;
				}
			}
		}
		return lik;
	}
}
