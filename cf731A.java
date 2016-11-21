import java.util.Scanner;

public class cf731A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char c = 'a';
		int total = 0;
		for(int i = 0; i < s.length(); i++){
			int min = Math.abs(c - s.charAt(i));
			if(min > 13)
				min = 26%min;
			total = total + min;
			c = s.charAt(i);
		}
		System.out.println(total);
	}
}
