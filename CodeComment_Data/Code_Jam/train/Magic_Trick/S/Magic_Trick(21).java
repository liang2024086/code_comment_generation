package methodEmbedding.Magic_Trick.S.LYD546;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Magic_Trick {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,j,k,l,n,r,m,a,f=0;
        String ln;
        int[] x=new int[4];
        n=in.nextInt();
        for (i = 1; i <= n; i++) {
            m=0;
            r=in.nextInt();
            in.nextLine();
            for (j = 1; j <= 4; j++) {
                if(j==r){
                    for ( k = 0; k < 4; k++){
                      x[k]=in.nextInt();
                    }
                    in.nextLine();
                }else{
                    ln=in.nextLine();
                }
            }
            r=in.nextInt();
            in.nextLine();
            for (j = 1; j <= 4; j++) {
                if(j==r){
                    for ( k = 0; k < 4; k++){
                        a=in.nextInt();
                        for (l = 0; l < 4; l++) {
                            if(a==x[l]){
                                m++;
                                f=l;
                            }
                        }
                    }
                    in.nextLine();
                    
                }else{
                    ln=in.nextLine();
                }
                
            }
            System.out.print("Case #"+i);
            if(m<1){
                System.out.println(" Volunteer cheated!");
            }else if(m>1){
                System.out.println(" Bad magician!");
            }else{
                System.out.println(" "+x[f]);
            }
                
        }
        
    }
    
}
