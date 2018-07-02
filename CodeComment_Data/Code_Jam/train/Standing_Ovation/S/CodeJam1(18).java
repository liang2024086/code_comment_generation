package methodEmbedding.Standing_Ovation.S.LYD2041;





import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CodeJam1 {

    public static void main(String[] args) throws Exception {
       
         BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
         int test=Integer.parseInt(reader.readLine()),k=1;
         while(k<=test){
             String str[]=reader.readLine().split(" ");
             int totalChar=Integer.parseInt(str[0]);
             int[] cumulativeSum=new int[totalChar+1];
             int friends=0;
             for(int i=0;i<=totalChar;++i){
                 
             int ithShy=str[1].charAt(i)-48;
             cumulativeSum[i]=ithShy;
             if(i>0){
                 cumulativeSum[i]+=cumulativeSum[i-1];
             if(cumulativeSum[i-1]<i){
                 friends+=i-cumulativeSum[i-1];
             cumulativeSum[i]+=i-cumulativeSum[i-1];
             }}
                 
                // System.out.println(i+"\t"+cumulativeSum[i]+","+friends);
             
             }
             System.out.println("Case #"+k+": "+friends);
         k++;
         }
    }
    
}
