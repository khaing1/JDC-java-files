import java.util.*;
class MethodSample{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Digit: ");
		int first=sc.nextInt();
		
		System.out.println("Enter Second Digit: ");
		int second=sc.nextInt();
		
		
		//adding
		add(first,second);
		
		//subtraction
		int result=first-second;
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+second);
		System.out.println("Subtraction result: "+result);
		System.out.println();
		
		//adding
		//invoke add method with 2 parameters
		add(120,30);
	}
	 static void add(int first,int second){
		int result=0;
	    result=first+second;
		System.out.println("First Number: "+first);
		System.out.println("Second Number: "+second);
		System.out.println("Adding result: "+result);
		System.out.println();	
}
}