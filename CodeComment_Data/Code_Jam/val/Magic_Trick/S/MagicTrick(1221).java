package methodEmbedding.Magic_Trick.S.LYD2136;




import java.io.*;
import java.util.*;

public class MagicTrick {
    public static void main(String[] args) throws IOException {
        Scanner sca= new Scanner(System.in);
        int cases=sca.nextInt();
        for(int i=0;i<cases;i++){
            int pos1=sca.nextInt();
            int cartas1[][]=new int [4][4];
            for(int j=0;j<4;j++){
               for(int k=0;k<4;k++){
                   cartas1[j][k]=sca.nextInt();
               }                 
            }
            int pos2=sca.nextInt();
            int cartas2[][]=new int [4][4];
            for(int j=0;j<4;j++){
               for(int k=0;k<4;k++){
                   cartas2[j][k]=sca.nextInt();
               } 
            }
            int cont=0;
            int valor=0;
            for(int j=0;j<4;j++){
                for(int k=0; k<4 ;k++){
                    if(cartas1[pos1-1][j]==cartas2[pos2-1][k]){
                        cont++;
                        valor=cartas2[pos2-1][k];
                    }
                }
            }
            if(cont==1)
                System.out.println("Case #"+(i+1)+": "+valor);
            if(cont==0)
                System.out.println("Case #"+(i+1)+": Volunteer cheated!");
            if(cont>1)
                System.out.println("Case #"+(i+1)+": Bad Magician!");
        }
        
    }
}
