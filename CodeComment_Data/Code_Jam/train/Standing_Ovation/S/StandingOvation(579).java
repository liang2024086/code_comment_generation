package methodEmbedding.Standing_Ovation.S.LYD820;

import java.io.*;
import java.util.*;

public class StandingOvation
{
 public static void main (String [] args) throws IOException
 {
   BufferedReader in = new BufferedReader (new FileReader ("A-small-attempt1.in"));
   PrintWriter out = new PrintWriter (new FileWriter ("StandingOvationout.txt"));
   //BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
   int cases = Integer.parseInt (in.readLine());
   for (int z = 0;z < cases;z++)
   {
     String [] list = in.readLine().split(" ");
     int maxShyness = Integer.parseInt (list[0]);
     int totalPeople = 0;
     int friends = 0;
     String audience = list[1];
     for (int x = 0;x <= maxShyness;x++){
       int friendsAdded = 0;
       int numPeople =  (int)(audience.charAt (x)) - 48;
       if (totalPeople < x){
         friendsAdded += (x - totalPeople);
         friends += (x - totalPeople);
       }
       totalPeople += friendsAdded + numPeople;
     }
     //System.out.println ("Case #" + (z + 1) + ": " + friends);
     out.println ("Case #" + (z + 1) + ": " + friends);
   }
   in.close();
   out.close();
 }
}
