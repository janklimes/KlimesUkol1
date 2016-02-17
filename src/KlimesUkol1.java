import java.util.Scanner;

public class KlimesUkol1 {

	public static void main(String[] args) {

		// nacteni vstupu
		System.out.println("Zadej cislo:");
		Scanner sc = new Scanner(System.in);
		boolean jecislo = sc.hasNextInt();

		// validace vstupu na cislo
		if (jecislo == false) {
			System.out.println("Neni cislo");
		} else {

			int cislo = sc.nextInt();

			System.out.println("Zadal jsi cislo: " + cislo);

			// overeni prvocisla
			for (int i = 2; i < cislo; i++) {
				int vysledek = cislo / i;
				int zbytek = cislo % i;

				System.out.println("Cislo " + cislo + " / " + i + " = " + vysledek + " zbytek = " + zbytek);

				// pokud je zbytek 0 neni prvocislo
				if (zbytek == 0) {
					System.out.println("Neni prvocislo, je delitelne " + i);
					return; // ukonci cyklus main aby se take nevypisovalo "je
							// prvocislo"
					// pridano v branch feature
				}
			}

			// pokud dojede az sem, je prvocislo
			System.out.println(cislo + " je prvocislo.");
		}
	}
}
