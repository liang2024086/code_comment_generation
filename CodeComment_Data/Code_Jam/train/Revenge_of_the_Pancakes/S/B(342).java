package methodEmbedding.Revenge_of_the_Pancakes.S.LYD632;


import java.io.FileInputStream;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("B.in");
            Scanner s = new Scanner(input);
            int T = s.nextInt();
            int j = 0;
            s.nextLine();
            for (int i = 1; i <= T; i++) {
                int count = 0;

                String panacakes = s.nextLine();
                StringBuffer testString = new StringBuffer(panacakes);

                if (!panacakes.contains("+")) {
                    System.out.println("Case #" + i + ": " + "1");
                } else if (!panacakes.contains("-")) {
                    System.out.println("Case #" + i + ": " + "0");
                } else {

                    while (panacakes.contains("-")) {

                        if (panacakes.startsWith("+")) {
                            j = 0;
                            while (j < panacakes.length() && panacakes.charAt(j) == '+') {
                                testString.setCharAt(j, '-');
                                j++;
                            }
                            panacakes = new String(testString);
                            count++;

                        } else if (panacakes.startsWith("-")) {
                            j = 0;
                            while (j < panacakes.length() && panacakes.charAt(j) == '-') {
                                testString.setCharAt(j, '+');
                                j++;
                            }
                            panacakes = new String(testString);

                            count++;
                        }

                    }
                    System.out.println("Case #" + i + ": " + count);
                }
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

}
