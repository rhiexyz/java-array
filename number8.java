
/**
 * Write a description of class number8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number8
{
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];

        for (int x = 0; x < A.length; x++) {
            B[x] = A[x];
        }

        System.out.print("Array B: ");
        for (int j : B) {
            System.out.print(j + " ");
        }
    }
}