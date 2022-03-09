
// htat yay yan
import java.util.Scanner;
class SearchName  {
	

	public static void main(String[]args){

		String [] names=new String[5];
		

		Scanner input1=new Scanner(System.in);
         for(int i=0; i<names.length;i++){
          System.out.print("Enter Name: ");
          names[i]=input1.nextLine();

         }
	
		System.out.print("Enter the name you want to search: ");
		String searchName=input1.nextLine(); // may yan

		boolean found=false;
		int no=0;
          int count=0;
		for(int i=0; i<names.length ; i++){
			no++;
			if(names[i].equals(searchName)){
				found=true;
				break;// may yan 
			}
			if(!names[i].equals(searchName)){
				continue;
			}
			count++;

		}

		if(found){
			System.out.printf("%s is found. %n Search No: %d%n %n Search count:%d%n",searchName,no,count);
		}
		else 
			System.out.println(searchName+"is not found");
	}
}
