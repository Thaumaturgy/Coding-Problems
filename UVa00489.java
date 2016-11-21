import java.util.*;
public class UVa00489 {  //Hangman Judge
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int[] alp = new int[26]; //1 true, 0 false, -1 null
			//array of 'booleans' with 3 states
			int round = in.nextInt();
			in.nextLine();
			if(round == -1) break;
			String orig = in.nextLine();
			String guess = in.nextLine();
			
			System.out.println("Round "+round);
			
			int totalCorrect = 0;
			for(int i = 0; i < orig.length(); i++){
				if(alp[orig.charAt(i)-'a'] == 0){
					alp[orig.charAt(i)-'a'] = 1;
					totalCorrect++;
				}
			}
			
			int wrong = 0,correct = 0;
			boolean done = false;
			for(int i = 0; i < guess.length(); i++){
				if(alp[guess.charAt(i)-'a'] == 0){ //does it not exist?
					alp[guess.charAt(i)-'a'] = -1;
					wrong++;
				}
				else if(alp[guess.charAt(i)-'a'] == 1){
					alp[guess.charAt(i)-'a'] = -1;
					correct++;
				}
				if(wrong == 7){
					System.out.println("You lose.");
					done = true;
					break;
					
				}
					
				else if(correct == totalCorrect){
					System.out.println("You win.");
					done = true;
					break;
				}
			}
			if(!done)
				System.out.println("You chickened out.");
		}
		in.close();
	}
}