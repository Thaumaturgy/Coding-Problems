
//Kefa and First Steps \
//brute force, dp, implementation
import java.util.Scanner;

public class cf580A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int max = 0;
		int prev = 0;
		int streak = 0;
		for (int i = 0; i < n; i++) {
			int profit = in.nextInt();
			streak = prev <= profit ? streak + 1 : 1;
			prev = profit;
			max = Math.max(max, streak);
		}
		
		System.out.println(max);
	}
}
