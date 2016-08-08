package myClass;

public class Employee extends Person{
	private String title;

	public Employee(String fName, String lName, String title) {
		super(fName, lName);
		setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Override 
	public void printName(){
		System.out.println(getlName() + getfName() + title);
}
	
}
