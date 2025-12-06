
/**
 * Write a description of class number7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number7
{
    public static void main(String[] args) {

        int[] arr = {-2, 5, -7, 3};

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] < 0) {
                arr[x] *= -1;
            }
        }

       
        for (int x : arr) {
            System.out.println(x);
        }
    }
 }