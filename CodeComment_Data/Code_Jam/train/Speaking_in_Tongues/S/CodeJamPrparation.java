package methodEmbedding.Speaking_in_Tongues.S.LYD1423;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class CodeJamPrparation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
        HashMap map = new HashMap();
        map.put('y', 'a');
        map.put('n', 'b');
        map.put('f', 'c');
        map.put('i', 'd');
        map.put('c', 'e');
        map.put('w', 'f');
        map.put('l', 'g');
        map.put('b', 'h');
        map.put('k', 'i');
        map.put('u', 'j');
        map.put('o', 'k');
        map.put('m', 'l');
        map.put('x', 'm');
        map.put('s', 'n');
        map.put('e', 'o');
        map.put('v', 'p');
        map.put('z', 'q');
        map.put('p', 'r');
        map.put('d', 's');
        map.put('r', 't');
        map.put('j', 'u');
        map.put('g', 'v');
        map.put('t', 'w');
        map.put('h', 'x');
        map.put('a', 'y');
        map.put('q', 'z');
        //-------------------
        int TestCases,i=0;
        List<StringBuilder> Cases = new ArrayList<StringBuilder>();
        FileInputStream fstream = new FileInputStream("A-small.in");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        strLine = br.readLine();
        TestCases = Integer.parseInt(strLine);
        while (i<TestCases)
        {
            strLine = br.readLine();
            Cases.add(new StringBuilder(strLine));
            i++;
        }
        in.close();

        for(int y=0;y<TestCases;y++)
        {
            for(int j=0;j<Cases.get(y).length();j++)
            {
                if(Cases.get(y).charAt(j)!=' ')
                {
                    Object c =  map.get(Cases.get(y).charAt(j));
                    Character f =(Character)c;
                    char n = f.charValue();
                    Cases.get(y).setCharAt(j,n );
                }
            }
        }
        FileWriter fstreamm = new FileWriter("A-small.out");
        BufferedWriter out = new BufferedWriter(fstreamm);
        for(int t=0;t<TestCases;t++)
        {
            out.write("Case #"+(t+1)+": "+Cases.get(t));
            out.newLine();
        }
    
        out.close();
        
        
        
        
        
        
        
    }
}
