package org;

public class Student 
{
	private String studentName;
	private int studentRollno;
	private String studentGender;
	private String fatherName;
	private int age;
	
	public Student() {
		
	}

	public Student(String studentName, int studentRollno, String studentGender, String fatherName, int age)
	{
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.studentGender = studentGender;
		this.fatherName = fatherName;
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollno() {
		return studentRollno;
	}

	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void studentDetails(){
		   System.out.println("enter student name:"+ studentName);
		   System.out.println("enter student roolno:"+ studentRollno);
		   System.out.println("enter student gender :"+ studentGender);
		   System.out.println("enter student father name : "+ fatherName);
		   System.out.println("enter student age :"+age);

	}
}



