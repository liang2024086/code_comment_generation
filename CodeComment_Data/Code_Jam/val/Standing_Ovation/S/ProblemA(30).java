package methodEmbedding.Standing_Ovation.S.LYD1193;

import java.util.Scanner;

class ProblemA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int nCase = 1; nCase <= t; nCase++){
            String[] line = sc.nextLine().split(" ");
            int sMax = Integer.parseInt(line[0]);
            int sum = 0, min = 0;
            for(int req = 1; req <= sMax+1; req++){
                int si = Character.getNumericValue(line[1].charAt(req-1));
                sum += si;
                if(sum < req) {
                    min += req - sum;
                    sum = req;
                }
            }
            System.out.println("Case #" + nCase + ": " + min);
        }
    }
}
