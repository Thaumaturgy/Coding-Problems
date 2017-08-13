import java.util.Scanner;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] a = in.nextLine().toCharArray();
		char[] b = in.nextLine().toCharArray();
		
		int[][] counts = new int[a.length + 1][b.length + 1];
		
		for(int i = 0; i < counts.length; i++){
			for (int j = 0; j < counts[0].length; j++) {
				
				if(i == 0 || j == 0){
					counts[i][j] = 0;
				}else if(a[i-1] == b[j-1]){
					counts[i][j] = counts[i-1][j-1] + 1;
				}else{
					counts[i][j] = Math.max(counts[i-1][j], counts[i][j-1]);
				}
			}
		}
		System.out.println(counts[a.length][b.length]);
	}
		
		
}

