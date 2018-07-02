package methodEmbedding.Counting_Sheep.S.LYD1345;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by trsmith on 4/8/2016.
 */
public class SheepCounter {

    public static void main(String[] args) throws IOException {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;
        boolean zero = false;

        //Path path = new Path("C:\\Users\\trsmith\\Desktop\\in.in");
        Path path = Paths.get("C:/Users/trsmith/Desktop/A-small-attempt1.in");
        List<String> input = Files.readAllLines(path);
        int[] ints;
        ints = new int[input.size()];

        for(int i = 0; i < ints.length; i += 1)
        {
            ints[i] = Integer.parseInt(input.get(i));
        }

        File file = new File("output.txt");
        PrintWriter p = new PrintWriter(file);

        int caseNum = 0;

        for (int i=1; i < ints.length; i+=1) {
            boolean insomnia = false;
            boolean asleep = false;
            one = false;
            two = false;
            three = false;
            four = false;
            five = false;
            six = false;
            seven = false;
            eight = false;
            nine = false;
            zero = false;

            int count = 0;
            int n = ints[i];
            int current = n;
            while (!asleep) {
                int number = current;
                while (number > 0) {
                    int digit = number % 10;
                    if (digit == 1) {
                        one = true;
                    } else if (digit == 2) {
                        two = true;
                    } else if (digit == 3) {
                        three = true;
                    } else if (digit == 4) {
                        four = true;
                    } else if (digit == 5) {
                        five = true;
                    } else if (digit == 6) {
                        six = true;
                    } else if (digit == 7) {
                        seven = true;
                    } else if (digit == 8) {
                        eight = true;
                    } else if (digit == 9) {
                        nine = true;
                    } else if (digit == 0) {
                        zero = true;
                    } else {
                        System.out.println("Error");
                        System.exit(0);
                    }
                    number = number / 10;
                }

                current += n;
                if (count == 10000) {
                    insomnia = true;
                    break;
                }
                count += 1;
                asleep = one && two && three && four && five && six && seven && eight && nine && zero;
            }
            caseNum += 1;
            current -= n;
            if(insomnia)
            {
                p.println("Case #" + caseNum + ": INSOMNIA");
            }
            else
            {
                p.println("Case #" + caseNum + ": " + current);
            }
        }
        p.close();
    }


}
