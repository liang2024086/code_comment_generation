package methodEmbedding.Standing_Ovation.S.LYD794;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./A-small-attempt3.in.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        FileWriter writer = new FileWriter(new File("out.txt"));
        
        int count = Integer.parseInt(reader.readLine());
        for(int i=0;i<count ;i++) {
            String line = reader.readLine();
            String[] input = line.split(" ");
            
            int max = Integer.parseInt(input[0]);
            int levels[] = new int[max+1];
            for(int j = 0; j<max+1;j++) {
                levels[j] = Integer.parseInt(Character.toString(input[1].charAt(j)));
            }
            int sum = levels[0];
            int res = 0;
            for(int k=1;k<max+1;k++) {
                
                if(sum < k && levels[k] !=0) {
                    res += (k - sum);
                    sum += res;
                }
                sum += levels[k];
            }
            writer.write("Case #"+(i+1) + ": " +res);
            writer.write("\n");
        }
        
        reader.close();
        writer.close();
        
    }
}
