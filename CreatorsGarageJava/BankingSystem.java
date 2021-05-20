import java.util.Scanner;
import java.lang.Math;

class BankingSystem
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        Banking obj = new Banking("Ananya", 21062002);
        char choice = '\0';

        System.out.println("\n");
        System.out.println("***************************");
        System.out.println("Press A to check balance");
        System.out.println("Press B to deposit");
        System.out.println("Press C to withdraw");
        System.out.println("Press D to view your previous transaction");
        System.out.println("Press E to exit");
        System.out.println("***************************");
        System.out.println("\n");
        do
        {
        System.out.println("Enter your choice: ");
          choice = console.next().charAt(0);

            switch(choice)
            {
            case 'A':
                System.out.println("***************************");
                obj.balanceAmount();
                System.out.println("***************************");
                break;


            case 'B':
                System.out.println("***************************");
                System.out.println("Enter the amount to be deposited: ");
                int amount1 = console.nextInt();
                obj.deposit(amount1);
                System.out.println("***************************");
                break;



            case 'C':
                System.out.println("***************************");
                System.out.println("Enter the amount to be withdawn: ");
                int amount2 = console.nextInt();
                obj.withdraw(amount2);
                System.out.println("***************************");
                break;


            case 'D':
                System.out.println("***************************");
                System.out.println("Your previous transaction: ");
                obj.previousTransaction();
                System.out.println("***************************");
                break;


            case 'E':
                System.out.println("***************************");
                System.out.println("Exit");
                System.out.println("***************************");
                break;


            default:
                System.out.println("***************************");
                System.out.println("Thanks for using our serives. For any further queries contact at 91-7983244425");
                System.out.println("***************************");

            }
        }
        while(choice!='E');
    }
}

class Banking
{
    int balance;
    int previousAmount;
    String customerName;
    int customerId;

    Banking(String customerName, int customerId)
    {
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerId);
    }

    void deposit(int amount1)
    {
        if(amount1!=0)
        {
            balance = balance + amount1;
            previousAmount = amount1;
        }
    }

    void withdraw(int amount2)
    {
        if(amount2!=0)
        {
            balance = balance - amount2;
            previousAmount = -amount2;
        }
    }

    void previousTransaction()
    {
        if(previousAmount>0)
        {
            System.out.println("Deposited: "+ previousAmount);
        }
        else if(previousAmount<0)
        {
            System.out.println("Withdrawn: "+ Math.abs(previousAmount));
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }

    void balanceAmount()
    {
        System.out.println("Balance: "+ balance);
    }
}
