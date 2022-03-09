class OverloadMethod  {
	public static void main(String[]args){
add(3,5);
add(3,4,5);
add(2.0,3.8);
add(1);
	}

	static void add(int a){
		System.out.println(" I can't do adding operation with 1 integer ");
	}
	static void add(int a, int b){
      System.out.println("2 integer: "+(a+b));
	}
	static void add(int a, int b,int c){
       System.out.println("3 integer: "+(a+b+c));

	}
	static void add(double a,double b){
		System.out.println("2 double: "+(a+b));
	}
	
}