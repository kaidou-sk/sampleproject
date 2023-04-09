package Practice;

import java.util.Scanner;

class programs {
	public static void main(String[] args) {
		int m, c, fact = 1;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number - ");
		m = in.nextInt();
		
		if (m < 0)
			System.out.println("The number should be positive");
			else {
				for (c=1; c<=m; c++)
					fact = fact*c;
				
				System.out.println("The factorial of"+m+"is -"+fact);
			}
	}
}