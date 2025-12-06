
/**
 * Write a description of class number18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number18
{
    public static void main(String[] args) {
    int[] arr = {3, 5, 2, 3, 8};

    boolean hasDuplicate = false;

    for (int x = 0; x < arr.length; x++) {
        for (int j = x + 1; j < arr.length; j++) {
            if (arr[x] == arr[j]) {
                hasDuplicate = true;
                break;
            }
        }
        if (hasDuplicate) break;
    }

    if (hasDuplicate) {
        System.out.println("Array has duplicate values.");
    } else {
        System.out.println("Array has no duplicate values.");
    }
}
}