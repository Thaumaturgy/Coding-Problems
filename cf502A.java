import java.util.Scanner;
import java.util.HashSet;

public class cf502A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		
		String s = in.nextLine().toUpperCase();
		
		HashSet hs = new HashSet(26);
		
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
			
		}
		
		if(hs.size() == 26)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
