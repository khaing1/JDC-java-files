class MultiDimension{
	public static void main(String[] args){
		String[][] dogs=new String[4][2];

		System.out.println("Rows: "+dogs.length);

        System.out.println("Colums: "+dogs[0].length);

        String[][] devices={
        	{"Mi8","400000"},
        	{"iPhone 11","2400000"},
        	{"Mate 30","3400000"},
        	{"Samsung Note 10","1500000"}

        };
        System.out.println("Rows: "+devices.length);
        System.out.println("Columns: "+devices[0].length);



       // System.out.print(devices[0][0]+"");

        for (int i=0;i<devices.length;i++){
        	for(int j=0;j<devices[0].length;j++){
        		System.out.printf("%-15s",devices[i][j]);
        		
        	}
        	System.out.println();
        }

	}
}