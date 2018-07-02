package methodEmbedding.Magic_Trick.S.LYD1163;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Scanner in = new Scanner(new File("A-small.in"));
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        FileWriter out = new FileWriter(new File("A-small.out"));
        
        int T = in.nextInt();
        
        for (int t = 1; t <= T; t++) {
            
            int row = in.nextInt() - 1;
            int A = 0;
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int n = in.nextInt();
                    if (i == row) {
                        A |= (1 << n);
                    }
                }
            }
            
            row = in.nextInt() - 1;
            int B = 0;
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int n = in.nextInt();
                    if (i == row) {
                        B |= (1 << n);
                    }
                }
            }
            
            int intersection = A & B;
            
            out.write("Case #" + t + ": ");
            
            if (intersection == 0) {
                out.write("Volunteer cheated!");
            }
            else if (((intersection - 1) & intersection) == 0) {
                int bit = 0;
                
                while ((intersection & 1) == 0) {
                    intersection >>= 1;
                    bit++;
                }
                
                out.write(String.valueOf(bit));
            }
            else {
                out.write("Bad magician!");
            }
            
            out.write("\n");
        }
        
        out.close();
    }
    
}
