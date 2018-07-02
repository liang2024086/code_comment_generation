package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1203;

import java.util.*;
import java.io.*;
public class CookieClicker
{
    public static void main (String[] args) throws FileNotFoundException, IOException
    {
        Scanner sc = new Scanner(new File("inputs.txt"));
        ArrayList<Double> a = new ArrayList<Double>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            while(scanner.hasNextDouble()){
                a.add(scanner.nextDouble());
            }
            scanner.close();
        }
        sc.close();
        //System.out.println(a);
        double aPrime [] = new double[a.size()];
        for (int i = 0; i < aPrime.length; i++)
        {
            aPrime[i] = a.get(i).doubleValue();
        }
        /*for (int j = 0; j < aPrime.length; j++)
        {
            System.out.print(aPrime[j] + " ");
        }
        */
       double endArray[][] = new double[(int)aPrime[0]][3];
       for (int r = 0; r < endArray.length; r++)
       {
           for (int c = 0; c < endArray[r].length; c++)
           {
               endArray[r][c] = aPrime[(3*r) + c + 1];
           }
       }
       /*for (int x = 0; x<endArray.length; x++)
       {
           for (int y = 0; y<endArray[y].length; y++)
           {
               System.out.print(endArray[x][y] + " ");
            }
            System.out.println();
       }*/
       // ABOVE IS CONVERTING THE INPUT INTO A USEABLE FORM -----------------------------
       // BELOW IS THE ACTUAL CODING PART------------------------------------------------
       double[] out = new double[(int)aPrime[0]];
       int counter = 0;
       for (int i = 0; i<endArray.length; i++)
       {
                  double farmCost = 0;
                  double farmCost2 = 0;
                  double farmBonus = 0;
                  double farmBonus2 = 0;
                  double timer = 0;
                  double rate = 2;
                  double endValue = 0;
                  double endTime = 0;
                  double farmTime = 0;
                  double timeTemp = 0;
                  double finalTime = 0;
                  boolean check = true;
           farmCost = endArray[i][0];
           farmBonus = endArray[i][1];
           endValue = endArray[i][2];
           while (check == true)
           {
               endTime = endValue/rate;
               farmTime = farmCost/rate;
               rate = rate + farmBonus;
               timeTemp = endValue/rate;
               if (endTime < (farmTime + timeTemp))
               {
                   check = false;
                   finalTime = endTime + timer;
                   System.out.println(finalTime);
                   out[counter] = finalTime;
                   counter++;
               }
               else
               {
                   timer = timer + farmTime;
               }
           }
       }
       int counter2 = 1;
       ArrayList<String> endList = new ArrayList<String>();
       for(int i = 0; i<(int)aPrime[0]; i++)
       {
           String x = ("Case #" + counter2 + ": " + out[i]);
           System.out.println(x);
           endList.add(x);
           counter2++;
       }
       FileWriter writer = new FileWriter("outputs.txt");
       for (String str: endList)
       {
           writer.write(str + "\r\n");
       }
       writer.close();
    }
}
