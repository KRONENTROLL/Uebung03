package p2;

public class P2_main {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 0;
		d = 0;
		if (a==b) {
			d = d + 1;
		}
		if (a==b) {
			d = d + 1;
		} else {
				if (a==c) {
					d = d + 1;		
			}
		}
		if (a + b >= c) {
			d = d + 1;
		}
		if (a + b + c >= 100) {
			d = d + 1;
		}
	System.out.print(d);
	}

}