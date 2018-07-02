package methodEmbedding.Standing_Ovation.S.LYD1876;


import java.util.Scanner;

public class Codejam1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for (int testCase = 1; testCase <= testCases; testCase++) {
            int Smax = s.nextInt();
            String shynesses = s.next();
            int standing = 0;
            int invites = 0;
            for (int shyness = 0; shyness <= Smax; shyness++) {
                if (standing < shyness) {
                    invites++;
                    standing++;
                }
                standing += shynesses.charAt(shyness) - '0';
            }
            System.out.println("Case #" + testCase + ": " + invites);
        }
    }
    
}
