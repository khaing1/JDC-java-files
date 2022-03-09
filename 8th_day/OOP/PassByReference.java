class PassByReference{
	public static void main(String[]args){
		int [] numbers={12,22,32};

		System.out.print("Origin: ");
		for (int i: numbers){
			System.out.println(i+"");
		}
		change(numbers);
		System.out.print("After: ");
		for (int i: numbers){
			System.out.println(i+"");
		}

	}

	static void change(int[] a){
		for (int i=0;i<a.length;i++){
			a[i]+=10;
			
		}
	}
}