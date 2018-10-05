package methodEmbedding.Counting_Sheep.S.LYD1542;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSheep {
    public static void main(String[] args) throws IOException {
        int t,i,index,flag,count=0,case1=1,iteration;
        
       
        long n,num,remainder;
        long arr[] =new long[10];
         
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(input.readLine());
         long  last;
        while(t-->0){
            flag=0;
          
          n = Integer.parseInt(input.readLine()); 
          iteration=1;
          int j=1;
          for(i=0;i<10;i++){
            arr[i]=-1;
        }
          while(true){
           
          num=n*j;
              //System.out.println(count);
        last=num;
        
          while(num!=0){
              remainder = num%10;
              //System.out.println(remainder);
              num = num/10;
              index=(int)remainder;
              if(arr[index]!=remainder){
                  arr[index]=remainder;
                  count++;
              }
          }
          
          if(count==10||iteration==10000000){
              flag=1;
          
              break;
          }
          j++;
          iteration++;
        }
          count=0;
          if(flag==1&&iteration<10000000){
          System.out.println("Case #" + (case1++) + ": " + last);
          //System.out.println(iteration);
          }
          else
              System.out.println("Case #" + (case1++) + ": " + "INSOMNIA");
        

        }
        
    }
    
}
