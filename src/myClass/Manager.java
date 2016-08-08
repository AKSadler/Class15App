package myClass;

public class Manager extends Employee {
	
	public Manager(String fName, String lName, String title, int numDirectReports) {
		super(fName, lName, title);
		
	}

	private int numDirectReports;

	public int getNumDirectReports() {
		return numDirectReports;
	}

	public void setNumDirectReports(int numDirectReports) {
		this.numDirectReports = numDirectReports;
	}
public void printName(){
	System.out.println(getlName() + "," + getfName() + getTitle()+ numDirectReports);
}
}
