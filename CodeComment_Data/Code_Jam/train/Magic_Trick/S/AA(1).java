package methodEmbedding.Magic_Trick.S.LYD1414;


import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahmoud J00N
 */
public class AA {
    public static void main(String ard[]){
        try{
            Scanner in = new Scanner(new File("A-small-attempt1.in"));
            Formatter out = new Formatter("a.out");
            int numTest = in.nextInt();
            
            for(int  k = 1 ; k <= numTest ;k++){
                ArrayList<Integer> pso = new ArrayList<Integer>();
                int board[][] = new int[4][4];
                int fcos = in.nextInt();
                for(int i = 0;i<4;i++){
                    for(int j = 0;j<4;j++){
                        board[i][j] = in.nextInt();
                        if(i+1==fcos){
                            pso.add(board[i][j]);
                        }
                    }
                }
                int secCos = in.nextInt();
                for(int i = 0;i<4;i++){
                    for(int j = 0;j<4;j++){
                        board[i][j] = in.nextInt();
                        if(i+1!=secCos){
                            if(pso.contains(board[i][j]))
                                pso.remove(new Integer(board[i][j]));
                        }
                    }
                }
                if(pso.size()==1){
                    out.format("%s\n", "Case #"+k+": "+pso.get(0));
//                    System.out.println("Case #"+k+": "+pso.get(0));
                }
                else if(pso.size()==0){
                    out.format("%s\n", "Case #"+k+": Volunteer cheated!");
//                    System.out.println();
                }
                else if(pso.size()>1){
                    out.format("%s\n", "Case #"+k+": Bad magician!");
//                    System.out.println();
                }
                
            }
            out.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
