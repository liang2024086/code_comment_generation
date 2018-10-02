package methodEmbedding.Counting_Sheep.S.LYD1529;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class sheep {

    public static void main(String[] args) throws Throwable{
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\A-small-attempt1.in"));
        FileWriter writer = new FileWriter("C:\\Users\\admin\\Desktop\\A-small-attempt0.out");
        Integer T = Integer.parseInt(reader.readLine());
        Integer counter = 1;
        for(int q = 0; q < T; q++) {
            Integer N = Integer.parseInt(reader.readLine());
            if(N==0){

                writer.write("Case #" + counter + ": " + "INSOMNIA" + "\n");
                writer.flush();
                counter++;
            }
            else {
                HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
                map.put(0, false);
                map.put(1, false);
                map.put(2, false);
                map.put(3, false);
                map.put(4, false);
                map.put(5, false);
                map.put(6, false);
                map.put(7, false);
                map.put(8, false);
                map.put(9, false);
                int i = 1;
                while (true) {
                    Integer b = (N * i);
                    if (map.containsValue(false)) {
                        String a = b.toString();
                        for (int j = 0; j < a.length(); j++) {
                            map.put(Integer.parseInt(a.substring(j, j + 1)), true);
                        }
                        i++;
                    } else {
                        int c = b - (b / i);
                        writer.write("Case #" + counter + ": " + c + "\n");
                        writer.flush();
                        counter++;
                        break;
                    }
                }
            }
        }
    }
}
