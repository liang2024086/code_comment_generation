package methodEmbedding.Counting_Sheep.S.LYD1075;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Sheep
{
  public static void main (String[]args)
  {
    try
    {
      BufferedReader in= new BufferedReader(new FileReader("A-small-attempt1.in"));
      PrintWriter out=new PrintWriter(new FileWriter("output.txt"));
      int testCases=Integer.parseInt(in.readLine());
      for (int z=1;z<=testCases;z++){
        HashSet list=new HashSet();
        boolean done=false;
        int num=Integer.parseInt(in.readLine());
        String newNum="";
        if (num!=0){
          int i=1;
          while (true){
            newNum=num*i+"";
            for (int x=0;x<newNum.length();x++){
              list.add(newNum.charAt(x)+"");
            }
            for (int j=0;j<10;j++){
              if (!list.contains(j+"")){
                done=false;
                break;
              }
              else
                done=true;
            }
            if (done)
              break;
            i++;
          }
          out.println("Case #"+z+": "+newNum);
        }
        else 
          out.println("Case #"+z+": INSOMNIA");
      }
      out.close();
    }
    catch (IOException e){}
  }
}
