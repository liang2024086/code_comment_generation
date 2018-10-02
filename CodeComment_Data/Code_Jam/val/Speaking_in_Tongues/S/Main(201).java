package methodEmbedding.Speaking_in_Tongues.S.LYD141;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dave
 */
public class Main {

    public static void main(String g[]) {
        char map[] = new char[300];

        Scanner sc = new Scanner(System.in);
        
        map[' '] = ' ';
        map['a'] = 'y';
        map['b'] = 'h';
        map['c'] = 'e';
        map['d'] = 's';
        map['e'] = 'o';
        map['f'] = 'c';
        map['g'] = 'v';
        map['h'] = 'x';
        map['i'] = 'd';
        map['j'] = 'u';
        map['k'] = 'i';
        map['l'] = 'g';
        map['m'] = 'l';
        map['n'] = 'b';
        map['o'] = 'k';
        map['p'] = 'r';
        map['q'] = 'z';
        map['r'] = 't';
        map['s'] = 'n';
        map['t'] = 'w';
        map['u'] = 'j';
        map['v'] = 'p';
        map['w'] = 'f';
        map['x'] = 'm';
        map['y'] = 'a';
        map['z'] = 'q';


        int t= Integer.parseInt(sc.nextLine());
        int j=1;
        while(t>0)
        {
            t--;
            String in = sc.nextLine();
            char inp[]=in.toCharArray();
            char out[]= new char[inp.length];
            
            for(int i=0;i<inp.length;i++)
            {
                out[i]=map[inp[i]];
            }
            
            System.out.println("Case #"+(j++)+": "+new String(out));
            
        }
        
    }
}
