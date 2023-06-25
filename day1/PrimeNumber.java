package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		//create a class
		//understnding if and for loop in same program
		
		
		int n=13;
		boolean isPrime = false;
		
		if(n==0||n==1) {
			System.out.println(n+" is not a prime number ");
		}
		
		else {
			for (int i = 2; i<n/2; i++) {
				
				int value=n%i;
					
					if (value==0) {
				
				isPrime =true;
				break;
			}
		
		
		
	}
	if(isPrime=true)
	{
		System.out.println(n+"is a prime number");
	}else {
		System.out.println(n+"is a Nonprime number");
	}
			
			
		}
	}

}
