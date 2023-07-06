package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	
	public static void main(String[] args) {
		
		int ar[]= {98,89,92,93,81,96};
		
	int	len=ar.length;
	
	System.out.println("The lenght of the array is :"+ len);
	
	System.out.println(ar[0]);
	
	Arrays.sort(ar);
	
	for (int i = 0; i < len; i++) {
		
		System.out.println(ar[i]);
		
	}
	
	
		
	}

}
