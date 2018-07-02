package methodEmbedding.Standing_Ovation.S.LYD665;

import java.util.*;
import java.io.*;

public class Store{
  public static void main(String [] args){
    
    try{
      File file = new File("C:/Users/User/Desktop/codejam/input.txt");
      Scanner sc = new Scanner(file);
      int cases = sc.nextInt();
      sc.nextLine();
      int stood = 0;
      int friends = 0,max = 0;
      int current = 0;
      for(int i = 0; i < cases; i++){
        friends = 0;
        stood = 0;
        current = 0;
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        max = Integer.parseInt(st.nextToken());
        String check = st.nextToken();
        int tmp = Integer.parseInt(check.substring(0,1));
        if(tmp == 0){
          friends++;
          stood=stood+friends;
        }
        else{
          stood=stood+tmp;
        }
        for(int j = 1; j < check.length(); j++){
          current = Integer.parseInt(check.substring(j,j+1));
          if(stood < j){
            friends = friends+(j-stood);
            stood=j+current;
          }
          else{
            stood = stood+current;
          }
        }
              System.out.println("Case #"+(i+1)+": "+friends);
      }
    }
    catch(Exception ae){
      System.out.println(ae);
    }
  }
}
