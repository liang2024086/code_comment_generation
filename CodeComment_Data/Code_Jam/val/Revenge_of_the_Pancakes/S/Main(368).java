package methodEmbedding.Revenge_of_the_Pancakes.S.LYD271;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String fileName = "testData.txt";

        String line = null;

        try {
            FileReader f = new FileReader(fileName);

            BufferedReader myReader = new BufferedReader(f);

            while ((line = myReader.readLine()) != null) {
                int loop = Integer.parseInt(line);

                for (int i = 1; i <= loop; i++) {
                    line = myReader.readLine();

                    System.out.print("Case #" + i + ": ");

                    int number = 0;

                    while (line.contains("-")) {
                        char lastChar = '?';

                        for (int j = 0; j < line.length(); j++) {
                            if (lastChar == '?'){
                                if (j == line.length() - 1) {
                                    line = new StringBuilder(line).reverse().toString();

                                    line = line.replace('-', 'p');
                                    line = line.replace('+', '-');
                                    line = line.replace('p', '+');
                                    number ++;
                                    break;
                                } else {
                                    lastChar = line.charAt(j);
                                }
                            } else if (lastChar == '+') {
                                if (line.charAt(j) != '+') {
                                    String sub = line.substring(0, j);
                                    String after = line.substring(j, line.length());

                                    sub = sub.replace('-', 'p');
                                    sub = sub.replace('+', '-');
                                    sub = sub.replace('p', '+');

                                    line = new StringBuilder(sub).reverse().toString() + after;
                                    number++;
                                    break;
                                }else if (j == line.length() - 1) {
                                    line = new StringBuilder(line).reverse().toString();

                                    line = line.replace('-', 'p');
                                    line = line.replace('+', '-');
                                    line = line.replace('p', '+');
                                    number ++;
                                    break;
                                }
                            } else if (lastChar == '-'){
                                if (line.charAt(j) != '-') {
                                    String sub = line.substring(0, j );
                                    String after = line.substring(j, line.length());

                                    sub = sub.replace('-', 'p');
                                    sub = sub.replace('+', '-');
                                    sub = sub.replace('p', '+');

                                    line = new StringBuilder(sub).reverse().toString() + after;
                                    number++;
                                    break;
                                }else if (j == line.length() - 1) {
                                    line = new StringBuilder(line).reverse().toString();

                                    line = line.replace('-', 'p');
                                    line = line.replace('+', '-');
                                    line = line.replace('p', '+');
                                    number ++;
                                    break;
                                }
                            }
                        }
                    }

                    System.out.println(number);
                }
            }
        } catch (Exception e)
        {

        }
    }
}
