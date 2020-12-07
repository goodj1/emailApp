package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordlength = 8;
	private String alternateEmail;
	private String companysuffix = "acoustics";
	
	//Constructor to receive first name and last name (Instead of defining it outright, I'm defining it through this API)
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);
		
		//Call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department );
		
		//Elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companysuffix + ".com";
		System.out.println("Your Email is: " + email);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordlength);
		System.out.println("Your Password is: " + this.password);
		
	}
	//Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENTS \n1 for Sales \n2 for Marketing \n3 for HR \n4 for IT" + "\nPlease input department: ");
		//Get user input
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) { return "Sales"; }
		else if (deptChoice == 2) { return "Marketing"; }
		else if (deptChoice == 3) { return "HR"; }
		else if (deptChoice == 4) { return "IT"; }
		//Company name - perhaps?
		else { return "";}
		
	}
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789$@#%";
		char[] password = new char[length];
		for (int j=0; j<length; j++) {
			//To generate random number (math.radom is between 0-1 therefore I multiplied by the length of the string to generate multiple random integers)
			int random = (int) (Math.random() * passwordSet.length());
			password[j] = passwordSet.charAt(random);// Array password at position j should equal passwordSet on the random variable
		}
		return new String(password);
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change password 
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Getters
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	
}
