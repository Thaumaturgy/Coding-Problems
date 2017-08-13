import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FrequencyOfSubsequence { //Finds the frequency of a sequence in a string s
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String sequence = in.nextLine();
		String[] cArr = s.split(sequence);

		Pattern pattern = Pattern.compile(sequence);
		Matcher  matcher = pattern.matcher(s);

		int count = 0;
		while (matcher.find())
		    count++;
		
		System.out.println(count); //Length of 2 contains 1 delimiter, therefore, -1 gives frequency
		
	}
}
