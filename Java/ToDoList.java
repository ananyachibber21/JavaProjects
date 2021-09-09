import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	ArrayList<String>l = new ArrayList<String>();
		System.out.print("------------- To Do Lost -------------");
        System.out.println();
        System.out.println("Press 1. to add item");
        System.out.println("Press 2. to delete item");
        System.out.println("Press 3. to show list");
        System.out.println("Press 4. to exit");
        System.out.print("--------------------------------------");
        System.out.println();
        int choice;
        do {
        	System.out.println("Enter the task you want to perform:");
            choice = in.nextInt();
            switch(choice) {
            case 1:
            	System.out.println("--------------------------------------");
            	System.out.println("Enter the no. of items you want to add: ");
            	int n1 = in.nextInt();
            	for(int i = 0; i < n1; i++) {
            		String item = in.next();
            		l.add(item);
            	}
            	break;
            	
            case 2:
            	System.out.println("--------------------------------------");
            	System.out.println("Enter the no. of items you want to delete: ");
            	int n2 = in.nextInt();
            	for(int i = 0; i < n2; i++) {
            		String item = in.next();
            		l.remove(item);
            	}
            	break;
            	
            case 3:
            	System.out.println("--------------------------------------");
            	System.out.println("Your To Do List contains the following items");
            	System.out.println(l);
            	break;
            	
            case 4:
            	System.out.println("--------------------------------------");
                System.out.println("Exit");
                System.out.println("Thanks for using our serives. For any further queries contact at 91-7983244425");
                break;
            	
            default:
            	System.out.println("--------------------------------------");
                System.out.println("Wrong Input....Try Again!!!");
                System.out.println("--------------------------------------");
                break;
            }
        }  while(choice!=4);     
	}
}
