package methodEmbedding.Counting_Sheep.S.LYD732;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxLoop = 1000;
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            ArrayList<String> nums = new ArrayList<String>();
            nums.add("0");
            nums.add("1");
            nums.add("2");
            nums.add("3");
            nums.add("4");
            nums.add("5");
            nums.add("6");
            nums.add("7");
            nums.add("8");
            nums.add("9");
                   
            
         
            String s = input.next();
            int baseNum = Integer.parseInt(s);
            int current = baseNum;
            for(int i=0;i<nums.size();i++){
                if (s.contains(nums.get(i))){
                    nums.remove(i);
                    i--;
                }
            }          
            for(int k=0;k<=maxLoop;k++){
                
                if(nums.isEmpty())
                    break;
                current+=baseNum;
                for(int i=0;i<nums.size();i++){
                if (Integer.toString(current).contains(nums.get(i))){
                    nums.remove(i);
                    i--;
                }   
            }

            }       
            System.out.printf("Case #%d: ", n + 1,baseNum);
            System.out.println(nums.isEmpty()?current:"INSOMNIA");
        }
    }
    

    
}
