package methodEmbedding.Counting_Sheep.S.LYD1130;


import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
            String str;
            int counter = 0;
            while ((str = in.readLine()) != null) {
                if(counter > 0) {
                    int number = Integer.parseInt(str);
                    CountingSheep countingSheep = new CountingSheep(number);
                    String result = countingSheep.whenSleep();
                    System.out.println("Case #" + counter + ": " + result);
                }
                counter++;
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
