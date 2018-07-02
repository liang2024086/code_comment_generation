package methodEmbedding.Counting_Sheep.S.LYD1167;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Pb1{

     public static void main(String []args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(new File("in.txt"));
        
        int t = scan.nextInt();
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out.txt")));
        
        for(int j = 0; j < t; j++) {
            int copy, n = scan.nextInt();
            
            if(n == 0) {
            	writer.write("Case #" + (j + 1) + ": INSOMNIA\n");
            	continue;
            }
            
            HashSet<Integer> digits = new HashSet<Integer>();

            int counter = 0;
            int aux = n;
            
            while(counter < 10) {
            	copy = aux;
            	
            	while(copy != 0) {
            		if(!digits.contains(copy % 10)){
            			counter ++;
            			digits.add(copy % 10);
            		}
            		copy /= 10;
            	}
            	
            	if(counter < 10)
            		aux += n;
            }
            
            
            writer.write("Case #" + (j + 1) + ": " + aux + "\n");
        }
        writer.close();
     }
}
