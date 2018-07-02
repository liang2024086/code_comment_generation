package methodEmbedding.Counting_Sheep.S.LYD1102;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int times=scn.nextInt();
        boolean flag[]=new boolean[10];int size=0; int point=0;int value=0; int keyvalue=0; int length=0;
        for(int time=1;time<=times;time++){
            int num=scn.nextInt();
            if(num==0){System.out.printf("Case #%d: INSOMNIA\r\n",time);continue;}
            Arrays.fill(flag,false);
            size=0;
            point =0;
            while(true){
            if(size==10)break;
            value=num*(++point);
            length=String.valueOf(value).length();
            for(int i=0;i<length;i++){
              keyvalue=value%10;
              value=value/10;
              if(flag[keyvalue]==false){size++;flag[keyvalue]=true;}
            }
            }
           System.out.printf("Case #%d: %d\r\n",time,num*point);
          
        }
    }
    
}
