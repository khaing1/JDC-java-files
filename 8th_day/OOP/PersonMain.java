class PersonMain {
	public static void main(String args[]){
		Person p1=new Person();
		System.out.println("Reference location: "+p1);
		System.out.println("NAME: "+p1.name);
		System.out.println("Age: "+p1.age);
		System.out.println("Address: "+p1.address);
		System.out.println("City: "+p1.city);


		p1.name="Thida";
		p1.age=22;
		p1.address="Tarmwe";
		p1.city="Yangon";

        System.out.println("NAME: "+p1.name);
		System.out.println("Age: "+p1.age);
		System.out.println("Address: "+p1.address);
		System.out.println("City: "+p1.city);

		Person p2=new Person();

		System.out.println("NAME: "+p2.name);
		System.out.println("Age: "+p2.age);
		System.out.println("Address: "+p2.address);
		System.out.println("City: "+p2.city);



	}
}