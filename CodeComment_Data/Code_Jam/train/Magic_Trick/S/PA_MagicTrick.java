package methodEmbedding.Magic_Trick.S.LYD1243;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanM
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.LinkedList;
public class PA_MagicTrick {
    static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String[]args){
        int t,r1,r2,cN;
        int[][] sq=new int[4][4];
        LinkedList<Integer> ll=new LinkedList<Integer>();
        LinkedList<Integer> lc=new LinkedList<Integer>();
        t=sc.nextInt();
        cN=1;
        while(t-->0){
            ll.clear();
            lc.clear();
            r1=sc.nextInt()-1;            
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    sq[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<4;i++){
                ll.add(sq[r1][i]);
            }
            
            r2=sc.nextInt()-1;            
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    sq[i][j]=sc.nextInt();
                }
            }
            //System.out.println("To string: "+ lc.toString());
            for(int i=0;i<4;i++){
                if(ll.contains((Integer)sq[r2][i])){
                    lc.add(sq[r2][i]);
                }
            }
            //System.out.println("To string2: "+ lc.toString());
            if(lc.size()==1){
                out.printf("Case #%d: %d\n",cN++,lc.getFirst());
            }else{
                if(!lc.isEmpty()&&lc.size()<5){
                    out.printf("Case #%d: %s\n",cN++,"Bad magician!");
                }else{
                    out.printf("Case #%d: %s\n",cN++,"Volunteer cheated!");
                }
            }
            
        }
        out.flush();
        
    }
    
    
}
