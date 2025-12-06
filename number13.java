
/**
 * Write a description of class number13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number13
{
    public static void main (String [] args){
        int[] grades = {99, 60, 75, 80, 90};
        int pass = 0, fail = 0;

    for (int g : grades) {
    if (g >= 75) pass++;
    else fail++;
    }

    System.out.println("Pass: " + pass);
    System.out.println("Fail: " + fail);
    
    }
}