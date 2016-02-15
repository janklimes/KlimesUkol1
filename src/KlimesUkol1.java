import java.util.Scanner;

public class KlimesUkol1 {

	public static void main(String[] args) {
		System.out.println("Zadej cislo:");
		Scanner sc = new Scanner(System.in);
		boolean jecislo = sc.hasNextInt();
		
		
		if (jecislo == false)
			System.out.println("Neni cislo");
		else
		{	
		
			int cislo = sc.nextInt();
		
		
		
		System.out.println("Zadal jsi cislo: " + cislo);
		
		for (int i = 2; i < cislo; i++)
		{
			int vysledek = cislo/i;
			int zbytek = cislo%i;
			
			System.out.println("Cislo " + cislo + " / " + i + " = " + vysledek + " zbytek = " + zbytek);
			
			
			if (zbytek == 0) {
				System.out.println("Neni prvocislo, je delitelne " + i);
				break;
			}
			
		}
			
		System.out.println(cislo + " je prvocislo.");
		// TODO Auto-generated method stub

	}
	}

}
