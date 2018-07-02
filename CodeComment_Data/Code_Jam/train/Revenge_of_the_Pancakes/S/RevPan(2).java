package methodEmbedding.Revenge_of_the_Pancakes.S.LYD335;


import java.io.*;
import java.util.Hashtable;

public class RevPan
{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("F:\\sai\\B-small-attempt0.in"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\sai\\B-small-out.in"));
        int n = Integer.parseInt(reader.readLine()) , i , j , k;
        long res;
        Hashtable<String , Integer> mp = new Hashtable<>();
        mp.put("+" , 0);
        mp.put("-" , 1);
        mp.put("++" , 0);
        mp.put("+-" , 2);
        mp.put("-+" , 1);
        mp.put("--" , 1);
        mp.put("+++" , 0);
        mp.put("++-" , 2);
        mp.put("+-+" , 2);
        mp.put("+--" , 2);
        mp.put("-++" , 1);
        mp.put("-+-" , 3);
        mp.put("--+" , 1);
        mp.put("---" , 1);
        String s , st[] , trunc;
        for ( i = 0; i < n ; i++)
        {
            s = reader.readLine();
            st = s.split("");
            trunc = "";
            if ( s.length() <= 3)
            {
                System.out.println(mp.get(s));
                writer.write("Case #" + (i + 1) + ": " + mp.get(s));
                writer.newLine();
            }
            else
            {
                for ( j = 0 ; j < st.length ; j++ )
                {
                    trunc+=st[j];
                    for ( k = j + 1 ; k < st.length && st[k].equals(st[j]) ; k++ );
                    j = k - 1;
                }
                if ( trunc.length() <= 3)
                {
                    System.out.println(mp.get(trunc));
                    writer.write("Case #" + (i + 1) + ": " + mp.get(trunc));
                    writer.newLine();
                }
                else
                {
                    st = trunc.split("");
                    res = mp.get(st[0]+st[1]+st[2]);
                    for ( j = 3 ; j < st.length ; j++)
                    {
                        if ( st[j].equals("-"))
                        {
                            res+=2;
                        }
                    }
                    System.out.println(res);
                    writer.write("Case #" + (i + 1) + ": " + res);
                    writer.newLine();
                }
            }

        }
        writer.close();
    }
}
