import java.util.*;
import java.lang.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Inventory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println( "\tWELCOME TO INVENTORY MANAGEMENT SYSTEM");
		System.out.println("****************************************");
		System.out.println("Press 1 to Sign Up");
		System.out.println("Press 2 to Log In");
		System.out.println("Press 3 to Exit");
		System.out.println("****************************************");
		int ch1;		
		while(true){	
			System.out.println("Enter Menu choice: ");
			ch1 = sc.nextInt();
			switch(ch1)
			{ 
			case 1:  
				SignUp s = new SignUp();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Username: ");
				String username = sc.next();
				System.out.println("Enter Email Id: ");
				String email = sc.next();
				System.out.println("Enter Password: ");
				String pass = sc.next();
				System.out.println("Re-enter Password: ");
				String repass = sc.next();
				s.showDetails(name, username, email, pass, repass);
				break;
				
			case 2:
				LogIn l = new LogIn();
				l.run();
				break;
				
			case 3:
				System.out.println("Thank You for using Our Services!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong input");
                break;
				}
		}
	}
}
		
class SignUp{

	void showDetails(String name, String username, String email, String pass, String repass) {
		System.out.println("\nName: "+ name + "\nUsername: " + username + "\nEmail Id: " + email + "\nPassword: " + pass + "\nRe-Pass: " + repass );
		System.out.println("SIGN UP SUCCESSFUL!");
		System.out.println("****************************************");
	    }
	}	

class LogIn{
	ArrayList<String>list = new ArrayList<String>();
	void run() {
		Scanner input = new Scanner(System.in);
		String username;
		String password;
		System.out.println("****************************************");
		System.out.println("****************LOG IN*****************");			
		System.out.println("Enter Username: ");
		username = input.next();
		System.out.println("Enter Password: ");
		password = input.next();
		
		if(username.equals("user") && password.equals("123")) {
			System.out.println("\nUsername: "+ username + "\nLOGIN SUCCESSFUL!");
			System.out.println("****************************************");
			
			System.out.println("Available Items:GROCERY::BASIC MEDICINES::STATIONARY::FRUITS AND VEGETABLES::ELECTRONICS");
			boolean y = true;
			do {
				System.out.println("****************************************");
				System.out.println(" Press 1 to Add an item\n Press 2 to edit the item\n Press 3 to search an item\n Press 4 to delete an item\n Press 5 To see the Total\n Press 6 to Print Items\n Press 7 to Exit");
				System.out.println("****************************************");
				int ch2;
				System.out.println("Enter Task choice: ");
				ch2 = input.nextInt();
				switch(ch2) 
				{
				case 1:
	                insert();
	                break;
	            case 2:
	                edit();
	                break;
	            case 3:
	                search();
	                break;
	            case 4:
	                delete();
	                break;
	            case 5:
	                total();
	                break;
	            case 6:
	                print();
	                break;
	            case 7:
	                toexit();
	                break;
	            default:
	                System.out.println("Wrong input");
	                break;
				}
				Scanner in = new Scanner(System.in);
				System.out.println("Want to process more?y/n");
	            String z=in.nextLine();
	            char c=z.charAt(0);
	            if( c=='n')
	                y=false;
			}
			while(y!=false);
			
			
		}
		
		else {
			System.out.println("\nLOGIN FAILED!" + "\nWrong Username or Password" + "\nTRY AGAIN");
		}
	}
	
	void insert() {
		Scanner in=new Scanner(System.in);
	       
        boolean y=true;
       do{
            System.out.println("Enter item to add in list");
            String item=in.nextLine();
            if(item==null)
                System.out.println("0 is not alowed");
            else
                list.add(item);
            System.out.println("Want to insert more?y/n");
            String x=in.nextLine();
            char ch=x.charAt(0);
            if( ch=='n')
                y=false;
         }
       while(y!=false);
   }
	
	void edit() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter item you want to add");
	    String item2=in.next();
	    if(item2== "00") {
		   System.out.println("num is not alowed");
	    }
		 else {
			 try{
				 System.out.println("Enter the position you want ot add: ");
				 int item1 = in.nextInt();
				 list.set(item1, item2);
			}
			 catch(IndexOutOfBoundsException e){
				 System.out.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
			 }
	   }
	}
	
	void search() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter item to search");
		String item3 = in.next();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==item3) {
				System.out.println(item3+" is  PRESENT at Index "+i);
			}
		}
		if(list.lastIndexOf(item3)==-1) {
            System.out.println(item3+" is NOT PRESENT");
         }
	}
	
	void delete() {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter item you want to delete");
	        String item4=in.nextLine();
	        list.remove(item4);
		}
		catch(Exception e) {
			System.out.println("Item Not Found");
		}
	}
	
	void total() {
		System.out.println("total item in list are "+ list.size());
	}
	
	void print() {
		if(list.isEmpty())
	           System.out.println("List is empty ");
	       else
	            System.out.println("Items of lists are:");
	       for(int i=0 ; i<list.size();i++)
	             System.out.println("index "+i+" : "+ list.get(i)+" ");
	       try {
				FileWriter writer = new FileWriter("Invent.csv");
				BufferedWriter bwr = new BufferedWriter(writer);
				for(int i=0;i<list.size();i++) {
					bwr.write(list.get(i)+"\n ");
				}
				bwr.close();
				System.out.println("succesfully written to a file");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	void toexit() {
		System.out.println("exit...");
		System.exit(0);
	}
}




