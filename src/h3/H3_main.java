package h3;

public class H3_main {
	public static void main(String[] args) {
		int max = 5, fix = 2, wartend = 2;
		boolean istVoll = false;
		
		if (fix < max) {
			istVoll = false;
		}

		if (fix == max) {
			istVoll = true;
		}
		
		if (istVoll == false) {
			if (wartend > 0) {
				if (fix + wartend <= max) {
					fix = fix + wartend;
					wartend = 0;
					
				}
			}
		}
				
			if (fix + wartend > max) {
				wartend = wartend - max + fix;
				fix = max;		
			}
		
		if (fix == max) {
			istVoll = true;
		}
		
		System.out.println("Max: " + max);
		System.out.println("Fix: " + fix);
		System.out.println("Wartend: " + wartend);
		System.out.println("IstVoll: " + istVoll);
	}
}
