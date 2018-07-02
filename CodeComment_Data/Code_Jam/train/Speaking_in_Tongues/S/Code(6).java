package methodEmbedding.Speaking_in_Tongues.S.LYD1298;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogendra
 */
import java.io.*;
import java.util.Scanner;
public class Code {

    public static void main(String[] args) throws IOException {
        char [] change ={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        File f = new File("input.txt");
        Scanner s = new Scanner(f);
       
        int num = s.nextInt();
        
        for (int i=0;i<=num;i++)
        {
            String chk=s.nextLine();
            int len= chk.length();
            char [] chkc=chk.toCharArray();
            if(i>0)
                System.out.print("Case #"+ i +": ");
            for(int j=0;j<len;j++)
            {
                int b = (int)chkc[j]-97;
                if(b== -65)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(change[b]);
                }
            }
            System.out.println();
        }
    }
}
