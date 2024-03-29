package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int mailBoxCapacity =500;
    private String department;
    private String email;
    private String alternateEmail;
    private int defaultPasswordLength = 8;
    private String companySuffix = "aexpCompany.com";

    //Constructor to receive firstname and lastname

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created "+ this.firstName + this.lastName);

        //call the method
        this.department = setDepartment();
        System.out.println("Department :"+ this.department);

        //call a method that return random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password "+ this.password);

        //email creation
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Your email is "+ email);
    }

    //ask for the department
    private String setDepartment(){
        System.out.print("New worker: "+ firstName+". Enter the department\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter the department code :");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if(depChoice == 1) return "sales";
        else if(depChoice==2) return "development";
        else if(depChoice == 3) return "accounting";
        else return "";
    }

    //Generate a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRST123456789@#$&";
        char[] password = new char[length];

        for (int i=0; i<length; i++){
            int random = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set the mail box capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail= altEmail;
    }

    //change the password
    public void changeThePassword(String newPassword){
        this.password = newPassword;
    }

    public int getMailBoxCapacity(){ return mailBoxCapacity;}
    public String getAlternateEmail(){return getAlternateEmail();}
    public String getPassword(){return password;}

    public String showInfo(){
        return "firstName "+ firstName+" "+"lastName "+ lastName+
                "\nCompany Email "+ email+
                "\nmailBoxCapacity "+ mailBoxCapacity+" mb";
    }



}
