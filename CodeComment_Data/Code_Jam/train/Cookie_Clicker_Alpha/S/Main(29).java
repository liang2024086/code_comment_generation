package methodEmbedding.Cookie_Clicker_Alpha.S.LYD651;


import org.omg.DynamicAny._DynFixedStub;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args) throws Exception{
       Scanner input=new Scanner(new File("a.in"));
     //   Scanner input =new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new File("a.out"));

        int n=Integer.parseInt(input.nextLine());
        for(int t=0;t<n;t++){
           // input.nextLine();
            double C=input.nextDouble();
            double F=input.nextDouble();
            double X=input.nextDouble();
            double f=2;
            double Seconds=0.0;
            double total=0;
            double first=X/f+Seconds;
            double again=C/f+(X/(f+F));
            while (first>again){
                Seconds+=C/f;
                f=f+F;
                first=again;
                again=C/f+(X/(f+F))+Seconds;
            }


                //System.out.printf("Case #%d: %.7f\n",t+1,first);
            writer.printf("Case #%d: %.7f\n",t+1,first);
              // System.out.println("Case #"+(t+1)+": "+ first);
         //   writer.println("Case #" + (t + 1) + ": " + answer);
        }



        writer.close();
        input.close();

    }

}
