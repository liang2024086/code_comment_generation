package methodEmbedding.Standing_Ovation.S.LYD1326;


import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        long cases = in.nextLong();

        for(long i = 0; i < cases; i++) {
            Long max = in.nextLong();
            String str = in.nextLine();
            str = str.replaceAll(" ","");
            Long needed = 0L;
            Long count = 0L;

            for(int j = 0; j < str.length(); j++) {
                if(j > count) {
                    needed += j-count;
                    count += j-count;
                }
                count += Integer.parseInt(str.substring(j,j+1));
            }
            System.out.println("Case #"+(i+1)+": " + needed);
        }

    }
}
