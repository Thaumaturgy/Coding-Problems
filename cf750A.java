import java.util.Scanner;
public class cf750A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		double fibSum = 240-k;
		
		int count = 0;
		while(n > 0){
			if(fibSum >= (count+1)*5){
				count++;
				fibSum = fibSum - count*5;
				n--;
			}
			else break;
		}
		
		System.out.println(count);	
	}
}
