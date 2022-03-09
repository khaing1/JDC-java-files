class PassByValue {
	public static void main(String[]args){

		int number=12;
		System.out.println("Origin value: "+number);
		change(number);
		System.out.println("After value: "+number);
	}

	static int change(int test){
		test+=10;
		return test;
	}
}