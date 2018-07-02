package methodEmbedding.Standing_Ovation.S.LYD2103;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int length = scanner.nextInt();
            int count = 0;
            int additionalCount = 0;
            String next = scanner.next();
            for (int j = 0; j < next.length(); j++){
                if (j > count){
                    int missing = j - count;
                    additionalCount += missing;
                    count += missing;
                }
                count += Integer.parseInt(next.substring(j, j + 1));
            }
            System.out.println("Case #"+ (i+1) +": "+ additionalCount);
        }
    }
}
