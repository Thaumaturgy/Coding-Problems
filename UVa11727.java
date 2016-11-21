import java.util.Arrays;
import java.util.Scanner;

public class UVa11727 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[3];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 3; j++)
				arr[j] = in.nextInt();
			Arrays.sort(arr);
			System.out.printf("Case %d: %d\n", i+1, arr[1]);
		}
		in.close();
	}
}
