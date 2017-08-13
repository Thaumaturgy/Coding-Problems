import java.util.Scanner;
public class cf472A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		if(n % 2 == 0)
			System.out.printf("%d %d", n-4, 4);
		else{
			int oddSide = n - 4;
			int evenSide = 4;
			while(isPrime(oddSide)){
				oddSide -= 2;
				evenSide += 2;
			}
			
			System.out.printf("%d %d", oddSide, evenSide);
		}
	}
	
	public static boolean isPrime(int n){
		if(n % 2 == 0) 
			return false;
		
		for(int i = 3; i <= Math.sqrt(n); i += 2){
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}
