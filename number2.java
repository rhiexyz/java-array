
/**
 * Write a description of class number2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number2
{
   public static void main (String [] args){
       int[] arr = {3,7,1,7,9,7,4,2,7,8};
       int count = 0;
       
       for(int x : arr){
           if (x==7){
               count++;
           }
       }
       System.out.print("7 appears " + count + " times.");
    }
}