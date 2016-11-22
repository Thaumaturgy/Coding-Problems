import java.util.Scanner;
// one class needs to have a main() method
public class cf136A{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] giveTo = new int[n+1];
      int[] receivedFrom = new int[n+1];

      for(int i = 1; i <= n; i++){
          int p = in.nextInt();
          giveTo[i] = p;
          receivedFrom[p] = i;
      }

      for(int i = 1; i <= n; i++){
          System.out.print(receivedFrom[i]);
      }
  }
}
