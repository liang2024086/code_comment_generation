package methodEmbedding.Speaking_in_Tongues.S.LYD841;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author root
 */
public class TestTc {

    
    public static void main(String[] args) {
        String a = "yhesocvxduiglbkrztnwjpfmaq";
        Scanner in = new Scanner(System.in);
        int d = 1;
        while(in.hasNext())
        {
            int t = in.nextInt();
            in.nextLine();
            while(t-- >= 0 )
            {
                StringBuffer buff = new StringBuffer();
                String b = in.nextLine();
                for(int i=0;i<b.length();i++)
                {
                    if(b.charAt(i)==' ')
                    {
                        buff.append(' ');
                    }
                    else
                    {
                        buff.append(a.charAt(b.charAt(i)-'a'));
                    }
                }
                System.out.println("Case #"+ (d++) +": " + buff.toString());
            }
        }
    }
}

