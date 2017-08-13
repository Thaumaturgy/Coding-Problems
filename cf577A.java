import java.util.Scanner;

public class cf577A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long x = in.nextLong();
		
		System.out.println(countOccurences(n, x));
	}
	
	public static int countOccurences(long n, long x){
		int c = 0;
		for(int i = 1; i <= n; i ++){
			
			if(x/i <= n && x%i == 0)
				c++;
		}
		return c;
	}
}
