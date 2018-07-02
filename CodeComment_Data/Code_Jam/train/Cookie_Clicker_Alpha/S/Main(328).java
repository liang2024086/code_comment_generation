package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1093;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int numCases = s.nextInt();s.nextLine();
        for (int i = 1; i <= numCases; i++){
            String[] vars = s.nextLine().split(" ");
            double c = Double.valueOf(vars[0]), f = Double.valueOf(vars[1]), x = Double.valueOf(vars[2]), time = 0, rate = 2;
            while (x/rate > x/(rate+f)+c/rate){
                time += c/rate;
                rate += f;
            }
            time += x/rate;
            System.out.println("Case #"+i+": "+time);
        }

    }
}
