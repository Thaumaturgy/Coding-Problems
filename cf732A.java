import java.util.Scanner;

public class cf732A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int p = in.nextInt();
		int r = in.nextInt();
		
		int c = 1;
		int temp = p;
		while(temp%10 != r && temp%10 != 0){
			c++;
			temp += p;
		}
		
		System.out.println(c);
			
		
	}

	
}
