package methodEmbedding.Counting_Sheep.S.LYD1554;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CodeJam {
    
    static String inputFileName = "D:\\codejam\\A-small-attempt0.in";
    static String outpuFileName = "D:\\codejam\\output.txt";
    
    static String EOL = System.lineSeparator();
    
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(new File(inputFileName));
            FileWriter fr = new FileWriter(outpuFileName);
            
            int count = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < count; i++) {
                
                int x = scanner.nextInt();
                
                if (x == 0) {
                    fr.write("Case #" + (i+1) + ": INSOMNIA" + EOL);
                    fr.flush();
                    continue;
                }
                                
                boolean b1 = false;
                boolean b2 = false;
                boolean b3 = false;
                boolean b4 = false;
                boolean b5 = false;
                boolean b6 = false;
                boolean b7 = false;
                boolean b8 = false;
                boolean b9 = false;
                boolean b0 = false;
                
                int incrementer = 1;
                    
                int n = 0;
                while(!(
                    b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 && b0 
                )) {
                    n = (incrementer * x);
                    String y = "" + n;
                    
                    if (!b1 && y.indexOf('1') > -1) {
                        b1 = true;
                    }
                    if (!b2 && y.indexOf('2') > -1) {
                        b2 = true;
                    }
                    if (!b3 && y.indexOf('3') > -1) {
                        b3 = true;
                    }
                    if (!b4 && y.indexOf('4') > -1) {
                        b4 = true;
                    }
                    if (!b5 && y.indexOf('5') > -1) {
                        b5 = true;
                    }
                    if (!b6 && y.indexOf('6') > -1) {
                        b6 = true;
                    }
                    if (!b7 && y.indexOf('7') > -1) {
                        b7 = true;
                    }
                    if (!b8 && y.indexOf('8') > -1) {
                        b8 = true;
                    }
                    if (!b9 && y.indexOf('9') > -1) {
                        b9 = true;
                    }
                    if (!b0 && y.indexOf('0') > -1) {
                        b0 = true;
                    }
                    incrementer++;
                }
                
                fr.write("Case #" + (i+1) + ": " + n + EOL);
                fr.flush();
            }
            
            fr.flush();
            fr.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
