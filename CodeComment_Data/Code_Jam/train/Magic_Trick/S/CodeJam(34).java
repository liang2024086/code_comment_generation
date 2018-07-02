package methodEmbedding.Magic_Trick.S.LYD951;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class CodeJam {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:/codejam/input.txt"));
            String line;
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:/codejam/output.txt", false));
            
            
            int cases = Integer.parseInt(reader.readLine());
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                int option1 = Integer.parseInt(line);
                String rowData1 = "";
                for (int i = 1; i <= 4; i++) {
                    String read = reader.readLine();
                    if (option1 == i) {
                        rowData1 = read;
                    }
                }
                
                int option2 = Integer.parseInt(reader.readLine());
                String rowData2 = "";
                for (int i = 1; i <= 4; i++) {
                    String read = reader.readLine();
                    if (option2 == i) {
                        rowData2 = read;
                    }
                }
                counter++;
                bw.write("Case #" + counter + ": ");
                
                int[] track = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                
                String[] strArray = rowData1.split(" ");
                for(int i = 0; i < strArray.length; i++) {
                    track[Integer.parseInt(strArray[i]) - 1]++;
                }
                
                strArray = rowData2.split(" ");
                for(int i = 0; i < strArray.length; i++) {
                    track[Integer.parseInt(strArray[i]) - 1]++;
                }
                ArrayList<Integer> twos = new ArrayList<Integer>();
                for (int x = 0; x < track.length; x++) {
                    if (track[x] == 2) {
                        twos.add(x);
                    } 
                }
                
                switch (twos.size()) {
                    case 0:
                        bw.write("Volunteer cheated!");
                        bw.newLine();
                        break;
                    case 1:
                        bw.write("" + (twos.get(0) + 1));
                        bw.newLine();
                        break;
                    default:
                        bw.write("Bad magician!");
                        bw.newLine();
                }
            }
            
            bw.close();
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
