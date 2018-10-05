package methodEmbedding.Magic_Trick.S.LYD909;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Adewale
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick {

    public static void main( String [] args ) throws FileNotFoundException{
    
        int x=1;
        
        String out ="";
        
        Scanner in = new Scanner(new File("A-small-attempt1.in"));
        
        
        int t = in.nextInt();
       
        do{
       
            int a1 = (in.nextInt())-1;

            int [][] arr1 = new int[4][4];

            //int [][] arr1 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };

            for(int i=0; i<4; i++){

                for(int j=0; j<4; j++){

                    arr1[i][j] = in.nextInt();

                }
                
            
            }
           
            int a2 = (in.nextInt())-1;
            
            int [][] arr2 = new int[4][4];

            //int [][] arr2 = { {1,2,5,4}, {3,11,6,15}, {9,10,7,12}, {13,14,8,16} };

            //int [][] arr2 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };



            for(int i=0; i<4; i++){

                for(int j=0; j<4; j++){

                    arr2[i][j] = in.nextInt();
                    
                }
                
            }
            
            
            int value=0;

            int counter=0;

            for(int i=0; i<4;i++){
                
                for(int j=0;j<4;j++){
                
                       if (arr1[a1][i] == arr2[a2][j]){
                           
                            counter++;

                            value = arr1[a1][i];
                       
                       }  
                
                }

            
/*
            if (arr1[a1][i] == arr2[a2][i]){

                counter++;

                value = arr1[a1][i];


            }
            else{

                    System.out.println("else");
            }
            */

            }


            if(counter > 1){

                out+="Case #"+x+": Bad magician! \n";
            
            }else if(counter==0){

                out+="Case #"+x+": Volunteer cheated! \n";
                
            }else{

                out+="Case #"+x+": "+ value+"\n";
            
            }


            
            PrintWriter outStream = new PrintWriter(new File("A-small-attempt1.out"));
            
            outStream.write(out);
            
            outStream.close();
            
            
            
            
            x++;

        }while(x<=t);

               
        
        
    }
        
    
}
