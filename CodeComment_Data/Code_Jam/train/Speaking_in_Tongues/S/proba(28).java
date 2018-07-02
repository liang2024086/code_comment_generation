package methodEmbedding.Speaking_in_Tongues.S.LYD385;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


/**
 *
 * @author Venkatesh
 */
public class proba {
    
    public static void main(String args[])
    {
        int t,ind=1;
        char ch[];
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        s.nextLine();
   
        String st;
        
        while(ind<=t)
        {
            st=s.nextLine();
        
            ch=st.toCharArray();
            
            
         
            for(int i=0;i<ch.length;i++)
            {
              
                switch(ch[i])
                {
                    case ' ':
                        continue;
                    case 'y': ch[i]='a';
                    break;
                    case 'n': ch[i]='b';
                    break;
                    case 'f': ch[i]='c';
                    break;
                    case 'i': ch[i]='d';
                    break;
                    case 'c': ch[i]='e';
                    break;
                    case 'w': ch[i]='f';
                    break;
                    case 'l': ch[i]='g';
                    break;
                    case 'b': ch[i]='h';
                    break;
                    case 'k': ch[i]='i';
                    break;
                    case 'u': ch[i]='j';
                    break;
                    case 'o': ch[i]='k';
                    break;
                    case 'm': ch[i]='l';
                    break;
                    case 'x': ch[i]='m';
                    break;
                    case 's': ch[i]='n';
                    break;
                    case 'e': ch[i]='o';
                    break;
                    case 'v': ch[i]='p';
                    break;
                    case 'z': ch[i]='q';
                    break;
                    case 'p': ch[i]='r';
                    break;
                    case 'd': ch[i]='s';
                    break;
                    case 'r': ch[i]='t';
                    break;
                    case 'j': ch[i]='u';
                    break;
                    case 'g': ch[i]='v';
                    break;
                    case 't': ch[i]='w';
                    break;
                    case 'h': ch[i]='x';
                    break;
                    case 'a': ch[i]='y';
                    break;
                    case 'q': ch[i]='z';
                    break;
                }
            }
            
            String newst=new String(ch);
            System.out.println("Case #"+ind+": "+newst);
            ind++;
        }
            
    }
}
