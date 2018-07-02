package methodEmbedding.Counting_Sheep.S.LYD473;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Learn1{
       
    public static void main(String[] args){
        int raja; int baja;
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            HashSet<Integer> set = new HashSet<Integer>(); 
            int m = in.nextInt();
            if(m==0){
                System.out.println("Case #"+i+": "+"INSOMNIA");
            }else{
                int j=1;
                do{
                baja=j*m;
                j++;
                raja = baja;
                while(raja!=0){
                    int r = raja%10;
                    set.add(r);
                    raja = raja/10;
                }
                }
                while(set.size()<10);
                
                System.out.println("Case #"+i+": "+baja);
            }
        }
    }
}
   
