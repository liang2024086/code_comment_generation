package methodEmbedding.Speaking_in_Tongues.S.LYD680;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeMap;

public class Tounge
{
    
    static HashMap<String, String> examples = new HashMap<String, String>();
    static TreeMap<Character, Character> mapping = new TreeMap<Character, Character>();
    
    static
    {
        examples.put("ejp mysljylc kd kxveddknmc re jsicpdrysi", "our language is impossible to understand");
        examples.put("rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "there are twenty six factorial possibilities");
        examples.put("de kr kd eoya kw aej tysr re ujdr lkgc jv", "so it is okay if you want to just give up");
        
        mapping.put('z', 'q');
        mapping.put('q', 'z');
    }

    public static void main(String[] args) throws Exception
    {
        for(String key : examples.keySet())
        {
            String value = examples.get(key);
            for(int i=0; i<key.length(); i++)
            {
                if(key.charAt(i) != ' ')
                {
                    mapping.put(key.charAt(i), value.charAt(i));
                }
            }
        }
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i =1;
        int n = Integer.parseInt(reader.readLine());
        for(; i<=n; i++)
        {
            String input = reader.readLine();
            System.out.print("Case #" + i + ": ");
            for(int j=0; j<input.length(); j++)
            {
                if(input.charAt(j) != ' ')
                {
                    System.out.print(mapping.get(input.charAt(j)));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
