package arraylisttask;

import java.util.Date;

public class Student {
	private int id;
	private String name,gender;
	private Date joinDate;
	
	//getter for id
	public int getID() {
		return id;
	}
	//setter for id
	public void setID(int id) {
		this.id=id;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name=name;
	}
	
	// getter for gender
	public String getGender() {
		return gender;
	}
	//setter for gender
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	//getter for date
	public Date getDate() {
		return joinDate;
	}
	//setter for date
	public void setDate(Date joinDate) {
		this.joinDate=joinDate;
	}

}
