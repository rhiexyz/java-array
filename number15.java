
/**
 * Write a description of class number15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number15
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
    int[] arr = new int[5];

    for (int x = 0; x < 5; x++) {
    System.out.print("Enter number: ");
    arr[x] = input.nextInt();
    }

    System.out.print("Numbers > 50: ");
    for (int j : arr) {
    if (j > 50) {
        System.out.print(j + " ");
    }
  }
 }
}