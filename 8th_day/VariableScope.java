class VariableScope  {
	static int number=32;
// non static 
	String name="Developer";
	String fruit="Apple";// object ka pai tr
	public static void main(String []args){
		int number=100;
		System.out.println("Local Variable: "+number);
		System.out.println("static Variable: "+VariableScope.number);
        VariableScope var=new VariableScope();
        var.test();
        var.other("orange");

	}
	void other(String fruit){
		System.out.println("Local Variale: "+fruit);
		System.out.println("Instance Variable: "+this.fruit); //non static kyg lr so tr may yan
	}

	void test(){
		String name="JavaSE";
		System.out.println("Local Variable: "+name);
		System.out.println("Instance variable: "+this.name); // object 

	}
}