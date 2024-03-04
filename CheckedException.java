
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Robin Dupuis
 */
public class CheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Enter a number : ");
        int number = input.nextInt();
            System.out.println("The number you typed is "+number);
        }
        catch(InputMismatchException e){
            System.out.println("You cannot enter anything besides numbers!");
        }
    }
}
