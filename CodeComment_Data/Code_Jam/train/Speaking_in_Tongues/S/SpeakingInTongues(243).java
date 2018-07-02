package methodEmbedding.Speaking_in_Tongues.S.LYD1419;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kholoud
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
            FileInputStream ifstream = new FileInputStream("C:\\Users\\Kholoud\\Downloads\\A-small-attempt0.in");
            DataInputStream in = new DataInputStream(ifstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n = Integer.parseInt(br.readLine());
            HashMap<Character, Character> letters = new HashMap<Character,Character>();
            String from = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
            String to = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
            letters.put('z', 'q');
            letters.put('q', 'z');
            for(int i = 0;i<from.length();i++)
            {
                if(!letters.containsKey(to.charAt(i)))
                {
                    letters.put(to.charAt(i),from.charAt(i));
                }
            }
            String toTranslate;
            String translated ;
            for(int i = 0;i<n;i++)
            {
                translated = "";
                toTranslate = br.readLine();
                
                for(int j = 0;j<toTranslate.length();j++)
                {
                    translated += Character.toString(letters.get(toTranslate.charAt(j)));
                }
                System.out.println("Case #"+(i+1)+": "+translated);
            }
    }
}
