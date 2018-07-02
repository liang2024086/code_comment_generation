package methodEmbedding.Standing_Ovation.S.LYD1725;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        for(int i=0; i<t; i++){
            int smax = s.nextInt();
            
            int f = 0;
            int sum = 0;
            String ss = s.next();
            for(int j=0; j<=smax; j++){
                
                if(sum < j){ f+= (j-sum); sum=j; }
                sum += Integer.parseInt(ss.substring(j, j+1));
                
            }
            
            System.out.printf("Case #%d: %d\n", i+1, f);
        }
    }

}
