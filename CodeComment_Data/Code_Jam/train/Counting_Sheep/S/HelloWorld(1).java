package methodEmbedding.Counting_Sheep.S.LYD128;

import java.util.*;
import java.io.*;

public class HelloWorld{

     public static void main(String []args) throws IOException {
       
       FileReader fr = new FileReader("sample.txt");
       BufferedReader br = new BufferedReader(fr);
       String s;
       
       
       //Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       int T;
       if((s = br.readLine()) != null)
        T = Integer.parseInt(s);//c.nextInt();
        else
        {
            System.out.println("File has nothing to read.");
            return;
        }
       if(T < 1 || T > 100) {
           System.out.println("Improper number of test cases.");
           return;
       }int N;
       for(int k = 0;k < T;k++) {
           if((s = br.readLine()) != null)
        N = Integer.parseInt(s);
        else {
            System.out.println("File has nothing to read.");
            return;
        }
       //int N = sc.nextInt();
       if(N == 0) {
        System.out.println("Case #" + (k + 1) + ": INSOMNIA");
        continue;
       }
       BitSet obj = new BitSet(10);
       obj.set(0, 10);
       int i = 2;
       int temp = N;
       while(true) 
       {
           String num = String.valueOf(temp);
           for(int j = 0;j < num.length();j++) {
               obj.set(Character.digit(num.charAt(j), 10), false);
           }
           if((obj.toString()).compareTo("{}") == 0) {
               System.out.println("Case #" + (k + 1) + ": " + temp);
               break;
           }
           temp = N * i;
           i++;
       }
       
       }
       
     }
}
