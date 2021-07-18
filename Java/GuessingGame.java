import javax.swing.*;

class GuessingGame{
    public static void main(String[] args)
    {
        int computerNumber = (int)(Math.random()*100+1);
        int userNumber = 0;
        int count = 1;
        System.out.println("The correct guess would be: "+ computerNumber);
        JOptionPane j = new JOptionPane();

        while(userNumber != computerNumber){
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", JOptionPane.WARNING_MESSAGE);
            userNumber = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userNumber, computerNumber, count));
            count++;
        }       
    }

    public static String determineGuess(int userNumber, int computerNumber, int count){
            if(userNumber<=0 || userNumber>100){
                return "Invalid Number";
            }
            else if(userNumber==computerNumber){
                return "Your guess is correct\n Total Guesses: "+count;
            }
            else if(userNumber<computerNumber){
                return "Wrong Guess /t Try Again!";
            }
            else if(userNumber>computerNumber){
                return "Wrong Guess /t Try Again!";
            }
            else{
                return "Wrong Guess /t Try Again!";
            }
        }
}
