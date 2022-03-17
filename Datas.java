package arraylisttask;

import java.util.LinkedList;
import java.util.Scanner;

public class Datas {
	Scanner sc=new Scanner(System.in);
	LinkedList <Student> al1= new LinkedList<Student>();
	
	public void dataInput(){
		int id;
		String name,gender;
		
		Student stu=new Student();
		
		
		System.out.print("Enter the Student id : ");
		id=sc.nextInt();
		System.out.print("Enter the Student Name : ");
		name=sc.next();
		System.out.print("Enter the Student Gender : ");
		gender=sc.next();
		//al1.add(new Student(id,name,gender));
		stu.setID(id);
		stu.setName(name);
		stu.setGender(gender);
		al1.add(stu);
		System.out.println("");
		}

	public void showSpecificData() {
		for(Student x:al1) {
			System.out.println("Enter any one of the id");
			int a=sc.nextInt();
			if(a==x.getID()) {
			System.out.println("Student ID     : "+x.getID());
			System.out.println("Student Name   : "+x.getName());
			System.out.println("Student Gender : "+x.getGender());

			}
		
		}}

	
	public void showAllData() {
		for(Student x:al1) {
			System.out.println("Student ID     : "+x.getID());
			System.out.println("Student Name   : "+x.getName());
			System.out.println("Student Gender : "+x.getGender());
		//	System.out.println(((Student)al1).getID());
			System.out.println("");
			}
}
}
