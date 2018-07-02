package methodEmbedding.Counting_Sheep.S.LYD1150;

import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


 class Test
{

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t= sc.nextInt();
        int c1=0;
        while(t-->0)
        {  c1++;
              int num = sc.nextInt();
              if(num==0){
                   System.out.println("Case #"+c1+": INSOMNIA");
                   continue;
              }
              int[] arr = {0,0,0,0,0,0,0,0,0,0};
              int x=0,temp1;
              boolean flag=false;
              
              while(true)
              {
                  int temp=num*(++x);
                  temp1=temp;
                while(temp>0){
                    int d=temp%10;
                    temp/=10;
                    arr[d]++;
                }
            
                for(int c=0;c<10;c++)
              {
                  if(arr[c]<=0)
                  flag = true;
              }
                
                if(!flag)break;
                flag=false;
              }
              System.out.println("Case #"+c1+": "+temp1);
}
              }
}
