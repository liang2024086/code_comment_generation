package methodEmbedding.Counting_Sheep.S.LYD831;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;

public class JavaApplication27 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File fi = new File("C:\\Users\\mm\\Desktop\\Misc\\in.in");
        File fo = new File("C:\\Users\\mm\\Desktop\\Misc\\out.out");
        System.setOut(new PrintStream(fo));
        
        Scanner sc = new Scanner(fi);
        int ncases= sc.nextInt();
        for (int i = 0; i < ncases; i++) {
            int k = sc.nextInt();
            int f=k;
            int j=2;
            Set<Integer> set = new HashSet<>();
            while(set.size()<10 && j<=11111){
                int c=f;
                while(c!=0){
                    set.add(c%10);
                    c/=10;
                }
                f=j*k;
                j++;
            }
            if(set.size()==10){
                System.out.println("Case #"+(i+1)+": "+((j-2)*k));
                
            } else 
                System.out.println("Case #"+(i+1)+": INSOMNIA");
        }
    }
    
}
