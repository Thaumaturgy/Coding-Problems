import java.util.Scanner;

public class cf677A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = in.nextInt();
		
		int c = 0;
		for(int i = 0; i < n; i++){
			c++;
			if(in.nextInt() > h)
				c++;
		}
		
		System.out.println(c);
	}
}
