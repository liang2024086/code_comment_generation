package methodEmbedding.Revenge_of_the_Pancakes.S.LYD383;

import java.io.*;
import java.util.*;
import java.lang.*;

public class B_prob{
    public static void main(String[] args) throws IOException, Exception {
        Scanner sc = new Scanner(new FileInputStream(args[0]));
        PrintWriter pw= new PrintWriter(new File("B_output.txt"));

        int test = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < test ; t++ ) {
          char[] user = sc.nextLine().toCharArray();
          int flip = 0;
          if(user[user.length - 1] == '-') flip = 1;
          char temp = user[0];
          for ( char c : user) {
            if(temp != c){
              ++flip;
              temp = c;
            }
          }
          pw.println("Case #" + (t+1) + ": "+ flip);
        }
        pw.close();
      }
    }
