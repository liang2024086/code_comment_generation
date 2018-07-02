package methodEmbedding.Standing_Ovation.S.LYD866;

import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        for (int i = 1; i <= cases; i++) {
            int total = sc.nextInt();
            String friend = sc.next();
            total = 0;
            int newF = 0;
            int remainF = 0;
            for (int j = 0; j < friend.length(); j++) {
            	int num = friend.charAt(j) - '0';
            	if (num == 0 ) {
            		if (remainF == 0)
            			newF++;
            		else 
            			remainF--;
            	} else if (num > 1){
            		remainF += (num-1);
            	}
       
            	
            }
            System.out.println("Case #" + i + ": "+ newF);
                       
        }
    }
}



