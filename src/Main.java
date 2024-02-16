import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //JAVA CODSOFT INTERNSHIP TASK 1.

        /*1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

         */
        //In this program, I have used the do-while loop;
        // hence it is used to execute a block of statements continuously until the given condition is true
        int lowNumber = 1;
        int highNumber = 100;
        int counts = 5;
        int winnings = 0;

        //Question one.
        //Generate a random number within a specified range, such as 1 to 100.
        do {
            //instantiating Random class
            Random random = new Random();

            //this will generate random numbers to 100 inclusive
            int number = random.nextInt(100);
            System.out.println("Generated random number = " + number);
            int attempts = 0;
            int guess;

            //Question two
            //Prompt the user to enter their guess for the generated number.
            System.out.println("Input a number ranging between " + lowNumber + " and " + highNumber);

            //checking if the limit is reached!
            while (attempts < counts) {
                System.out.print("Input any number: ");
                guess = scanner.nextInt();
                attempts++;

                //Question three
                //comparing user's input with the generated number
                //user's guess is the same as the generated value
                if (guess == number) {
                    System.out.println("correct guess in  attempt " + attempts);
                    winnings++;
                    break;


                    //comparing user's input with the generated value
                    //user's guess is too low
                } else if (guess < number) {
                    System.out.println("oops!,too low.try next");

                    //user's guess is high
                } else {
                    System.out.println("oops!,too high.try next");
                }
            }

            //Question five
            //Limit the number of attempts the user has to guess the number.
            if (attempts == counts) {
                System.out.println("exiting,correct number was: " + number);
               // break;
            }

            //here,I have used equalsIgnoreCase()method which returns true if the strings Y/N are equal
            //and false if the two are !=

            //Question six,four
            //Add the option for multiple rounds, allowing the user to play again.
            System.out.println("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes") );

             //Question seven
            // Display the user's score, which can be based on the number of attempts taken or rounds won.
            System.out.println("In total,you've won : " + winnings);
            //to avoid leak, close the scanner input method!
            scanner.close();
        }
    }
























