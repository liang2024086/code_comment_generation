package methodEmbedding.Standing_Ovation.S.LYD2198;


import java.util.Scanner;

public class StandingOvation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        for (int t = 1; t <= T; t++) {
            String line = in.nextLine();
            String nums[] = line.split(" ");
            int m = Integer.parseInt(nums[0]);
            int sum = 0, count = 0; 
            for (int i = 0; i <= m; i++) {
                if (sum < i) {
                    count += i - sum;
                    sum = i;
                }
                sum += nums[1].charAt(i) - '0';
            }
            System.out.println("Case #" + t + ": " + count);
        }

    }

}
