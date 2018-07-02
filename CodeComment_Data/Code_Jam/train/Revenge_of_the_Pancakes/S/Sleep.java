package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1191;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Sleep {
    
    public static void main(String[] args) {
        File file = new File("src/input.in");
        File of = new File("src/out.txt");
        
        try {
            Scanner sc = new Scanner(file);
            //Scanner sc = new Scanner(System.in);
            int iter = Integer.parseInt(sc.nextLine());
            
            FileWriter fw = new FileWriter(of, true);
            PrintWriter pw = new PrintWriter(fw);
            
            for (int i = 0; i < iter; i++) {
                String cur = sc.nextLine();
                
                // if false, looking for -
                // if true, looking for +
                Boolean side = false;
                int counter = 0;
                
                for (int j = cur.length() - 1; j >= 0; j--) {
                    if(side) {
                        if (cur.charAt(j) == '+') {
                            counter += 1;
                            side = !side;
                        }
                    }
                    else {
                        if (cur.charAt(j) == '-') {
                            counter += 1;
                            side = !side;
                        }
                    }
                }
                pw.println("Case #" + (i+1) + ": " + counter);
                //System.out.println("Case #" + (i+1) + ": " + counter);

            }
            sc.close();
            pw.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
