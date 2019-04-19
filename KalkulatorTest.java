package Kalkulator;

import java.util.Scanner;

public class KalkulatorTest {

	public static void main(String[] args) {

		Kalkulator calculator = new Kalkulator();
		Ispis ispis = new Ispis();

		ispis.ispis();
		Scanner unos = new Scanner(System.in);

		int unosKorisnika = unos.nextInt();

		System.out.println("Unesite dva broja: ");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();

		calculator.setBroj1(broj1);
		calculator.setBroj2(broj2);

		switch (unosKorisnika) {
		case 1:
			calculator.sabiranje();
			break;
		case 2:
			calculator.oduzimanje();
			break;
		case 3:
			calculator.mnozenje();
			break;
		case 4:
			calculator.dijeljenje();
			break;
		case 5:
			calculator.korjenovanje();
			break;
		case 6:
			calculator.kvadriranje();
			break;

		}

		unos.close();

	}

}
