package org;

import java.util.ArrayList;
import java.util.ListIterator;

public class College 
{
	private String coolegeName;
    private int rank;
    private int fees;
    private Student s;
	public String getCoolegeName() {
		return coolegeName;
	}
	public void setCoolegeName(String coolegeName) {
		this.coolegeName = coolegeName;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
    
     ArrayList<Student> Student=new ArrayList<Student>();
	
	//add Student
	public void addStudent(Student s)
	{
		Student.add(s);
		System.out.println("Student added successfully");
		
	}
	// display Student
		public void displayStudent()
		{
			if(Student.isEmpty())
			{
				throw new noStudentFoundException();
			}
			else
			{
				for(Student s:Student)
				{
					s.studentDetails();
				}
			}
		}
		//updating student rollno based on student name
		public void updateStudentRollno(String studentName)
		{
				boolean isFound=false;
				if(Student.isEmpty())
				{ 
					throw new noStudentFoundException();
				}
				else
				{
					for(Student s:Student)
					{
				       if(s.getStudentName().equals(studentName))
				       {
				    	   s.setStudentRollno(45);
				    	   System.out.println("student rollno updated");
				    	   isFound=true;
				       }
					}
				}
				if(isFound==false)
				{
					throw new invalidStudentNameException();
				}
			}
		//cancel addmission by rollnumber
        public void cancelAdmission(int Rollno)
        {
        ListIterator<Student> i=Student.listIterator();
        	 
		       boolean isCancelled=false;
		       if(Student.isEmpty())
		       { 
			        throw new noStudentFoundException();
		       }
	       	   else
		       {
			        while(i.hasNext())
			        {
			        	Student s1=i.next();
		                if(s1.getStudentRollno()==Rollno)
		                {
		    	           i.remove();
		    	           System.out.println("admission cancelled");
		    	           isCancelled=true;
		               }
			       }
	        	}
		      if(isCancelled==false)
		      {
			       throw new invalidStudentNameException();
		      }
        }
}

