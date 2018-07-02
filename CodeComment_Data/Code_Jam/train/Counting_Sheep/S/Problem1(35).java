package methodEmbedding.Counting_Sheep.S.LYD962;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by pritamroy on 4/8/16.
 */
public class Problem1 {
    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine().trim();
        int numOfTestCases=Integer.parseInt(n);

        PrintWriter writer = new PrintWriter("answer.txt", "UTF-8");



        for(int testCaseCounter=0;testCaseCounter<numOfTestCases;testCaseCounter++){

            String input=sc.nextLine().trim();
            int stat=Integer.parseInt(input);

            HashMap<Character,Integer> map=new HashMap<>();

            HashMap<String,Integer> seenItems=new HashMap<>();



            String curr=""+stat;

            String original=curr;
            int sleep_timer=2;
           while(true){



               for(int j=0;j<curr.length();j++){
                   map.put(curr.charAt(j),1);
               }

               if(seenItems.containsKey(curr)){
                   writer.println("Case #"+(testCaseCounter+1)+": INSOMNIA");
                   break;
               }
//
//               for (Character k : map.keySet()) {
//                   System.out.print(k+" ");
//               }
//               System.out.println(" ");

               if(map.size()==10){
                   writer.println("Case #"+(testCaseCounter+1)+": "+curr);
                   break;
               }
               seenItems.put(curr,1);
               curr=""+(Integer.parseInt(original)*(sleep_timer++));

           }
        }

        writer.close();
    }
}
