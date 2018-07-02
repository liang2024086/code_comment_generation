package methodEmbedding.Revenge_of_the_Pancakes.S.LYD899;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z=0;
        boolean t=true;
        String st;

        for (int i=0; i<n; i++) {
            st = sc.next();
            st+="+";
            if (st.charAt(0)=='-') t = true;
            else t=false;
            for (int j=1; j<st.length(); j++){
                if (st.charAt(j-1)=='-' && st.charAt(j)=='+') z++;
            }
            if (z==0) System.out.println("Case #"+(i+1)+": 0");
            else
            if (t) System.out.println("Case #"+(i+1)+": "+(z*2-1));
                else System.out.println("Case #"+(i+1)+": "+(z*2));
            z=0;
        }
    }
}
