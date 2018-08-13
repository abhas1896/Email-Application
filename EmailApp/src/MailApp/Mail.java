package MailApp;
import java.util.Scanner;
import java.util.Random;

public class Mail {
	
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private String alternateEmailAddress;
	private int mailBoxCapacity = 500;
	private String email;
	private String companyName = "amazon.com";
	
	// constructor to receive firstname and lastname
	
	public Mail(String firstname,String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		
		//System.out.println("EmailCreated:" + this.firstname + " " + this.lastname);
		
		//calling the department method and save its value into our department string
		
		this.department = setDepart();
		//System.out.println("Department is:" + this.department);
		
		this.password = passGenerator();
		System.out.println("your password is:" + this.password);
		
		//now giving complete description of the email as prescribed in the problem statement
		
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companyName;
		//System.out.println(email);
		
		
	}
	
	// get the department
	
	private String setDepart() {
		
		System.out.print("New Worker:" + firstname + "  " + "Department: \n1for sales \n2 for accounts \n3 for marketing \n4 for HR \n0 for none \nEnter the Department: ");
				
				Scanner sc = new Scanner(System.in);
				int deptChoice =  sc.nextInt();
				if(deptChoice == 1) {
					return "sales";
				}else if(deptChoice == 2){
					
					return "accounts";
					
				}else if(deptChoice == 3) {
					
					
					return "marketing";
					
				}else if(deptChoice == 4) {
					
					
					return "HR";
					
				}else {
					
					return "none";
				}
				
	}
	
	//generate the password
	
	private String passGenerator() {
		
		
		String ch1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$&";
		String randompass = "";
		int length = 8;
		
		Random rand = new Random();
		 char [] text = new char[length];
		 
		 for(int i=0;i<length;i++) {
			 
			 text[i] = ch1.charAt(rand.nextInt(ch1.length()));
		 }
		 
		 for (int i=0;i<text.length;i++) {
			 
			 randompass+= text[i];
			 
		 }
				 
		  return randompass;
		
		
		
	}
	
	
	
	//set the mailboxcapacity
	public void boxCapacity(int capacity) {
		
		this.mailBoxCapacity = capacity;
	}
	
	//ask for alternate email address
	
	
	
	public void setAltMail(String altmail) {
		
		
		this.alternateEmailAddress = altmail;
		
	}
	
	//change the password option
	
	public void setPassword(String passwrd) {
		
		this.password = passwrd;
	}
	





   public int getBoxcapacity() {
	   return mailBoxCapacity;
   }
   
   
   public String getAlterMail() {
	   
	   return alternateEmailAddress;
   }
   
   public String getPassword() {
	   
	   return password;
   
   
   }
    public String showInfo() {
    	
    	return "Display Name : " + firstname + " " + lastname + "\n" +
    	"Company mail : " + email + "\n" +
        "MailBox Capacity : " +  mailBoxCapacity  ;   	
    }
}
   
