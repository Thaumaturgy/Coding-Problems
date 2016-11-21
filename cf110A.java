import java.util.Scanner;

public class cf110A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.replaceAll("[^47]", "");
		int size = s.length();
		if(size  == 4 || size == 7)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}
}
