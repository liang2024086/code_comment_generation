package methodEmbedding.Counting_Sheep.S.LYD671;

import java.util.*;
import java.math.*;
public class counting_sheep{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            HashSet<Integer> hs = new HashSet<Integer>();
            int count = 0;
            System.out.print("Case #"+i+": ");

            int n = sc.nextInt();
            BigInteger t = BigInteger.valueOf(n);

            if(n==0){
                System.out.println("INSOMNIA");
            }
            else{
                int times = 1;
                while(count!=10){
                    //System.out.println("hhe " + t);
                    String temp = t.toString();
                    // System.out.println("hhehhh " + temp);

                    for(int j=0;j<temp.length();j++){
                        int temp_char = temp.charAt(j)-'0';
                        if(hs.add(temp_char)){
                            count++;
                        }
                    }
                    if(count==10)break;
                    t = BigInteger.valueOf((times+1)*n);
                    times++;
                }
            
                System.out.println(t);

            }

                    
        }
    
    
    }

}
