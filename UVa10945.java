import java.util.*;
public class UVa10945 { //Mother Bear
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		while(true){
			StringBuffer temp = new StringBuffer(in.nextLine().replaceAll("[^A-Za-z]", ""));
			if(temp.toString().equals("DONE")) break;
			if(temp.toString().equalsIgnoreCase(temp.reverse().toString()))
				arr.add("You won't be eaten!");
			else
				arr.add("Uh oh..");
		}
		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) != null)
				System.out.println(arr.get(i));
		}
		in.close();
	}
}
