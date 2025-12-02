
/**
 * Write a description of class number1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number1
{
   public static void main (String [] args){
       Scanner input = new Scanner (System.in);
       
       int num;
       
       do{
           System.out.print("Enter a number (1-100): ");
           
           num= input.nextInt();
           if (num <1 || num> 100){
           System.out.print("Invalid number: " + num);}
           
       }while (num<1 || num>100);
       
        System.out.print("Valid number: " + num);
        
       }
   }