/**
 * Write a description of class number20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number20
{
    public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 18, 50};

        System.out.print("Even numbers greater than 20: ");

        for (int x : arr) {
            if (x > 20 && x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
