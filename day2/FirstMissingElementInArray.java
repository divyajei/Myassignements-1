package week1.day2;

import java.util.Arrays;

public class FirstMissingElementInArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,7,6,8};
		
		int leng  = arr.length;
		
		
		Arrays.sort(arr);
		
		for (int i = 1; i < leng; i++) {
			
			if(arr[i-1]!= i)
			{
				System.out.println(i);
				break;
		}
		

		
	}
	}}


