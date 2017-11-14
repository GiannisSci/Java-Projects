
public class SecClass {
	
	
	   private String name;
	   private String surname;
	   private int age;
	   
	   
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Your name is "+ name);
		
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
		
		System.out.println("Your surnname is "+ surname);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		if (age<=18) {
			
			System.out.println("You are not adult");
			
		}else {
			System.out.println("You are adult");
			
		}
		
	}
	
	
	

}
