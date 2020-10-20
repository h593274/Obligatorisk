package no.hvl.dat100.idris;

public class oppgv6 {
	
public static void main(String[] args) {
System.out.println(fakultet(4));
}

public static int fakultet(int n) {
	if(n==1) {
		return 1;
	}
	else {
		return n*fakultet(n-1);
	}
}
}
