package methodEmbedding.Standing_Ovation.S.LYD782;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class Flowers {
    public static void main(String[] args) throws Exception {
        String input="/Users/ramkrishnakulkarni/gcodejam/input.txt";
        String output="/Users/ramkrishnakulkarni/gcodejam/output.txt";
         Scanner sc=new Scanner(new FileReader(input));
         PrintWriter pw = new PrintWriter(output);
        int t=sc.nextInt();
        for(int q=1;q<=t;q++){
            int sm=sc.nextInt();
            String str=sc.next();
            long count=0,ans=0;
            for(int i=0;i<str.length();i++){
               if(count<i){
                    ans+=(i-count);
                     count+=ans;
                }
                count+=(str.charAt(i)-'0');
            }
             pw.println("Case #"+q+": "+ans);
             System.out.println("Case #"+q+": "+ans);
        }             
        pw.flush();
        pw.close();
        sc.close();   
}
}
 //  pw.print("Case #"+q+": "+a[0]+" "+a[0]);        
// System.out.print("Case #"+q+": ");
            
