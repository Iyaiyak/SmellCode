package Original.Dispensable;


public class DataClass {
	private String firstName;
	private String lastName;
	
	public DataClass(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

//class hanya berisi setter getter untuk field firstName dan lastName.
File Java User (File Berbeda)
public class User {
	private FullName fullName;
	
	private String address;
	private String phone;
	
	//...
	//another User behaviors...
	//...
	
	public void login() {
		//...
	}
	
	public void logout() {
		//...
	}
}