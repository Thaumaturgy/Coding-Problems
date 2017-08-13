import java.util.Scanner;

public class cf58A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		String hello = "hello";
		int index = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt((i)) == hello.charAt(index))
				index++;
			if(index == 5)
				break;
		}
		
		if(index == 5)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
