package methodEmbedding.Cookie_Clicker_Alpha.S.LYD995;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Second{
    public static void main(String[] args) throws IOException{
        BufferedReader s = new BufferedReader(new FileReader("sec.txt"));
		FileWriter ss = new FileWriter("secon.txt");
        int test = Integer.parseInt(s.readLine());
        for(int k=0;k<test;k++){
            double c,f,x;
            String[] str = s.readLine().split(" ");
            c = Double.parseDouble(str[0]); f = Double.parseDouble(str[1]);
            x = Double.parseDouble(str[2]);
            boolean i = true; double pro = 2; double sum=0; double cmp=0; double div=0;
             while(i){
                double divi = (c/pro)+(x/(pro+f));
                 div = x/pro;
       //         System.out.println(divi+" "+div);
                if(div < divi)
                    break;
                sum += c/pro;
                pro += f;
           //     System.out.println(sum);
            }
            DecimalFormat xx = new DecimalFormat("0.0000000");
            String ans = xx.format(sum+(x/pro));
        //    System.out.printf("%.7f",sum+(x/pro));
            ss.write("Case #"+(k+1)+": "+ans+"\n");
        }
        ss.flush();
    }
}
