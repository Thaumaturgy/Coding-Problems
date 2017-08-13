import java.util.ArrayList;

public class PE10 {
	public static void main(String[] args) {
		ArrayList<Long> arr = new ArrayList<>();
		
		arr.add(new Long(2));
		for(long i = 3; i < 2000000; i += 2){
			if(isPrime(i))
				arr.add(i);
		}
		
		long sum = 0;
		for(long n : arr){
			sum += n;
		}
		
		System.out.println(sum);
	}
	
	public static boolean isPrime(long n){
		
		if(n < 2) return false;
		
		for(long i = 2; i <= Math.sqrt(n); i++){
			if(n%i == 0) return false;
		}
		
		return true;
	}
}
