package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1082;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Pb2{

     public static void main(String []args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(new File("in.txt"));
        
        int n = scan.nextInt();
        scan.nextLine();
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out.txt")));
        
        for(int j = 0; j < n; j++) {
            String s = scan.nextLine();
            
            LinkedList<Boolean> res = new LinkedList<Boolean>();
            
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '-')
                    res.add(false);
                else res.add(true);
            }
            
            while(res. size() > 0 && res.getLast())
                res.removeLast();
            
            int counter = 0;
            while(res.size() > 0) {
                for(int i = 0; i < res.size(); i++){
                    res.set(i, !res.get(i));
                }
                
                while(res.size() > 0 && res.getLast())
                    res.removeLast();
                    
                counter++;
            }
            
            writer.write("Case #" + (j + 1) + ": " + counter + "\n");
        }
        writer.close();
     }
}
