class LogicalTruthTable{
	public static void main(String[]args){
		boolean result;
		result=getTrue() || getTrue();
		System.out.println("T || T :"+result);
		System.out.println();
		
		result=getTrue() || getFalse();
		System.out.println("T || F :"+result);
		System.out.println();
		
		result=getFalse() || getTrue();
		System.out.println("F || T :"+result);
		System.out.println();
		
		result=getFalse() || getFalse();
		System.out.println("F || F :"+result);
		System.out.println();
		
		
	}
	static boolean getTrue(){
		
		System.out.println("True is invoked....");
		return true;
	}
	
	static boolean getFalse(){
		
		System.out.println("False is invoked...");
		return false;
	}
}