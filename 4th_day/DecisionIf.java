import java.util.Scanner;

class DecisionIf{
	public static void main(String[]args){
    Scanner input=new Scanner(System.in);
	
	
	System.out.print("Enter Myanmar mark: ");
	int myanmar=input.nextInt();
	
	System.out.print("Enter English mark: ");
	int english=input.nextInt();
	System.out.print("Enter Math mark: ");
	int math=input.nextInt();
	
	int avg=(myanmar+english+math)/3;
	
	if(myanmar<40 ||english<40 || math <40){
		System.out.println("Sorry! You failed");
	}
	else if(avg>=40&&avg<=60)
		System.out.println("Good! You got grade \"C\".");
	}
	else if(avg>60&&avg<=80){
		System.out.println("Great! You got grade \"B\".");
	}
	else{
		System.out.println("Excellent! You got grade \"A\"");
	}
	input.close();
	}
}