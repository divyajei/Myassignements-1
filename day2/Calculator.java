package week1.day2;

public class Calculator {
	public int addThreeNumbers(int a,int b,int c) {
		
		
		return  a+b+c;
		
		
	// TODO Auto-generated method stub

}
	
	public float sub(int d,float e) {
		// TODO Auto-generated method stub
		return d-e;

	}
	
	public int divide(int g,int h) {
		// TODO Auto-generated method stub
		
		return g/h;

	}
	
	public static void main(String[] args) {
		
		 Calculator cl=new  Calculator();
		 
		 
		 int sum=cl.addThreeNumbers(5,250, 8);
		 System.out.println(sum);
		 
		 float sub=cl.sub(25, 17.5f);
		 System.out.println(sub);
		 
		 int div = cl.divide(40, 8);
		 System.out.println(div);
		 
				 
	
		
	}
	

	
}
