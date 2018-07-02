package methodEmbedding.Counting_Sheep.S.LYD404;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaApplication67 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String input="/Users/ramkrishnakulkarni/gcodejam/input1.txt";
       String output="/Users/ramkrishnakulkarni/gcodejam/output1.txt";
       BufferedReader br=new BufferedReader(new FileReader(input));
       PrintWriter pw=new PrintWriter(output);
       int t=Integer.parseInt(br.readLine());
       for(int tg=1;tg<=t;tg++){
         long n=Long.parseLong(br.readLine());
           long temp,ans=0;
           boolean[] arr=new boolean[10];
           if(n==0)
               pw.println("Case #"+tg+": INSOMNIA");
           else{
               temp=n;
               int b,j=1,flg=0;
               while(flg==0){
                   temp=n*j;
               while(temp>0){
                   b=(int) (temp%10);
                   arr[b]=true;
                   temp/=10;
               }
               for(int i=0;i<10;i++){
                   if(!arr[i])
                       break;
                   if(i==9&&arr[i]){
                       flg=1;
                       ans=n*j;
                   }
                       }
               j++;
           }
               pw.println("Case #"+tg+": "+ans);
           }
       }
       pw.flush();
       pw.close();
       br.close();
    }  
}

    
