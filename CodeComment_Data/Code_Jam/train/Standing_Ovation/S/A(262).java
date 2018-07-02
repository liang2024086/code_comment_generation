package methodEmbedding.Standing_Ovation.S.LYD1692;


import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t=1; t<=T; t++){
            int sMax=in.nextInt();
            int[] array= new int[sMax+1];
            int aux=in.nextInt();
            int i=sMax;
            int answer=0;
            while (aux>0){
                array[i]=aux%10;
                aux/=10;
                i--;
            }
            int people=0;
            for (int j=0; j<=sMax;j++){
                people+=array[j];
                if (people<j+1){
                    answer++;
                    people++;
                }    
            }     
            System.out.println("Case #"+t+": "+answer);
        }
    }  
}
