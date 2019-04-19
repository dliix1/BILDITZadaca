package Kalkulator;

public class Kalkulator {

	int broj1;
	int broj2;
	double rezultat;

	public int getBroj1() {
		return broj1;
	}

	public void setBroj1(int broj1) {
		this.broj1 = broj1;
	}

	public int getBroj2() {
		return broj2;
	}

	public void setBroj2(int broj2) {
		this.broj2 = broj2;
	}

	Kalkulator() {

	}

	public void sabiranje() {
		rezultat = broj1 + broj2;
		System.out.println("Rezultat je: " + rezultat);

	}

	public void oduzimanje() {
		rezultat = broj1 - broj2;
		if (broj1 < broj2) {
			rezultat = broj2 - broj1;
		}

		System.out.println("Rezultat je: " + rezultat);
	}

	public void mnozenje() {
		rezultat = broj1 * broj2;
		System.out.println("Rezultat je: " + rezultat);

	}

	public void dijeljenje() {
		rezultat = broj1 / broj2;
		System.out.println("Rezultat je: " + rezultat);

	}

	public void korjenovanje() {
		double rezultat1 = Math.sqrt(broj1);
		double rezultat2 = Math.sqrt(broj2);

		System.out.println("Rezultat prvog broja je: " + rezultat1
				+ ", a rezultat drugog " + rezultat2);

	}

	public void kvadriranje() {
		double rezultat1 = Math.pow(broj1, 2);
		double rezultat2 = Math.pow(broj2, 2);

		System.out.println("Rezultat prvog broja je: " + rezultat1
				+ ", a rezultat drugog " + rezultat2);

	}

}
