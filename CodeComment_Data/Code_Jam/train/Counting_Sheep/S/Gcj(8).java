package methodEmbedding.Counting_Sheep.S.LYD126;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author zhezhao
 */
public class Gcj {

    public static void main(String[] args) throws FileNotFoundException{
        
        FileInputStream fis = new FileInputStream("A-small-attempt1.in.txt");
        PrintStream out = new PrintStream(new FileOutputStream("A-large.out.txt"));
        System.setIn(fis);
        System.setOut(out);
        
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int times = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= times; ++i) {
            int T = in.nextInt();            
            if(T==0) {
                System.out.println("Case #" + i + ": "+"INSOMNIA");
            }
            else{
                int k=1;
                HashSet<Integer> hs = new HashSet<Integer>();
                while(hs.size()!=10){
                    int tmp = T*k;                    
                    while(tmp!=0){
                        hs.add(tmp%10);
                        tmp/=10;
                    }                                        
                    k++;
                }
                System.out.println("Case #" + i + ": "+ (k-1)*T);
            }                        
        }
    }        
}
