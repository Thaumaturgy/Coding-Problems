//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.math.*;
import java.util.Scanner;
// one class needs to have a main() method
public class Combi
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    in.nextLine();
    for(int i = 0; i < a; i++){
      BigInteger n = new BigInteger(in.nextLine());
      BigInteger r = new BigInteger(in.nextLine());

      BigInteger ans = permu(n).divide(permu(r).multiply(permu(n.subtract(r))));
      System.out.println(ans);
    }
    
  }
  
  public static BigInteger permu(BigInteger n){
  	if(n.compareTo(BigInteger.ZERO) == 0)
       return new BigInteger("1");
       
    return n.multiply(new BigInteger(n.subtract(BigInteger.ONE).toString()));
  
  }
}

