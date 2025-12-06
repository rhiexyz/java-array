
/**
 * Write a description of class number17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number17
{
    public static void main (String [] args){
        int[] arr = {10, 50, 20, 40};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

    for (int x : arr) {
    if (x > highest) {
        second = highest;
        highest = x;
    } else if (x > second && x != highest) {
        second = x;
      }
    }
    System.out.println("Second highest: " + second);
    }
}