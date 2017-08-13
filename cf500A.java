
//New Year Transportation 
//dfs and similar, graphs, implementation
import java.util.Scanner;


public class cf500A {
	static int cells[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int target = in.nextInt();
		
		cells = new int[n+1];
		for (int i = 1; i < n; i++) {
			cells[i] = in.nextInt();
		}
		
		System.out.println(visit(1, target));
	}
	
	public static String visit(int i, int target){
		if(i > target)
			return "NO";
		if(i == target)
			return "YES";
		return visit(i+cells[i], target);
	}
}
