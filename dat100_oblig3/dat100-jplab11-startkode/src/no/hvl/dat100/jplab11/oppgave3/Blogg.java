package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] array;
	private int antalllengde;

	public Blogg() {
		array = new Innlegg[20];
	}

	public Blogg(int lengde) {
		array = new Innlegg[lengde];
		antalllengde = 0;
	}

	public int getAntall() {
		return antalllengde;
	}

	public Innlegg[] getSamling() {
		return array;
	}

	public int finnInnlegg(Innlegg innlegg) {
		int indeks = -1;
		for (int i = 0; i < antalllengde; i++) {
			if (array[i].erLik(innlegg)) {
				indeks=i;
			}
		}
		return indeks;
	}

	public boolean finnes(Innlegg innlegg) {

		for (int i = 0; i < antalllengde; i++) {
			if (array[i] != null && array[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {

		if (antalllengde < array.length) {
			return true;
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass() == true) {
			array[antalllengde] = innlegg;
			antalllengde++;
			return true;
		}
		return false;
	}

	public String toString() {
		String str = antalllengde + "\n" + "";
		for (int i = 0; i < antalllengde; i++) {
			str += array[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}