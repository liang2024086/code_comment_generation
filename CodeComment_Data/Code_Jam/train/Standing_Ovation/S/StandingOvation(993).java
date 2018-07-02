package methodEmbedding.Standing_Ovation.S.LYD671;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author A.H.F. Riyafa
 */
public class StandingOvation {

    
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new BufferedReader(new FileReader("in8.in")))){
            int n=sc.nextInt();
            System.out.println(n);
        try(PrintWriter p=new PrintWriter(new BufferedWriter(new FileWriter(
            "out8.out")))){
                    
                
            for(int i=1;i<=n;++i){
                //max shyness
                int s=sc.nextInt();
                System.out.print(s);
                //the k digit
                String l=sc.next();
                System.out.println(" "+l);
                char[] chars=l.toCharArray();
                int[] items=new int[s+1];
                int j;
                
                for(j=0;j<=s;++j){
                    items[j]=Integer.parseInt(chars[j]+"");
                    
                }
                      int sum=0,num=0;        
                  for(int k=0;k<s;++k){
                      sum+=items[k];
                      if (sum<k+1&&items[k+1]!=0) {
                          num+=k+1-sum;
                          sum+=num;
                      }
                  }
               
                p.println("Case #"+i+":"+" "+num);
                    System.out.println("Case #"+i+":"+" "+num);
                
            }
        } catch (IOException ex) {
                    ex.printStackTrace(System.out);
        }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
