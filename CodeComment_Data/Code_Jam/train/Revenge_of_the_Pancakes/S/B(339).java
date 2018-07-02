package methodEmbedding.Revenge_of_the_Pancakes.S.LYD698;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            String pc = sc.next();
            int flips = 0;
            while(!pc.isEmpty()) {
                int r = pc.length()-1;
                while(r >= 0 && pc.charAt(r) == '+')
                    r--;
                pc = pc.substring(0, r+1);
                if(pc.isEmpty())
                    break;

                if(pc.charAt(0) == '-') {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < pc.length(); j++) {
                        if(pc.charAt(j) == '-')
                            sb.append('+');
                        else
                            sb.append('-');
                    }
                    pc = sb.reverse().toString();
                } else {
                    StringBuilder sb = new StringBuilder();
                    int l = 0;
                    while(l < pc.length() && pc.charAt(l) == '+') {
                        sb.append('-');
                        l++;
                    }
                    sb.append(pc.substring(l));
                    pc = sb.toString();
                }
                flips++;

            }

            System.out.println("Case #" + i + ": " + flips);



        }
    }
}
