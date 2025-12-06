
/**
 * Write a description of class number5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number5
{
    public static void main (String [] args){
        int [] arr= {4,8,2,7,9};
        int target = 7;
        
        for(int x = 0; x < arr.length; x++){
            if(arr[x]==target){
                System.out.println("Found at index "  +  x );
                break;
            }
        }
    }
}
