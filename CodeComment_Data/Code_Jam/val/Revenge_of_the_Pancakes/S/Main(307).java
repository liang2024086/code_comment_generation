package methodEmbedding.Revenge_of_the_Pancakes.S.LYD465;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("input.txt");
        File output = new File("output.txt");


        LinkedList<String> input = new LinkedList<>();
        try {
            if (!output.exists()) {
                file.createNewFile();
            }
            Scanner scanner = new Scanner(file);
            int tests = scanner.nextInt();
            while (scanner.hasNext()) {
                input.addLast(scanner.next());
            }
            scanner.close();

            FileWriter fw = new FileWriter(output.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tests; i++) {
                int flips = 0;
                if(input.get(i).contains("-")) {
                    char[] stack = input.get(i).toCharArray();
                    if(stack.length == 1) {
                        if(stack[0] == '-') {
                            flips++;
                        }
                    } else {
                        char current = stack[0];
                        for(int j = 0; j < stack.length; j++) {
                            if(stack[j] != current) {
                                flips++;
                                current = stack[j];
                            }
                        }
                        if(current == '-') {
                            flips++;
                        }
                    }

                    bw.write("Case #" + (i+1) + ": " + flips + "\n");
                } else {
                    bw.write("Case #" + (i+1) + ": " + flips + "\n");
                }
            }
            bw.close();
        } catch (Exception e) {

        }


    }
}
