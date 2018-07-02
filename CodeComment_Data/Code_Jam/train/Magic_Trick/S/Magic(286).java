package methodEmbedding.Magic_Trick.S.LYD1497;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class Magic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] square = new boolean[16];
        int testCases = sc.nextInt();
        int first = 0;
        
        for(int i=0; i<testCases; i++) {
            
            first = sc.nextInt();
            
            for(int j=0; j<4; j++) {
                for(int k=0; k<4; k++) {
                    if(j==(first-1)) {
                        int n = sc.nextInt();
                        square[n-1] = true;
                    } else {
                        sc.nextInt();
                    }
                }
            }
            
            int second = sc.nextInt();
            int count = 0;
            int store = 0;
            
            for(int j=0; j<4; j++) {
                for(int k=0; k<4; k++) {
                    if(j==(second-1)) {
                        int n = sc.nextInt();
                        if (square[n-1]) {
                            count++;
                            store = n;
                        }
                    } else {
                        sc.nextInt();
                    }
                }
            }
            
            if(count == 0) {
                sb.append("Case #" + (i+1) + ": Volunteer cheated!\n");
            } else if (count == 1) {
                sb.append("Case #" + (i+1) + ": " + store + "\n");
            } else {
                sb.append("Case #" + (i+1) + ": Bad magician!\n");
            }
            
            square = new boolean[16];
        }
        
        PrintStream ps = new PrintStream(new FileOutputStream("magic.out", false));
        ps.println(sb.toString());
        ps.close();
    }
}
