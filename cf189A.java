import java.util.Arrays;
import java.util.Scanner;

public class cf189A {
	static int[] lengths;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		lengths = new int[3];
		int n = in.nextInt();
		for (int i = 0; i < 3; i++)
			lengths[i] = in.nextInt();
		Arrays.sort(lengths);
		for (int i : lengths)
			System.out.print(i + " ");
		System.out.println();
		System.out.println(maxCuts(n));

	}

	public static int maxCuts(int n) {
		System.out.println("Current length is: " + n);
		
		int cuts = 0;
		for (int i = 0; i < lengths.length; i++) {
			if (n < lengths[i])
				break;
			cuts += maxCuts(n - lengths[i]);
		}
		
		return cuts;

	}
}