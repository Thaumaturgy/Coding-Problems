import java.util.HashMap;
import java.util.Scanner;

public class cf4C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> map = new HashMap<>(n);
		in.nextLine();
		
		for(int i = 0; i < n; i++){
			String s = in.nextLine();
			if(map.containsKey(s)){
				map.put(s, map.get(s) + 1);
				System.out.println(s+map.get(s));
			}
			else{
				System.out.println("OK");
				map.put(s, 0);
			}
		}
		
	}
}
