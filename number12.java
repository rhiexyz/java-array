
/**
 * Write a description of class number12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
public class number12
{
     public static void main (String [] args){
        int[] num = {2, 3, 2, 5, 2, 7};
        int target = 2;
        int count = 0;

    for (int x : num) {
        if(x == target)
        count++;
        }
    if (count >=3)   
        JOptionPane.showMessageDialog(null, target + " appears at least 3 times ");
        else
        JOptionPane.showMessageDialog(null, " Not enough occurances.");
    }
    
}