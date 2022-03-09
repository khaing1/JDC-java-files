class EmployeeMain{
	public static void main(String[]args){
		Employee emp=new Employee();
		emp.name="kyaw kyaw";
		emp.experience=3;
		emp.salary=30_0000;
    emp.phone="09692921243";
		emp.address="Yangon";
		System.out.println("Name: "+emp.name);
		System.out.println("Experience: "+emp.experience);
		System.out.println("Salary: "+emp.salary);
    System.out.println("Phone Number: "+emp.phone);
		System.out.println("Address: "+emp.address);


		Employee emp2=new Employee();
		System.out.println("Name: "+emp2.name);
		System.out.println("Experience: "+emp2.experience);
		System.out.println("Salary: "+emp2.salary);
    System.out.println("Phone Number: "+emp2.phone);
		System.out.println("Address: "+emp2.address);


	}
	
}