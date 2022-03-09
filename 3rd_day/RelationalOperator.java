import java.util.Scanner;

class RelationalOperator{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First num: ");
		double num1=input.nextDouble();
		
		System.out.print("Enter Second num: ");
		double num2=input.nextDouble();
		
		System.out.println();
		//show compare results
		System.out.println("Num1 > Num2 :" +(num1>num2));
		System.out.println("Num1 >= Num2 :" +(num1>=num2));
		System.out.println("Num1 < Num2 :" +(num1<num2));
		System.out.println("Num1 <= Num2 :" +(num1<=num2));
		System.out.println("Num1 == Num2 :" +(num1==num2));
		System.out.println("Num1 != Num2 :" +(num1!=num2));
		
}
}