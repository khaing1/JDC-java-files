import java.util.Scanner;

 class CurrencyExchange{
	 public static void main(String []args){
	 System.out.print("Enter MMK rate for 1 JPY :");
	 Scanner input1=new Scanner(System.in);
	 int Japan=input1.nextInt();
	 System.out.print("Enter MMK rate for 1 USD :");
	 Scanner input2=new Scanner(System.in);
	 int American=input2.nextInt();
	 System.out.print("Enter MMK rate for 1 SGD :");
	 Scanner input3=new Scanner(System.in);
	 int Singapore=input3.nextInt();
	 System.out.println();
	 System.out.print("How many amount do you want to exchange? ");
	 Scanner input=new Scanner(System.in);
	 int money=input.nextInt();
	 System.out.println();
	 
	 float Japanval=(float)money/Japan;
	 float Americanval=(float)money/American;
	 float Singaporeval=(float)money/Singapore;
	 System.out.println(money+" MMK will get "+Japanval+ " JPY");
	 System.out.println(money+" MMK will get "+Americanval+ " USD");
	 System.out.println(money+" MMK will get "+Singaporeval+ " SGD");
 }
 }