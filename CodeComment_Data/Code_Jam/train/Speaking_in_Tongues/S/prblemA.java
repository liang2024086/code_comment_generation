package methodEmbedding.Speaking_in_Tongues.S.LYD1603;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Abdo
 */
public class prblemA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        char[]  el ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p' ,'q', 'r', 's', 't', 'u', 'v' ,'w' ,'x', 'y', 'z'};
        Scanner sc=new Scanner(System.in);
        char[]  gl ={'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r' ,'z', 't', 'n', 'w', 'j', 'p' ,'f' ,'m', 'a', 'q'};
        int n=sc.nextInt();
        sc.nextLine();
        String[] arrs=new String[n];
         String googler=new String();
    for(int k=0;k<n;k++)
    {
         googler=sc.nextLine();
        arrs[k]=googler;
    }
    for(int k=0;k<n;k++)
    {
        String eng=new String();
        char[] gool=arrs[k].toCharArray();
        int num=gool.length;
        int index=0;
        
        for(int i=0;i<num;i++)
        {
            if(gool[i]!=' ')
            {
                 for(int j=0;j<gl.length;j++) 
                    {
                        if(gool[i] == el[j])
                        {
                            index=j;
                            break;
                        }
                     }
                  eng=eng+gl[index];
            }
           else
                eng=eng+" ";
        }
      //  System.out.print("Case "+"#"+(k+1)+":");
       // System.out.println(eng);
        System.out.format("Case #%d: %s\n", k+1, eng);
    }
    }
    
}
