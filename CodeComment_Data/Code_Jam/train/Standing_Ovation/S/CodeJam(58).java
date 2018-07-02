package methodEmbedding.Standing_Ovation.S.LYD1110;




import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeJam {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);        
        int N,n;        
        N=scan.nextInt();
        
        
          File file = new File("out.txt");
        
      FileWriter writer = new FileWriter(file); 
      
      
        
        for (int i = 0; i < N; i++) {
            
           //Test case   
            // System.out.println();
            int totnoPpl=0;
            
            //reading the max lines
            n=scan.nextInt();
            
         //  System.out.print("n:"+n+" ");
            
            String x= scan.next();
           // System.out.print("x:"+x+" ");
            char[] charArray = x.toCharArray();
            
            int sum=0;
            
            
            
            for (int j = 0; j <= n;j++) {
                
               int noPpl=0;
               // System.out.println("j:"+j+"sum:"+sum);
              
               
                 if(sum<j){
                noPpl= j-sum;
                sum=sum+noPpl;
                     
                     
                
                
                }
                 totnoPpl=totnoPpl+noPpl;
          //      System.out.println(totnoPpl+"**");
               
                 sum = sum + Character.getNumericValue(charArray[j]);
                
            }
           writer.write("Case #"+(i+1)+": "+totnoPpl+"\n");
        }
        
        writer.flush();
      writer.close();
    }
}
