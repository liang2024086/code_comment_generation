package methodEmbedding.Speaking_in_Tongues.S.LYD665;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kutub
 */
public class sit {
    
    public static  void main(String args[]) throws FileNotFoundException
    {
        char in[]={'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
        char [] out={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        File f=new File("C:/Users/kutub/Documents/NetBeansProjects/JavaApplication1/src/javaapplication1/input.txt");
        Scanner s=new Scanner(f);
        int n;
        int c=0;
        String k=null;
        System.out.println("output:");
        while(s.hasNext())
        {
            n=s.nextInt();
            s.nextLine();
           for(int i=1;i<=n;i++)
            {
                k=s.nextLine();
                c=k.length();
                char [] b=k.toCharArray();
                for(int j=0;j<c;j++)
                {
                    for(int h=0;h<in.length;h++)
                    {
                        if(b[j]==in[h])
                        {
                            b[j]=out[h];
                            break;
                        }
                        else
                        {
                            continue;
                        }
                    }
                }
                System.out.print("Case #"+i+": ");
                System.out.println(b);
            }
           
        }
    }
}
