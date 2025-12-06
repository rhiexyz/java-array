
/**
 * Write a description of class number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number10
{
    public static void main (String [] args){
        int[] arr = {5, 3, 7, 8, 10};

    for (int x = 0; x < arr.length; x++) {
    if (arr[x] % 2 == 0) {
        System.out.println("First even number index: " + x);
        break;
      }
    }
   }
}