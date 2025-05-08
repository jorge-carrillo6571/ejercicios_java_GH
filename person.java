public class person{

	private int age; 
	private String name; 
	private String surname; 

	public person(int age, String name, String surname){


		this.age = age; 
		this.name=name; 
		this.surname= surname; 

	}

	public String getName(){
		return this.name; 
	}

	public int getAge(){
		return this.age; 
	}

	public String getSurname(){
		return this.surname; 
	}
}
