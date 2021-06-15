import java.util.*;
import java.lang.*;
public class InventoryManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******");
		System.out.println( "\t\tWELCOME TO INVENTORY MANAGEMENT SYSTEM");
		System.out.println("******");
		System.out.println("Press 1 to Sign Up");
		System.out.println("Press 2 to Log In");
		System.out.println("Press 3 to Exit");
		System.out.println("******");
		int ch1;
		while(true){
			System.out.println("Enter choice: ");
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
				s.showDetails(name, username, email, pass);
				break;

			case 2:
				LogIn l = new LogIn();
				l.run();System.out.println("exit...");

				case 3:
				System.exit(0);
				break;


			}
		}
	}
}

class SignUp{

	void showDetails(String name, String username, String email, String pass) {
		System.out.println("\nName: "+ name + "\nUsername: " + username + "\nEmail Id: " + email + "\nPassword: " + pass );
		System.out.println("SIGN UP SUCCESSFUL!");
		System.out.println("******");
	    }
	}

class LogIn{
	public void run(){
		Scanner input = new Scanner(System.in);
		String username;
    String password;

    System.out.println("**************** ");
    System.out.println("*****  LOG IN   ******* ");
    System.out.println("ENTER VALID USERNAME: ");
    username = input.next();

    System.out.println("ENTER VALID PASSWORD: ");
    password = input.next();


    if(username.equals("user") && password.equals(123))
        System.out.println("LOGGED IN !!");
				else
				{
					System.out.println("INVALID USERNAME OR PASSWORD");
				}


	}

}