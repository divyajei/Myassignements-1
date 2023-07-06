package week1.day2;

public class FindUnique {
	
	public static void main(String[] args) {
		
		int a[]= {2,2,1};
		
		int l=a.length;
		
		
		for (int i = 0; i < l;  i++) {
			
			for (int j = i+1; j < l; j++) {
				
				if (a[i]!=a[j]) {
					
					System.out.println(a[i]);
					
				}
				
			}
			
		}
	}

}
