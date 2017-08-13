import java.util.Scanner;
//Counts the occurence of a subsequence in a string
public class SubstringOccurence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		String ss = in.nextLine();
		
		System.out.println(count(s,ss, 0));
		
	}
	
	public static int count(String s, String ss, int position){
		if(position + ss.length() > s.length())
			return 0;
		if(s.substring(position, position + ss.length()).equals(ss)){
			position += ss.length();
			return 1 + count(s, ss, position);
		}
		
		return 0;
		
	}
}
