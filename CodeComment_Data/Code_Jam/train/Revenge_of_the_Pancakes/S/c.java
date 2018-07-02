package methodEmbedding.Revenge_of_the_Pancakes.S.LYD947;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=1; t<=T; t++) {
            int results = 0;
            String psides = in.next();
            int length = psides.length();
            if (length==1 && psides.contentEquals("-")) {
                results++;
            }
            for (int i = 0; i < length - 1; i++) {
                char sideCurrent = psides.charAt(i);
                char sideNext = psides.charAt(i + 1);

                if (sideCurrent == '-') {
                    if (sideNext == '+'){
                        results++;
                    }else if (sideNext == '-' && length == i + 2 ){
                        results++;
                    }

                } else if (sideCurrent == '+' && sideNext == '-') {
                    results++;
                    if (length == i + 2) {
                        results++;
                    }
                }
            }
            System.out.printf("Case #%d: %s \n", t,results);
        }
    }
}
