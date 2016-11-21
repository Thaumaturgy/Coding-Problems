import java.util.*;
public class UVa11503 { //Virtual Friends
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 0; i < cases; i++){
			UFDS set = new UFDS();
			int f = in.nextInt();
			in.nextLine();
			for(int j = 0; j < f; j++){
				String a = in.next();
				String b = in.next();
				set.addNode(a);
				set.addNode(b);
				set.union(a, b);
			}
			
		}
		in.close();
	}

}

class UFDS{
	HashMap<String, Node> names = new HashMap<>();
	
	public Node find(Node n){
		if(n.parent == n) return n;
		return find(n.parent);
	}
	
	public void addNode(String s){
		if(names.get(s) == null)
			names.put(s, new Node(s));
	}
	
	public boolean union(String a, String b){
		Node aRoot = find(names.get(a));
		Node bRoot = find(names.get(b));
		if(aRoot != bRoot){
			aRoot.connection = aRoot.connection + bRoot.connection;
			bRoot.parent = aRoot;
			System.out.println(aRoot.connection);
			return true;
		}
		System.out.println(aRoot.connection);
		return false;
	}
	
	public int connections(Node n){
		return find(n).connection;
	}
}

class Node{
	int connection = 1;
	Node parent = this;
	String data;
	Node(String s){
		data = s;
	}
}