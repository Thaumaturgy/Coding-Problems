import java.util.Scanner;

public class cf540A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		String e = in.nextLine();
		
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += findDiff(Character.getNumericValue(s.charAt(i)), Character.getNumericValue(e.charAt(i)));
		}
		System.out.println(sum);
	}
	
	public static int findDiff(int a, int b){
		int ans = Math.abs(a - b);
		if(ans > 5)
			return 10 - ans;
		return ans;
	}
}
