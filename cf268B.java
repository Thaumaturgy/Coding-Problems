import java.util.Scanner;
import java.math.BigInteger;
public class cf268B { //BUTTONS - UNSOLVED
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int sum = 0;
		for(int i = 0; n > 0; i++, n--){
			sum += n + (n - 1)*i;
			
		}
		
		System.out.println(sum);
	}
	
	
}
/*
 * public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger bi = new BigInteger(in.nextLine());
		if(bi.equals(BigInteger.ONE)) 
			bi = factorial(bi);
		else
			bi = factorial(bi).add(BigInteger.ONE);
		
		System.out.println(bi.toString());
	}
	
	public static BigInteger factorial(BigInteger bi){
		if(bi.equals(BigInteger.ONE))
			return BigInteger.ONE;
		return bi.multiply(factorial(bi.subtract(BigInteger.ONE)));
	}
 * */
