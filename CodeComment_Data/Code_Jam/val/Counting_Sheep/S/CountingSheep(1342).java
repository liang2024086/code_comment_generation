package methodEmbedding.Counting_Sheep.S.LYD227;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSheep {
    public static void main(String[] args) throws IOException {
        int t,i,index,f,count=0,case1=1,iteration;
        
       
        long n,number,rem;
        long a[] =new long[10];
         
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(input.readLine());
         long  last;
        while(t-->0){
            f=0;
          
          n = Integer.parseInt(input.readLine()); 
          iteration=1;
          int j=1;
          for(i=0;i<10;i++){
            a[i]=-1;
        }
          while(true){
           
          number=n*j;
              //System.out.println(count);
        last=number;
        
          while(number!=0){
              rem = number%10;
              //System.out.println(rem);
              number = number/10;
              index=(int)rem;
              if(a[index]!=rem){
                  a[index]=rem;
                  count++;
              }
          }
          
          if(count==10||iteration==10000000){
              f=1;
          
              break;
          }
          j++;
          iteration++;
        }
          count=0;
          if(f==1&&iteration<10000000){
          System.out.println("Case #" + (case1++) + ": " + last);
          //System.out.println(iteration);
          }
          else
              System.out.println("Case #" + (case1++) + ": " + "INSOMNIA");
        

        }
        
    }
    
}
