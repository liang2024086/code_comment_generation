package methodEmbedding.Revenge_of_the_Pancakes.S.LYD586;


import java.io.*;
import java.util.Hashtable;

public class PanCakes
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praveen\\Downloads\\B-small-attempt1 (1).in"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new FileWriter("C:\\Users\\praveen\\Downloads\\B-pan-out1.in"));
        int n = Integer.parseInt(br.readLine()) , i , j , k;
        long val;
        Hashtable<String , Integer> map = new Hashtable<>();
        map.put("+" , 0);
        map.put("-" , 1);
        map.put("++" , 0);
        map.put("+-" , 2);
        map.put("-+" , 1);
        map.put("--" , 1);
        map.put("+++" , 0);
        map.put("++-" , 2);
        map.put("+-+" , 2);
        map.put("+--" , 2);
        map.put("-++" , 1);
        map.put("-+-" , 3);
        map.put("--+" , 1);
        map.put("---" , 1);
        String s , st[] , newS;
        for ( i = 0; i < n ; i++)
        {
            s = br.readLine();
            st = s.split("");
            newS = "";
            if ( s.length() <= 3)
            {
                System.out.println(map.get(s));
                w.write("Case #" + (i + 1) + ": " + map.get(s));
                w.newLine();
            }
            else
            {
                for ( j = 0 ; j < st.length ; j++ )
                {
                    newS+=st[j];
                    for ( k = j + 1 ; k < st.length && st[k].equals(st[j]) ; k++ );
                    j = k - 1;
                }
                if ( newS.length() <= 3)
                {
                    System.out.println(map.get(newS));
                    w.write("Case #" + (i + 1) + ": " + map.get(newS));
                    w.newLine();
                }
                else
                {
                    st = newS.split("");
                    val = map.get(st[0]+st[1]+st[2]);
                    for ( j = 3 ; j < st.length ; j++)
                    {
                        if ( st[j].equals("-"))
                        {
                            val+=2;
                        }
                    }
                    System.out.println(val);
                    w.write("Case #" + (i + 1) + ": " + val);
                    w.newLine();
                }
            }

        }
        w.close();
    }
}
