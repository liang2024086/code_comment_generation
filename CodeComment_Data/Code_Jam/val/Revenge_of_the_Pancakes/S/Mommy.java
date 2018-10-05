package methodEmbedding.Revenge_of_the_Pancakes.S.LYD320;


import java.util.Scanner;

public class Mommy {

    public static void main(String[] args) {
        int count;
        String s = "";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            count = 0;
            s = sc.nextLine();
            int len = s.length();
            int a[] = new int[len];
            for (int l = len - 1; l >= 0; l--) {
                if (s.charAt(l) == '-') {
                    a[l] = 0;
                } else {
                    a[l] = 1;
                }

            }

            for (int l = len - 1; l >= 0; l--) {
                if (a[l] == 0) {
                    count = count +1;
                    for (int j = l; j>=0; j--) {
                          a[j] = (a[j]+1)%2;
                    }
                } 
            }
            System.out.println("Case #" + i + ": "+count);
        }

    }
}    
