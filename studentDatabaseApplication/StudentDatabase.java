package studentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

        System.out.print("Enter number of student to enroll: ");
        Scanner in = new Scanner(System.in);
        int noOfStudent = in.nextInt();
        Student[] students = new Student[noOfStudent];

        // create n number of new students

        for(int n=0; n<noOfStudent; n++) {
            students[n]= new Student();
            students[n].enroll();
            students[n].payTution();
        }

        for(int n=0; n<noOfStudent; n++) {
            System.out.println(students[n].showInfo());
        }
        }
}
