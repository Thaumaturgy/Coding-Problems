//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.Scanner;
import java.math.BigInteger;
// one class needs to have a main() method
public class cf546A{
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
  	BigInteger price = new BigInteger(in.next());
    int initDollars = in.nextInt();
    int n = in.nextInt();
    BigInteger sum = new BigInteger("0");
    for(int i = 1; i <= n; i++){
    	sum = sum.add(price.multiply(BigInteger.valueOf(i)));
    }
    
    if(sum.compareTo(BigInteger.valueOf(initDollars)) == 1)
      System.out.print(sum.subtract(BigInteger.valueOf(initDollars)));
    else
      System.out.print(0);
  }
}