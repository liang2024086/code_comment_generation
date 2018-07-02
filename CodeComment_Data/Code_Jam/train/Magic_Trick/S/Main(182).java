package methodEmbedding.Magic_Trick.S.LYD371;

import java.util.*;
import java.io.*;

/**
 *
 * @author hynek
 */
public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader("A.in"));
        PrintWriter out = new PrintWriter(new File("A.out"));
        
        int t = Integer.parseInt(rd.readLine());
        for(int x = 1; x <= t; x++){
            int n = Integer.parseInt(rd.readLine());
            Set<String> fRow = new HashSet<String>();
            
            for(int i = 0; i < 4; i++){
                String[] s = rd.readLine().split(" ");
                if(i == n - 1)
                    fRow.addAll(Arrays.asList(s));
            }
            
            int m = Integer.parseInt(rd.readLine());
            Set<String> sRow = new HashSet<String>();
            
            for(int i = 0; i < 4; i++){
                String[] s = rd.readLine().split(" ");
                if(i == m - 1)
                    sRow.addAll(Arrays.asList(s));
            }
            
            fRow.retainAll(sRow);
            
            out.printf("Case #%d: ", x);
            if(fRow.size() == 1){
                out.println(fRow.iterator().next());
            }
            else if(fRow.size() > 1){
                out.println("Bad magician!");
            }
            else{
                out.println("Volunteer cheated!");
            }
        }
        out.flush();
    }
    
}
