import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int numberUser = 0;

        System.out.println("Please enter a number from 1 to 10: ");
        numberUser = Integer.parseInt(scnr.next());
        if (numberUser < 1) {
            System.out.println("You're not very good at reading, are you?");
        }
        if (numberUser > 10) {
            System.out.println("Do you need to go back to elemenary school?");
        }
        if (numberUser > 1 && numberUser < 10) {
            System.out.println("Good job! " + numberUser + " is a great number. Have a great day.");
        }

}
}
