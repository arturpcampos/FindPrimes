import java.util.ArrayList;

public class FindPrimes {
	
	public static void main(String[] args) {
		
		System.out.println(findPrimes(1 , 100));
		
	}
	
	public static ArrayList<Integer> findPrimes(int a, int b){
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int n = a; n <= b; n++ ) {
			
			boolean prime = true;
			int i = 2;
			
			while(i <= b/2) {
				if(n % i ==0) {
					prime = false;
					break;
				}					
				
				i++;

			}
		
			if(prime) {
				primes.add(n);
			}
		
		}
	
		
		return primes;
	}
}
