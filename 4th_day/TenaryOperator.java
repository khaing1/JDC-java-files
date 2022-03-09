import java.util.Scanner;

class TenaryOperator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name=input.nextLine();
		
		System.out.print("Enter your age: ");
		int age=input.nextInt();
		
		String message=age<18 ? "You are too young !" : "You are an adult";
		
		System.out.println();
		System.out.println("Hello!"+name);
		System.out.println(message);
	}
}