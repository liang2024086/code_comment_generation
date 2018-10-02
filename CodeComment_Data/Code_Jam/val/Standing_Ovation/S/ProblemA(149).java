package methodEmbedding.Standing_Ovation.S.LYD527;


import java.util.Scanner;

/**
 * Created by walkerravina on 4/11/15.
 */
public class ProblemA {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int T = Integer.parseInt(s.split(" ")[0]);
        for(int i = 0; i < T; i++){
            s = scan.nextLine().split(" ")[1];
            int ans = 0;
            int standing = 0;
            for(int k = 0; k < s.length(); k++){
                int n = s.charAt(k) - '0';
                int diff = 0;
                if(standing < k){
                    diff = k - standing;
                }
                ans += diff;
                standing = standing + diff + n;
            }
            System.out.println("Case #" + (i + 1) + ": " + ans);
        }
    }
}
