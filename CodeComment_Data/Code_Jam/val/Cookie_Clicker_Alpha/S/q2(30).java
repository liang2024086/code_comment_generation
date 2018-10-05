package methodEmbedding.Cookie_Clicker_Alpha.S.LYD371;


import java.io.File;
import java.io.PrintWriter;


import java.util.Locale;
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        File file = new File("B-small-attempt0.in");
          File f2=new File("output.txt");
          PrintWriter out;
        Scanner scn;
      
        double cookieFarmCost;
        double extraCookie;
        double production;
        double reachPoint;
        double worst;
        double time = 0;
        String caseNumStr=null;
        String timeStr=null;
        int testCase;
        
       
        
        
        try {
                out = new PrintWriter(f2);
            scn = new Scanner(file);
            testCase = scn.nextInt();

            for (int z = 1; z < testCase+1; z++) {

                cookieFarmCost = Double.valueOf(scn.next());
                extraCookie = Double.valueOf(scn.next());
                reachPoint = Double.valueOf(scn.next());
                production = 2;
                time=0;
                while (true) {
                    worst = reachPoint / production;
                    if (worst > (cookieFarmCost / production) + (reachPoint / (production + extraCookie))) {
                        time += cookieFarmCost / production;
                   //      System.out.println(time);
                        production += extraCookie;
                 //       System.out.println(production);

                    } else {
                        time += worst;          
 //                       time =(double)Math.round(time * Math.pow(10,7)) / Math.pow(10,7);
                        break;
                    }
                }

 caseNumStr=String.valueOf(z);
 
 timeStr=String.valueOf(time);           
 String ysn=String.format(Locale.ENGLISH,"%.7f", time);
 System.out.println(ysn);
 
 out.println("Case #"+caseNumStr+": "+ ysn);

          
            }
            out.flush();
            out.close();
            scn.close();
            
        } catch (Exception e) {
            System.out.println("asd");

        }


    }
}
