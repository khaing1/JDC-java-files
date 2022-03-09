class BubbleSort{
	public static void main(String[] args){
 int[] values={9,120,28,7};
 show(values,"Original");

 int[] result=sort(values);
 show(result,"Sorted");

	}
	//why return ma pyn? 
	static int[] sort(int[] num){
		int temp;
      for(int i=0;i<num.length-1;i++){
      	for(int j=0;j<num.length-1;j++){
      		if(num[j]>num[j+1]){
      			temp=num[j];
      			num[j]=num[j+1];
      			num[j+1]=temp;
      		}
      	}

      }

         return num;
	}
	//pyn kyi yan
	static void show(int[]values,String output){
		//**printf
		System.out.printf("%s: ",output);
		for (int num:values){
			System.out.println(num+"");
		}
		System.out.println();
	}

	//static void showOrigin(int[] values){

       //  System.out.print("Original: ");
         //for(int num: values){
       //  	System.out.println(num+"");
        // }
         //System.out.println();
	//}

}