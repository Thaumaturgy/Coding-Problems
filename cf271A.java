import java.util.HashSet;
import java.util.Scanner;

public class cf271A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt() + 1;
		
		while(true){
			String year = n+"";
			HashSet<Character> hs = new HashSet<>(year.length());
			
			for(int i = 0; i < year.length(); i++){
				hs.add(year.charAt(i));
			}
			
			if(hs.size() == year.length())
				break;
			else
				n++;
			
		}
		System.out.println(n);
	}
}
