import java.util.ArrayList;
import java.util.Scanner;

public class UVa406 {// Prime Cuts
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int c = in.nextInt();
			if(n == -1) break;
			boolean[] arr = new boolean[n + 1];
			// Use the indexes to indicate primality of a number; 1 -> index 1
			// and so on
			// To store numbers up to n, we initialize size to n+1
			// This way, we'll be able to use n as an index

			for (int i = 2; i <= Math.sqrt(n); i++) { // Checking for composites
				for (int j = 2; i * j <= n; j++) { // All numbers i*j are
													// composite
					arr[i * j] = true; // true that it is composite;
				}
			}

			ArrayList<Integer> primes = new ArrayList<>();
			for (int i = 1; i <= n; i++) // Create list of primes
				if (!arr[i])
					primes.add(i);

			int len = primes.size();
			// for (int x : primes)
			// System.out.print(x + " ");

			System.out.println();
			System.out.println(len);
			System.out.print(n + " " + c + ": ");
			// IF 2c > len, print whole len of primes
			if (2 * c > len) {
				for (int i = 0; i < len; i++)
					System.out.print(primes.get(i) + " ");
			} else if (len % 2 == 0) {
				for (int i = len / 2 - c; i < len / 2 + c; i++)
					System.out.print(primes.get(i) + " ");

			} else { //IDK how to print odd from center
				if (c % 2 == 1)
					c++;
				for (int i = len / 2 - c / 2; i <= len / 2 + c / 2; i++)
					System.out.print(primes.get(i) + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
