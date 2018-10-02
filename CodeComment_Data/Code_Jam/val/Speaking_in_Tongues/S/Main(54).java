package methodEmbedding.Speaking_in_Tongues.S.LYD1045;

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String args[]) throws Exception{
        char map[] = new char[150];
        map['a'] = 'y';map['b'] = 'h';map['c'] = 'e';map['d'] = 's';
        map['e'] = 'o';map['f'] = 'c';map['g'] = 'v';map['h'] = 'x';
        map['i'] = 'd';map['j'] = 'u';map['k'] = 'i';map['l'] = 'g';
        map['m'] = 'l';map['n'] = 'b';map['o'] = 'k';map['p'] = 'r';
        map['q'] = 'z';map['r'] = 't';map['s'] = 'n';map['t'] = 'w';
        map['u'] = 'j';map['v'] = 'p';map['w'] = 'f';map['x'] = 'm';
        map['y'] = 'a';map['z'] = 'q';map[' '] = ' ';
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        int test=1;
        while(t-->0)
        {
            
            String inp = br.readLine();
			String res="";
            for(int i=0;i<inp.length();i++)res+=map[inp.charAt(i)];
            
            
            System.out.println("Case #"+test+": "+res);
			test++;
            
        }
        
    }
}
