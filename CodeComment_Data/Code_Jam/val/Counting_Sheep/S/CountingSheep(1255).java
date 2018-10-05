package methodEmbedding.Counting_Sheep.S.LYD1261;

import java.util.*;
import java.io.*;

public class CountingSheep {
    public static void main(String[] args)throws IOException{
      try(PrintWriter pw = new PrintWriter("CountingSheepOutput.txt")){
        Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        int T = sc.nextInt();
        int out[] = new int[T];
        
        for(int j = 0;j<T;j++){
            
            int n = sc.nextInt();
            if(n==0)
                out[j] = 0;
            else{
                HashSet<Character> num = new HashSet<Character>();
                int i = 1,curN = 1;
                
                while(num.size()<10){
                    curN = n*i;
                    char str[] = (""+curN).toCharArray();
                    
                    for(char c:str)
                        num.add(c);
                    
                    i++;
                }
                
                out[j] = curN;
            }   
        }
        
        for(int j=0;j<T;j++){
            if(out[j] == 0)
                pw.print("Case #"+(j+1)+": INSOMNIA");
            else
                pw.print("Case #"+(j+1)+": "+out[j]);
            
            if(j<T-1)
                pw.println();
        }
      }catch(Exception e){
            System.out.println(e);
      } 
      
    }   
}
