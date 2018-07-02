package methodEmbedding.Magic_Trick.S.LYD1385;



import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class QualProblemA {

    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintStream ps = new PrintStream(new File("A-small-attempt0.out"));
        
        int T = in.nextInt();
        
        for(int tc = 1; tc <= T; tc++) {
            
            int g1 = in.nextInt()-1;
            
            HashSet<Integer> set1 = new HashSet();
            HashSet<Integer> set2 = new HashSet();

            for(int i=0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    if(i == g1) {
                        set1.add(in.nextInt());
                    }
                    else {
                        in.nextInt();
                    }
                }
            }
            
            int g2 = in.nextInt()-1;
            
            for(int i=0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    if(i == g2) {
                        set2.add(in.nextInt());
                    }
                    else {
                        in.nextInt();
                    }
                }
            }
            
            set1.retainAll(set2);
            
            ps.print("Case #"+tc+": ");
            if(set1.size() == 1) {
                ps.println(set1.toArray()[0]);
            }
            else if(set1.size() == 0) {
                ps.println("Volunteer cheated!");
            }
            else {
                ps.println("Bad magician!");
            }
        }
        
    }
    
}
