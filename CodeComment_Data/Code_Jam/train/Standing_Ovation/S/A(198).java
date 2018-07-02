package methodEmbedding.Standing_Ovation.S.LYD536;

import java.util.*;

public class A {

  Scanner in;

  public A(){
    in = new Scanner(System.in);
    // do shit here
    int T = in.nextInt();
    for(int t = 0; t < T; t++){
      //for test cases
      int maxS = in.nextInt();
      ArrayList<Integer> ppl = new ArrayList<Integer>(maxS+1);
      //get shyness
      String line = in.next();
      for(int s = 0; s <= maxS; s++){
        ppl.add(Character.getNumericValue(line.charAt(s)));
      }    
      //find out how many ppl to add
      int total = 0;
      int added = 0;
      for(int i = 0; i <= maxS; i++){
        int noPpl = ppl.get(i);
        if (noPpl == 0) 
          continue;

        if(i > total){
          int diff = i - total;

          added += diff;
          total += diff;
        }
        total += noPpl;
      }
      System.out.println("Case #"+(t+1)+": "+added);
    }
  }

  public static void main(String[] args){
    new A();
  }

}
