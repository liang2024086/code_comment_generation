package methodEmbedding.Standing_Ovation.S.LYD1187;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < T; ++i) {
            int friends = 0;
            int claps = 0;
            int total = claps + friends;
            scanner.nextInt();
            String audience = scanner.nextLine();
            audience = audience.trim();
            for (int j = 0; j < audience.length(); ++j) {
                if (audience.charAt(j) == '0') continue;
                
                if (j < total) {
                    
                } else {
                    friends += (j - total);
                }
                claps += (audience.charAt(j) - '0');
                total = claps + friends;
            }
            
            System.out.println("Case #" + (i+1) + ": " + friends);
            
        }
        
        scanner.close();
        
    }

}
