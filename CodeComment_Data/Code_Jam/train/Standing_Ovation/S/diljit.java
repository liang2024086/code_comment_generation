package methodEmbedding.Standing_Ovation.S.LYD263;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author diljit
 */
public class codejam {
    
    public static void main(String args[])
    {
       int testcases,index=1;
       Scanner in = new Scanner(System.in);
       testcases = in.nextInt();
       
       while (index<=testcases)
       {
           int maximumShyness = in.nextInt();
           String shyLevel = in.nextLine().trim();
        
           int stoodUp=0;
           int friends=0;
           for(int i=0;i<shyLevel.length();i++)
           {
             int membersAtIndex=Character.getNumericValue(shyLevel.charAt(i));
               if (i<=stoodUp)
               {
                   
                   if (membersAtIndex > 0)
                   {
                    stoodUp = stoodUp+membersAtIndex;
                      
                   }
                }
               else
               {
                   if(membersAtIndex>0){
                       //System.out.println("StoodUp"+stoodUp+"friends"+friends);
                   friends=friends+(i-stoodUp);
                   stoodUp = stoodUp+friends+membersAtIndex;
                   
                   }
               }
               
               
           }
           System.out.println("Case #"+index+": "+friends);
           index +=1;
       }
    }
    
}
