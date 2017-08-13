
//Duff and Meat 
//greedy
import java.util.Scanner;

public class cf588A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = Integer.MAX_VALUE;
		int total = 0;
		for (int i = 0; i < n; i++) {
			int d = in.nextInt();
			int p = in.nextInt();
			
			min = Math.min(min, p);
			total += d*min;
		}
		
		System.out.println(total);
	}
}
