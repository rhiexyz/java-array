
/**
 * Write a description of class number6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number6
{
    public static void main (String [] args){
        int [] arr= {1,4,5,8,9};
        int sum = 0, count = 0;
        
        for (int x : arr){
            if(x % 2!=0){
                sum+=x;
                count++;
            }
        }
        double avg = (double) sum/count;
        System.out.println("Average of odd numbers: "  +  avg );
    }
}