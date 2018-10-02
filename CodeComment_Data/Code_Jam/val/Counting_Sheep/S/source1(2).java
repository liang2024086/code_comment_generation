package methodEmbedding.Counting_Sheep.S.LYD1377;

import java.util.*;
public class Solution {
   
   public static void main(String []argv)
   {
      //Write your solution here.
       Scanner sc = new Scanner(System.in);
       int testCases =  sc.nextInt();
       sc.nextLine();
       
       for(int i=0;i<testCases;i++){
           //testcase
           int str = sc.nextInt();
           
           // Initialize
           int out =0;
           HashSet h = new HashSet();
           boolean status = true;
           
           // Zero condition. Will never finish 
           if(str == 0){
               status=true;
           }else{
               // Convert to String Array based on each character
               int count = 1; // To loop 
               while(h.size() <=10){
                   int val = str * count;
                   char[] arr = String.valueOf(val).toCharArray();
                   for(int j=0;j<arr.length;j++){
                       h.add(arr[j]);
                       if(h.size()<10){
                           continue;
                       }
                       else if(h.size() == 10){
                           out = val;
                           status = false;
                           break;
                       }
                   }
                   if(!status && h.size() ==10){
                       break;
                   }
                   count = count + 1;
               } 
           }
           
           if(status){
               int y = i+1;
               System.out.println("Case #"+y+": INSOMNIA");
           }else{
               int y = i+1;
               System.out.println("Case #" +y+": " +  out);
           }
       }
        
      
   }

}

