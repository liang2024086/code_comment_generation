package methodEmbedding.Standing_Ovation.S.LYD991;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Main.class.getResourceAsStream("/a.txt");
        //OutputStream outputStream = System.out;
        OutputStream outputStream = new FileOutputStream(new File("./result.out"));
        Scanner scanner = new Scanner(inputStream);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int Smax = scanner.nextInt();
            String peopleStr = scanner.next();
            char[] people = peopleStr.toCharArray();

            int standCount = Integer.parseInt(String.valueOf(people[0]));
            int friends = 0;
            for (int j = 1; j <= Smax; j++) {
                int p = Integer.parseInt(String.valueOf(people[j]));

                if (p > 0 && standCount < j) {
                    int k = (j - standCount);
                    friends += k;
                    standCount += k;
                }
                standCount += p;
            }


            writer.write("Case #" + (i+1) + ": " + friends);

            writer.newLine();
            writer.flush();
        }

        scanner.close();
        writer.close();
    }
}
