package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1514;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GC11 {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new FileReader("C:\\Entertainment\\File.txt"));
        int val = Integer.parseInt(br.readLine()), i = 0;
        while (i < val) {
            String[] arr = br.readLine().split(" ");
            double C = Double.parseDouble(arr[0]);
            double F = Double.parseDouble(arr[1]);
            double X = Double.parseDouble(arr[2]);
            double totalTime = 0, currRate = 2;
            while (true) {
                if (!(C > X) && ((X - C) / currRate) > (X / (currRate + F))) {
                    totalTime += (C) / currRate;
                    currRate += F;
                } else {
                    totalTime += X / currRate;
                    break;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + totalTime);
            i++;
        }

    }
}
