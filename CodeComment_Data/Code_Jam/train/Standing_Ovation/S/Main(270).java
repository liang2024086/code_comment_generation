package methodEmbedding.Standing_Ovation.S.LYD1357;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner fin = null;
//        try {
//            fin = new Scanner(new File("input.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        PrintStream out = null;
//        try {
//            out = new PrintStream(new FileOutputStream("output.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.setOut(out);

        Scanner fin = new Scanner(System.in);

        int T = fin.nextInt();

        for (int i=0; i<T; i++){
            int Smax = fin.nextInt();
            String S = fin.next();

            int lgS  = S.length();

            int newFriendsNr = 0,
                    specUp = S.charAt(0)-'0';
            for(int j = 1; j < lgS; j++){
                if (specUp < j){
                    newFriendsNr += j-specUp;
                    specUp = j;
                }
                specUp += S.charAt(j)-'0';
            }

            System.out.println("Case #" + (i+1) + ": " + newFriendsNr);
        }
    }
}
