package methodEmbedding.Cookie_Clicker_Alpha.S.LYD943;

import java.io.*;
//import java.util.*;


public class Main{
  
  
  public static void main(String[] args)
  {
    
    try
    {
      String strNum = new String();
      int num;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      strNum = (br.readLine());
      num = Integer.parseInt(strNum);
      String input = new String();
      CookieClick a = new CookieClick();
      
      for(int x = 0; x<num; x++){
        input = br.readLine();
        System.out.print("Case #"+(x+1)+": ");
        a.solve(input+" ");
      }
      
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    
  }
}
