import java.util.Arrays;
import java.util.Scanner;
public class cf160A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		int rollingSum = 0;
		int count = 0;
		for(int i = 0; i < n; i++){
			
			if(rollingSum <= sum-rollingSum)
				count++;
			else
				break;
			rollingSum += arr[i];
		}
		
		System.out.println(count);
	}
}
