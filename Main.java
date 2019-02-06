
/*
 *
 * @author (Pineapple McGee)
 * @version (1.0)
 */


import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    int count = 0;
    int a = 1 + (int) (Math.random() * 299);
    int guess = 0;

    System.out.println("Hello, mere mortal. I'm thinking of a number from 1 to 300."
    + " Exceeding the set number of tries means death. Good luck.");

    while (guess != a) {
        guess = keyboard.nextInt();
        count++;
        if (guess > a) {
            System.out.println("Lowerrr...");
        } else if (guess < a) {
            System.out.println("Higherrr...");
        }
    }
    System.out.println("Hmm, it took you "
        + count + " tries. You live...for now.");
       
}
}
