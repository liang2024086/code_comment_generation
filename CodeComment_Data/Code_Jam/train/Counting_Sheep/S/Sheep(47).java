package methodEmbedding.Counting_Sheep.S.LYD151;


import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap;
/* Name of the class has to be "Main" only if the class is public. */
class Sheep
{

    public static HashMap<Integer, Boolean> hashmap = new HashMap(); 
    
    public static String number;
   public static  int lastNum;
     public static  int nextnum;   
  public static   int n;   
   
  
  
  //public static    int Cases =5;


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

		 Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int caseNum = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
   
for( int zaa=0; zaa<caseNum; zaa++){
  boolean firstFinished =false; //set bool
  n = in.nextInt();

   nextnum = n;
   for(int i =0; i<10; i++){
   
       hashmap.put(i, Boolean.FALSE);
       
   }//hashmap set
  
   
   for(int k = 0; k<=100; k++){ //from zero to 100 digets
       
     number =  String.valueOf(nextnum); 
        
     
        char[] nextnumChararay = number.toCharArray();
        
        for(int z = 0; z < nextnumChararay.length; z++){
            
            hashmap.replace(Integer.parseInt(""+ nextnumChararay[z]), Boolean.TRUE);
          
            int c =1;
       for(int ia =0; ia< 10; ia++){ //for  the 10 keys check if all true
           
           
           if(hashmap.get(ia)==true){
                      
                     c++;
           }//if
           
       }//for ia  10 check done
       
       if(c==11 && firstFinished==false){ //finished

                    //System.out.println("answer:"+ number);
                    lastNum = Integer.parseInt(number);
                   firstFinished =true;

					int casenum = zaa+1;                  
                   System.out.println("Case #"+ casenum+": "+ lastNum );

                }else if(c<10 && k ==100){
						int casenum = zaa+1;     
                    System.out.println("Case #"+ casenum+": INSOMNIA");
                    break;
                }
            
        
        }//for all parts of the character
        
   
   nextnum = n*(k+2); 
   
   }//for  k 
   
   
       }//for caseNum
   

}//main

	
}//class
