package methodEmbedding.Revenge_of_the_Pancakes.S.LYD614;

import java.util.Scanner;

/**
 * Created by kunals726 on 4/9/2016.
 */
public class pancakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String s=sc.next();
            int index=0,toadd=1,ans=0;
            int len=s.length();
            while(index<len){
                if(s.charAt(index)=='+'){
                    while(index<len&&s.charAt(index)=='+'){
                        ++index;
                    }
                }else{
                    ans+=toadd;

                    while(index<len&&s.charAt(index)=='-'){
                        ++index;
                    }
                }
                toadd=2;
            }
            System.out.println("Case #"+i+": "+ans);
        }
    }
}
