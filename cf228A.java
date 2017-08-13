import java.util.Scanner;
import java.util.HashSet;

public class cf228A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashSet hs = new HashSet(4);
		
		for (int i = 0; i < 4; i++) {
			hs.add(in.next());
			
		}
		
		System.out.println(4-hs.size());
	}
}
