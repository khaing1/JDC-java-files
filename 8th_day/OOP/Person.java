// Data class (or) entity
//POJO (Plain Old Java Object)


class Person  {
	
	private int age;
	private String address;
    private	String city;
	private String name;



	//Default Constructor (or) No Argument Constructor 
	// construtor mhr return type htae loh ma ya woo 
	public Person(){

	}

public void Person(){

}
	//setter
  public void setName(String name){
  	this.name=name;

  }
public void setCity(String city){
	this.city=city;
}

public void setAddress(String address){
this.address=address;
}

public void setAge(int age){
	this.age=age;
}
   

   // getter
public String getName(){
	return name;
}
public String getCity(){
	return city;
}
public String getAddress(){
	return address;
}
public int getAge(){
	return age;
}

}
