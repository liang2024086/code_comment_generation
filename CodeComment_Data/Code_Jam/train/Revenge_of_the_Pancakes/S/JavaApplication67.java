package methodEmbedding.Revenge_of_the_Pancakes.S.LYD257;



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
         String s=br.readLine();
         int pos=0,neg=0,ans=0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='+')
                 pos++;
             else 
                 neg++;
         }
         if(pos==s.length())
             ans=0;
         else if(neg==s.length())
             ans=1;
         else{
             char[] arr=new char[500];
             int j=0;
             pos=0;neg=0;
             for(int i=0;i<s.length();i++){
                   if(s.charAt(i)=='+'){
                        pos++;
                        neg=0;
                   }
                   else {
                        neg++;
                        pos=0;
                   }
                   if(pos==1)
                       arr[j++]='+';
                   if(neg==1)
                       arr[j++]='-';
             }
             if(j%2==0&&arr[0]=='-')
                 ans=j-1;
             else if(j%2==0&&arr[0]=='+')
                 ans=j;
             else if(j%2==1&&arr[0]=='+')
                 ans=j-1;
             else if(j%2==1&&arr[0]=='-')
                 ans=j;
         }
         pw.println("Case #"+tg+": "+ans);
       }
       pw.flush();
       pw.close();
       br.close();
    }  
}

    
