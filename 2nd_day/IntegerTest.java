class IntegerTest{
	public static void main(String [] args){
		byte first;
		byte second;
		first=100;
		second=30;
		int result= first+second;
		byte anotherResult=(byte)(first+second);
		//System.out.println(first+second);
		System.out.println("From int :"+result);
		System.out.println("From byte"+anotherResult);
	}
}