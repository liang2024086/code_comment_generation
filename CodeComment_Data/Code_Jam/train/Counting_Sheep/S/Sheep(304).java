package methodEmbedding.Counting_Sheep.S.LYD299;


/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Sheep
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num = Integer.parseInt(input.nextLine());
        int[] alphabet = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i = 0; i < num; i++) {
            int sheep = Integer.parseInt(input.nextLine());
            
            boolean[] storage = {false, false, false, false, false, false, false, false, false, false};
            boolean check = false;
            
            int j = 1;
            int multiple = 0;
            
            while (!check && multiple <= 2000000000 && j <= 100) {
                
                multiple = sheep * j;
                
                //System.out.println("Multiple: " + multiple + " j: " + j);
                
                String a = "" + multiple;
                
                //System.out.println("A: " + a);
                
                char[] b = a.toCharArray();
                
                for (int k = 0; k < b.length; k++) {
                    storage[Character.getNumericValue(b[k])] = true;
                    //System.out.println("b: " + b[k]);
                    //System.out.println("storage: " + storage[Character.getNumericValue(b[k])]);
                    //System.out.println("character: " + Character.getNumericValue(b[k]));
                }
                
                for (int k = 0; k < 10; k++) {
                    //System.out.println("storage: " + storage[k]);
                    check = (storage[k]) ? true : false;
                    if (!check) {
                        break;
                    }
                }
                
                //System.out.println("check: " + check);
                
                j++;
            }
            
            System.out.println("Case #" + (i + 1) + ": " + (check ? "" + multiple : "INSOMNIA"));
        }
    }
}
