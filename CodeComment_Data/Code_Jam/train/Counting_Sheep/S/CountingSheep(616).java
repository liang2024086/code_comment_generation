package methodEmbedding.Counting_Sheep.S.LYD1597;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class CountingSheep{
    public static void main(String[] args){
        long n,t;
        long temp;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        List<Long> counter;
        long res;
        long c=1;
        Long[] intList = new Long[10];
        for(int i=0;i<10;i++){
            intList[i] = Long.valueOf(i);
        }
        while(c<=t){
            n = sc.nextInt();
            if(n==0){
                System.out.println("Case #"+c+": INSOMNIA");
            }else{
                counter = new LinkedList<Long>();
                for(int i=0;i<10;i++){
                    counter.add(intList[i]);
                }
                res = 0;
                while(counter.size()!=0){
                    res += n;
                    temp = res;
                    while(temp>0){
                        counter.remove(intList[(int)(temp%10)]);
                        temp/=10;
                    }
                    
                }
                System.out.println("Case #"+c+": "+(res));
            }
            c++;
        }
    }
}
