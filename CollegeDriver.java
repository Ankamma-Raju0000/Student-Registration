package org;

import java.util.Scanner;

public class CollegeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College c = new College();
        boolean a = true;
        while (a) {
            System.out.println("Enter the choice:  \n 1.addStudent    \n 2.displayStudent   \n 3.update studentRollno \n 4.cancel Admission   \n 5.Exit");
            int s = sc.nextInt();
            switch (s) {
                case 1: {
                    System.out.println("Enter student name:");
                    String studentName = sc.next();
                    System.out.println("Enter student rollno:");
                    int studentRollno = sc.nextInt();
                    System.out.println("Enter student Gender:");
                    String studentGender = sc.next();
                    System.out.println("Enter student father name:");
                    String fatherName = sc.next();
                    System.out.println("Enter Student age :");
                    int age = sc.nextInt();

                    c.addStudent(new Student(studentName, studentRollno, studentGender, fatherName, age));
                }
                break;
                case 2: {
                    c.displayStudent();
                }
                break;
                case 3: {
                    c.displayStudent();
                }
                break;
                case 4: {
                    System.out.println("enter the Student name");
                    String studentName = sc.next();
                    c.updateStudentRollno(studentName);
                }
                break;
                case 5: {
                    System.out.println("enter the roll number");
                    int studentRollno = sc.nextInt();
                    c.cancelAdmission(studentRollno);
                }
                break;
                case 6: {
                    a = false;
                    System.out.println("Thank you......!!!!");
                }
                break;
                default: {
                    System.out.println("Enter the valid choice: ");
                }
            }
        }
    }
}
