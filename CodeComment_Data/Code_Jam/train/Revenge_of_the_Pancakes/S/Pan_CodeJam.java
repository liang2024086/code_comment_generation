package methodEmbedding.Revenge_of_the_Pancakes.S.LYD194;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyu
 */
import java.util.Scanner;

class Pan_CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int k;
        int x=0;
        int posi=0;
        
        String s="";
        for(int i=1;i<=t;i++)
        {
            x=0;
            s=sc.nextLine();
            char[] ch=s.toCharArray();
            if(ch.length==1)
            {
                if(ch[0]=='-')
                    System.out.println("Case #"+i+": 1");
                else
                    System.out.println("Case #"+i+": 0");
                continue;
            }
            for(k=1;k<ch.length;k++)
            {
                if(ch[k]!=ch[k-1])
                {
                    x++;
                }
            }
            if(ch[ch.length-1]=='-')
                x+=1;
            System.out.println("Case #"+i+": " +x);
        }
    }
    
}
