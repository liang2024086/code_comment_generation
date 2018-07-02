package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1138;


import java.io.*;
import java.util.Hashtable;

public class PrbmB
{
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new FileReader("D:\\cJam\\B-small-attempt0.in"));

        BufferedWriter write = new BufferedWriter(new FileWriter("D:\\cJam\\B-small-out.in"));
        int n = Integer.parseInt(read.readLine()) , i , j , k;
        long result;
        Hashtable<String , Integer> table = new Hashtable<>();
        table.put("+" , 0);
        table.put("-" , 1);
        table.put("++" , 0);
        table.put("+-" , 2);
        table.put("-+" , 1);
        table.put("--" , 1);
        table.put("+++" , 0);
        table.put("++-" , 2);
        table.put("+-+" , 2);
        table.put("+--" , 2);
        table.put("-++" , 1);
        table.put("-+-" , 3);
        table.put("--+" , 1);
        table.put("---" , 1);
        String s , st[] , shortened;
        for ( i = 0; i < n ; i++)
        {
            s = read.readLine();
            st = s.split("");
            shortened = "";
            if ( s.length() <= 3)
            {
                System.out.println(table.get(s));
                write.write("Case #" + (i + 1) + ": " + table.get(s));
                write.newLine();
            }
            else
            {
                for ( j = 0 ; j < st.length ; j++ )
                {
                    shortened+=st[j];
                    for ( k = j + 1 ; k < st.length && st[k].equals(st[j]) ; k++ );
                    j = k - 1;
                }
                if ( shortened.length() <= 3)
                {
                    System.out.println(table.get(shortened));
                    write.write("Case #" + (i + 1) + ": " + table.get(shortened));
                    write.newLine();
                }
                else
                {
                    st = shortened.split("");
                    result = table.get(st[0]+st[1]+st[2]);
                    for ( j = 3 ; j < st.length ; j++)
                    {
                        if ( st[j].equals("-"))
                        {
                            result+=2;
                        }
                    }
                    System.out.println(result);
                    write.write("Case #" + (i + 1) + ": " + result);
                    write.newLine();
                }
            }

        }
        write.close();
    }
}
