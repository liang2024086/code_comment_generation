package methodEmbedding.Magic_Trick.S.LYD2075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Darwinx
 */
public class halo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader baca= new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a = Integer.parseInt(baca.readLine());
        
        
        for(int ii=1; ii<a+1; ii++){
         b= Integer.parseInt(baca.readLine());
        
         int index1=0;
         int index2=0;
        
         String[][] card = new String[4][4];
         for(int jj=0; jj<4; jj++){
         StringTokenizer token=new StringTokenizer(baca.readLine());
            while(token.hasMoreTokens()){
                card[index1][index2]=token.nextToken();
                index2++;
            }
         index2=0;
         index1++;
         }
         index1=0;
         
         c = Integer.parseInt(baca.readLine());
         String[][] card2 = new String[4][4];
         
         for(int jj=0; jj<4; jj++){
          StringTokenizer token=new StringTokenizer(baca.readLine());
            while(token.hasMoreTokens()){
                card2[index1][index2]=token.nextToken();
                index2++;
                
            }
         index2=0;
         index1++;
         }
		 
         int count=0;
         String haha="lala";
         for(int jj=0; jj<4;jj++){
             for(int kk=0; kk<4; kk++){
                 if(card[b-1][jj].equals(card2[c-1][kk])){
                    count=count+1;
                    haha= card2[c-1][kk];
                    }
               }
            }
         if(count == 0){System.out.println("Case #"+ii+": Volunteer Cheated!");}
            else if(count > 1) System.out.println("Case #"+ii+": Bad Magician!");
            else    System.out.println("Case #"+ii+": "+haha);
        }
    }
}
