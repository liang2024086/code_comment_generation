package methodEmbedding.Standing_Ovation.S.LYD1458;

import java.util.Scanner;

/**
 * Created by julio on 4/11/15.
 */
public class A {

    public static void main(String args[]) {
        //Scanner scanner = new Scanner(A.class.getClassLoader().getResourceAsStream("sample.in"));
        //Scanner scanner = new Scanner(A.class.getClassLoader().getResourceAsStream("A-small-attempt0.in"));
        Scanner scanner = new Scanner(A.class.getClassLoader().getResourceAsStream("A-small-attempt1.in"));
        int N = scanner.nextInt();
        for(int i=0;i<N;i++) {
            int Smax = scanner.nextInt();
            String audience = scanner.next();
            int friends = 0;
            int clapping = 0;
            for(int j=0;j<audience.length();j++) {
                while(clapping < j) {
                    friends++;
                    clapping++;
                }
                clapping += Integer.parseInt(Character.toString(audience.charAt(j)));
            }
            System.out.println("Case #" + (i+1) + ": " + friends);
        }
    }

}
