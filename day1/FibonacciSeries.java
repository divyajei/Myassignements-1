package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {
public static void main(String[] args) {
	// my learnings from this code
	//1)Create a class
	//1) initialize the variable
	//2) writing code logic to print fibonacci series
	 
	int firstnum=0;
	int secnum=1;
	int sum=0;
	int range =8;
	
	System.out.println(firstnum);
	
for (int i = 1; i <range;i++) {
	
sum=firstnum+secnum;
firstnum =secnum;
secnum=sum;
System.out.println(sum);
	
}
		
	}
	 
}

