package methodEmbedding.Standing_Ovation.S.LYD1355;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int qNum=1;
        do {
            int s = scanner.nextInt();
            String line = scanner.nextLine();
            char[] nums = line.trim().toCharArray();

            int cur=0, sum=0;
            for (int i=0; i<s; i++) {
                cur+=nums[i]-'0';
//                System.out.println(i+"::"+nums[i]);
                if (cur<i+1) {
                    cur++;
                    sum++;
                }
            }
            System.out.println("Case #"+qNum+": "+sum);
            qNum++;
        }while (--T>0);
    }
}
