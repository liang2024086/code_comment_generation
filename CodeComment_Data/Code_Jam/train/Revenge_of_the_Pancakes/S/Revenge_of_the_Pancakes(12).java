package methodEmbedding.Revenge_of_the_Pancakes.S.LYD186;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
  import java.util.Scanner;

  public class Revenge_of_the_Pancakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        int test=Integer.parseInt(scan.nextLine());
        int l1;
        int y1=0;

        
        String str="";
        for(int j=1;j<=test;j++)
        {
            y1=0;
            str=scan.nextLine();
            char[] charr=str.toCharArray();
            if(charr.length==1)
            {
                if(charr[0]=='-')
                    System.out.println("Case #"+j+": 1");
                else
                    System.out.println("Case #"+j+": 0");
                continue;
            }
            for(l1=1;l1<charr.length;l1++)
            {
                if(charr[l1]!=charr[l1-1])
                {
                    y1++;
                }
            }
            if(charr[charr.length-1]=='-')
                y1+=1;
            System.out.println("Case #"+j+": " +y1);
        }
    }
    
}
