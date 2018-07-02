package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1073;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author A.H.F RIYAFA
 */
public class CookieClickerAlpha {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new BufferedReader(new FileReader("Test1.in")));
                PrintWriter wr=new PrintWriter(new BufferedWriter(new FileWriter("Test1.out")),true)) {
            
            int N=sc.nextInt();            
            
            for(int i=1;i<=N;++i){
                double n=2,t=0,c,f,x;
                c=sc.nextDouble();
                f=sc.nextDouble();
                x=sc.nextDouble();
                
                while(true){
                    if((x/n)<(c/n+x/(n+f))){
                        t+=x/n;
                        
                        break;
                    }else{
                        t+=c/n;
                        n+=f;
                    }
                }
                wr.printf("Case #"+i+": %.7f%n",t);
            }
                
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
