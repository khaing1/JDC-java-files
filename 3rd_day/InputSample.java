import java.util.Scanner;
// no need in most programs      
import java.lang.*;
class InputSample{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String name=input.nextLine();
		System.out.print("Enter Your age: ");
		String age=input.nextLine();
		System.out.print("Enter your university : ");
		String uni=input.nextLine();
		//show greeting message
		System.out.println("Your name is " +name);
		System.out.println("You are "+age+ " years old");
		System.out.println("You are attending "+uni);
		
		input.close();
	}
}