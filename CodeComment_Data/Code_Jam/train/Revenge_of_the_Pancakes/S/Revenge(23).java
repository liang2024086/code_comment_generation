package methodEmbedding.Revenge_of_the_Pancakes.S.LYD406;

import java.util.Scanner;

  class Revenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        int test=Integer.parseInt(scan.nextLine());
        int l;
        int y=0;

        
        String str="";
        for(int j=1;j<=test;j++)
        {
            y=0;
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
            for(l=1;l<charr.length;l++)
            {
                if(charr[l]!=charr[l-1])
                {
                    y++;
                }
            }
            if(charr[charr.length-1]=='-')
                y+=1;
            System.out.println("Case #"+j+": " +y);
        }
    }
    
}
