
/**
 * Write a description of class number4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number4
{
    public static void main (String [] args){
        int[] arr= {5,9,1,3,8};
        int min = arr[0];
        int max = arr[0];
        
        for (int x: arr){
            if(x < min)min = x;
            if(x > max)max = x;
        }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }
