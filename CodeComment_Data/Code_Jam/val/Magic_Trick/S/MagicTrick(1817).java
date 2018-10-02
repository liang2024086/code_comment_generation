package methodEmbedding.Magic_Trick.S.LYD1486;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; 
/**
 *
 * @author islam
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matrix[][]=new int[4][4];
       int matrix1[][]=new int[4][4];
       int mtest[]=new int[4];
       Scanner input = new Scanner(System.in);
        int T = input.nextInt() ;
        // 1 ??? T ??? 100.
        if (T<1||T>100)
            System.out.println("Wront input!!!");
        int counter=0;
        int result=0;
         int answer1 , answer2;
        for(int k = 1; k <= T ; k++)
        {
            // read the 1 ??? both answers ??? 4.
            answer1 = input.nextInt() ;
            answer1--;
            for(int i=0 ; i<4; i++)
                for(int j=0;j<4;j++)
                    matrix[i][j]=input.nextInt() ;
            
            for (int i=0 ; i<4 ; i++)
                mtest[i]= matrix[answer1][i];
            
            
            answer2 = input.nextInt() ;
            answer2--;
            for(int i=0 ; i<4; i++)
                for(int j=0;j<4;j++)
                    matrix1[i][j]=input.nextInt() ;
           
            for(int i=0 ; i<4 ; i++)
               for(int j=0; j<4 ;j++)
            
                    if( mtest[i]== matrix1[answer2][j])
                   {
                       counter = counter + 1;
                       result = mtest[i];
                       
                   }
               
            if(counter < 1)
              System.out.println("Case #"+k+": Volunteer cheated!");
            else if(counter == 1)
                 System.out.println("Case #"+k+": "+result);
            else if(counter > 1)
                System.out.println("Case #"+k+": Bad magician!");
            
            result =0;
            counter =0;
            
                          
        }
        
        
        
        
    }
}
