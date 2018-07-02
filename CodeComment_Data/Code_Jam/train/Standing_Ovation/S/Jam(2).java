package methodEmbedding.Standing_Ovation.S.LYD40;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Jam {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("A-small-attempt3.in"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        String countLine = sc.nextLine();
        int count = Integer.parseInt(countLine);
        for (int i = 0; i < count; i++) {
            out.print("Case #" + (i + 1) + ": ");
            String line = sc.nextLine();
            String mas[] = line.split(" ");
            line = mas[1];
            int first = line.charAt(0) - '0';
            int countOfStand = first;
            int answer = 0;
            for (int j = 1; j < line.length(); j++) {
                int temp = line.charAt(j) - '0';
                if (temp!=0){
                    if (j>countOfStand){
                        answer += j - countOfStand;
                        countOfStand += j - countOfStand;
                    }
                    countOfStand+=temp;
                }
            }
            out.print(answer);
            out.println();
        }
        out.flush();
    }
}
