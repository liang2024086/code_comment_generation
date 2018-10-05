package methodEmbedding.Magic_Trick.S.LYD829;


import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 1; i <= T; ++i) {
            int first_answer = in.nextInt()-1;
            int [][] first_grid = new int[4][4];
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    first_grid[j][k] = in. nextInt();
                }
            }
            int second_answer = in.nextInt()-1;
            int [][] second_grid = new int[4][4];
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    second_grid[j][k] = in. nextInt();
                }
            }
            int n = 0;
            int answer = -1;
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    if (first_grid[first_answer][j] == second_grid[second_answer][k]) {
                        ++n;
                        answer = first_grid[first_answer][j];
                    }    
                }
            }
            switch(n) {
                case 0: System.out.println("Case #"+i+": Volunteer cheated!");
                        break;
                case 1: System.out.println("Case #"+i+": "+answer);
                        break;
                default: System.out.println("Case #"+i+": Bad magician!");                 
            }
        }
        
    }
    
}
