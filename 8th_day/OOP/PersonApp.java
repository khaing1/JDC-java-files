class PersonApp {
	public static void main(String []args){
		Person p=new Person();

		p.setName("Aung Kyaw");
		p.setAge(24);
		p.setAddress("San Chaung");
		p.setCity("Yangon");

		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		System.out.println("Address: "+p.getAddress());
		System.out.println("City: "+p.getCity());
	}
}