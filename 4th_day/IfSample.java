class IfSample{
	public static void main(String []args){
		String name="adjmk";
		if(name.equals("admin")){
			System.out.println("Hello! Admin.");
		}
		else{
			System.out.println("Welcome! User");
		}
		
		if(true){
			System.out.println("Hello! Admin.");
		}
		else{
			System.out.println("Welcome! User");
		}
	}
}