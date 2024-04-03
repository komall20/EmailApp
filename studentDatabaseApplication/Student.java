package studentDatabaseApplication;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private int gradeYear;
    private String courses = "";
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name ");
        this.firstName = in.nextLine();

        System.out.print("Enter student second name ");
        this.lastName = in.nextLine();

        System.out.println("Select student class level\n 1 - First Year\n 2 - Second Year\n 3 - Third Year\n 4 - Final Year ");
        this.gradeYear = in.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear+" "+ studentId);


    }

        //Generate an id
        private void setStudentId(){
            //Grade level + student id
            id++;
            this.studentId = gradeYear +""+ id;
        }

        //Enroll in the courses
    public void enroll(){
        do {
            System.out.print("Enter the course to enroll ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else break;
        }while (1 !=0);

    }

    public void viewBalance(){
        System.out.println("Your balance is $"+tutionBalance);
    }

    public void payTution(){
        viewBalance();
        System.out.print("Enter your payment $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for payment of $"+ payment);
        viewBalance();
    }

    public String showInfo(){
        return "\n\nName: "+firstName+" "+lastName+
                "\nGreade year: "+ gradeYear+
                "\nStudent  id: "+ studentId+
                "\nCourses enrolled: "+ courses+
                "\nBalance: "+ tutionBalance;
    }


}
