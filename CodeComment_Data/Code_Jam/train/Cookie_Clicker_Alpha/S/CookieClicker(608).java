package methodEmbedding.Cookie_Clicker_Alpha.S.LYD885;

//Google code jam
import java.util.*;
import java.io.*;
import java.text.*;
import java.lang.*;


public class CookieClicker
{

   public static void main(String[] args) throws IOException
   {
      String input = "B-small-attempt0.in";
      String output = "output.txt";
      File inputFile = new File(input);
      File outputFile = new File(output);
      Scanner read = new Scanner(inputFile);
      PrintWriter print = new PrintWriter(outputFile);
      int numCases = read.nextInt();
      read.nextLine();
      
      
      Double c,f,x;
      Double timeTilFarm;
      Double finishNext;
      Double finishNow;
      Double rate;
      Double addTime;
      int count;
      Stack<Double> totalTime;
      
      
      
      
      for(int i=1; i <= numCases; i++)
      {
         count = 0;
         totalTime = new Stack<Double>();  
         rate = new Double(2.0);
         c = read.nextDouble();
         f = read.nextDouble();
         x = read.nextDouble();
         read.nextLine();
         
      while(count == 0)
      {
         
         timeTilFarm = new Double((c/rate));
         finishNext = new Double((x/(rate+f))) ;
         finishNow = new Double((x/rate));
            
         if (timeTilFarm + finishNext < finishNow)
            {
               totalTime.push(timeTilFarm);
               rate += f;
             }
         else{
           totalTime.push(finishNow);
           count++;
           }
        }
      
        
         Double counter = new Double(0.0);
         while (!totalTime.empty())
         {
            addTime = new Double(totalTime.pop());
            counter += addTime;
          }     
       print.println("Case #" + i + ": " + counter);
      }
     print.close();
   
   }  
  } 
