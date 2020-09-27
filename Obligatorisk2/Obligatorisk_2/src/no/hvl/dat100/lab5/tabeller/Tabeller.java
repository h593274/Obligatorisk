package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void skrivUt(int[] tabell) {

		for (int i = 0; i <= tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String stringen = ("[");

		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length - 1) {
				stringen += tabell[i] + ",";
			} else {
				stringen += tabell[i];
			}
		}
		stringen += ("]");
		return stringen;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				funnet = true;
				break;
			} else {
				funnet = false;
			}
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		throw new UnsupportedOperationException("Skjønner ikke");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reverse = new int[tabell.length];

		for (int i = tabell.length - 1; i > 0; i--) {
			reverse[i] = tabell[i];
		}
		return reverse;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortet = true;
		int x = 1;
		while (sortet && x < tabell.length - 1) {
			if (tabell[x] < tabell[x + 1]) {
				sortet = false;
			}
		}
		return sortet;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int j = 0;
		int[] sammensett = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sammensett[i] = tabell1[i];
			j++;
		}
		for (int k = 0; k < tabell2.length; k++) {
			sammensett[j] = tabell2[k];
		}
		return sammensett;

	}
}
