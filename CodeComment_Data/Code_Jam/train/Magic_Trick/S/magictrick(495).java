package methodEmbedding.Magic_Trick.S.LYD2190;


import java.util.Scanner;


public class magictrick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        for(int i = 0; i < x; i++) {
            String y = "";
            int a;
            int b[][] = new int[4][4];
            int c[] = new int[16];
            int d = 0;
        
            for(int l = 0; l < 2; l++) {
                a = s.nextInt();

                for(int j = 0; j < 4; j++) {
                    for(int k = 0; k < 4; k++) {
                        b[j][k] = s.nextInt();
                    }
                }

                for(int j = 0; j < 4; j++) {
                    c[b[a-1][j] - 1]++;
                }
            }
            
            for(int j = 0; j < 16; j++) {
                if (c[j] == 2) {
                    d++;
                    y = Integer.toString(j + 1);
                }
            }
            
        if (d == 1) {
            System.out.println("Case #" + (i + 1) + ": " + y);
        } else if (d > 1) {
            System.out.println("Case #" + (i + 1) + ": Bad magician!");
        } else {
            System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
        }
                    
        }
        
    }
}
