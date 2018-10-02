package methodEmbedding.Standing_Ovation.S.LYD1324;

import java.io.*;
import java.util.*;
public class ovation{
  
  public static void main(String args[])throws Exception{
    
//    Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(new File("A-small-attempt0.in"));
    
    int Tc = sc.nextInt();
    int add, sMax, sTot, tempAdd;
    int [] sAll;
    String dummy;
    
    for(int i = 0; i<Tc; i++){
      sMax = sc.nextInt();
      dummy = sc.next();
      add = 0;
      sAll = new int [sMax+1];
      for(int j = 0; j<sMax+1; j++){
        sAll[j] = Integer.parseInt(""+dummy.charAt(j));
      }
      sTot = sAll[0];
      for(int j = 1; j<sMax+1; j++){
        if(sAll[j]!=0){
          if(j>sTot){
            tempAdd = j-sTot;
            add = add + tempAdd;
            sTot = sTot + tempAdd + sAll[j];
          }else{
            sTot = sTot + sAll[j];
          }
        }
      }
      
      System.out.println("Case #"+(i+1)+": "+add);
      
    }
    
    
  }
  
}
