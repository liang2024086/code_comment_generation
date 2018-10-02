package methodEmbedding.Counting_Sheep.S.LYD1029;

import java.util.*;
import java.io.*;

public class smallInput {
 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
  
  Scanner in = new Scanner(new File("A-small-attempt1.in"));
  PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
  
  
  int t = Integer.parseInt(in.nextLine());
  //System.out.println("T " + t );
  while(in.hasNextLine()){
   
   
  int c = 0;
  
  for (int i = 1; i <= t; ++i) {
   boolean stop = false;
   int[] count = new int[10];
   //System.out.println("Enter the value of N: ");
   int n = Integer.parseInt(in.nextLine());
   //System.out.println("N " + n );
   int j = 1;
   while (!stop) {
    
    c = j*n;
    
    if (c==0){
     writer.println("Case  #" + i + ": " + "INSOMNIA");
     break;
    }
    else{
    
    //System.out.println("C: " + c);
    String a = Integer.toString(c);
    for (int k = 0; k < a.length(); k++) {
     char b = a.charAt(k);
     int digit = Character.getNumericValue(b);
     count[digit]++;
    }
    
    
    boolean allCheck [] = new boolean [10];
    for (int m =0; m<allCheck.length; m++){
     allCheck[m]=false;
    }
    
    for (int l = 0; l < count.length; l++) {
     if (count[l]>=1){
      allCheck[l]=true;
     }
    }
    
    for (int l = 0; l < count.length; l++) {
     if ((allCheck[l]==true && allCheck[l]==true)){
      stop=true;
     }
     else{
      stop=false;
      break;
      
     }
     
    }
    
    if (stop){
     writer.println("Case  #" + i + ": " + c);
    }
   }
    
    j++;
   }
   
   

  }
  writer.close();
  }
 }
}
