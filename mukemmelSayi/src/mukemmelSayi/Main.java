package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6--> 1,2,3 toplamı 6'dır. Dolayısı ile mükemmel sayıdır.

		int number = 28;
		int counter = 0;
		boolean isZero = true;
		
		for(int i = 1; i<number; i++) {
			if (number % i == 0) {
				isZero = true;
				counter = counter + i;
			}
			
		}
		 if (counter == number) {
			System.out.println("Sayı mükemmel sayıdır.");
		}
		 else {
			System.out.println("Sayı mükemmel sayı değildir.");
		}
		
		
	}

}
