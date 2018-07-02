package methodEmbedding.Standing_Ovation.S.LYD18;


import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
//        Scanner sc = new Scanner(new File("input.txt"));
        int sMax = 0, friends = 0, peoples = 0;
        String line = "";
        Scanner in = new Scanner(new File(args[0]));
        Scanner in2 = new Scanner(new File(args[0]));
        FileWriter fw = new FileWriter("output.out");

        line = in.nextLine();
//        line = in.nextLine();

//        int maxCasus = Character.digit(line.charAt(0), 10);
        int maxCasus = in2.nextInt();
        System.out.println(maxCasus);
//        while (in.hasNext()) {
            for (int n = 1; n <= maxCasus; n++) {
                friends = 0;

                line = in.nextLine();
                sMax = Character.digit(line.charAt(0), 10);
                peoples = Character.digit(line.charAt(2), 10);
                for (int i = 1; i <= sMax; i++) {

                    System.out.println("i=" + i + " peoples=" + peoples);
                    if (peoples < i) {
                        friends += i - peoples;
                        peoples = i;
                    }
                    peoples += Character.digit(line.charAt(i + 2), 10);
//                    if (Character.digit(line.charAt(i + 2), 10) == 0) friends++;
                }
    //                System.out.println("lastCur: " + Arrays.toString(cur));
                System.out.println("Case #" + n + ": " + friends);
                fw.write("Case #" + n + ": " + friends + "\n");
            }
//        }
//        System.out.println(casus);
        fw.flush();
        fw.close();
    }
}
