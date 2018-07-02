package methodEmbedding.Magic_Trick.S.LYD67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QRA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int c=sc.nextInt()-1;
            int[][] in = new int[4][4];
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            ArrayList<Integer> a2 = new ArrayList<Integer>();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int n=sc.nextInt();
                    if(j==c){
                        a1.add(n);
                    }
                }
            }
            c=sc.nextInt()-1;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int n=sc.nextInt();
                    if(j==c){
                        a2.add(n);
                    }
                }
            }
            a1.retainAll(a2);
            switch (a1.size()){
                case 0:
                    System.out.println("Case #"+(i+1)+": Volunteer cheated!");
                    break;
                case 1:
                    System.out.println("Case #"+(i+1)+": "+a1.get(0));
                    break;
                default:
                    System.out.println("Case #"+(i+1)+": Bad magician!");
            }
        }
    }
}
