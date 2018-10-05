package methodEmbedding.Cookie_Clicker_Alpha.S.LYD379;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ProblemB {
    public static void main(String args[]){
        BufferedReader in;
        BufferedWriter out;
        
        try {
            in = new BufferedReader(new FileReader("C://Users/Matthew/Documents/School/6.005 Software Construction/"
                    + "Java Workspace/code_jam_qualification_2014/inputB.txt"));
            out = new BufferedWriter(new FileWriter("outputB.txt"));
            
            String line;
            int num_tests;
            
            if ((line = in.readLine()) != null){
                num_tests = Integer.valueOf(line);
            }
            
            int test_num = 1;
            int line_num = 0;

            while ((line = in.readLine()) != null){
                String[] inp = line.split(" ");
                double C = Double.valueOf(inp[0]);
                double F = Double.valueOf(inp[1]);
                double X = Double.valueOf(inp[2]);
                
                double rate = 2.0;
                double time = 0;
                
                while (X/rate > C/rate + X/(rate+F)){
                    time += C/rate;
                    rate += F;
                }
                
                time += X/rate;
                
                out.write("Case #" + String.valueOf(test_num) + ": " + String.valueOf(time));
                out.newLine();
                test_num++;
            }
            
            in.close();
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
