
/**
 * Write a description of class number9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number9
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, num;

    do {
    System.out.print("Enter a number (0 to stop): ");
    num = input.nextInt();
    sum += num;
    } while (num != 0);

    System.out.println("Sum: " + sum);

    }
}
