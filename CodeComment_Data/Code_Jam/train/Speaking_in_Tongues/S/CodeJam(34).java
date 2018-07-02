package methodEmbedding.Speaking_in_Tongues.S.LYD723;


import java.io.*;
import java.util.*;

public class CodeJam {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String name = "test";
        
        Scanner in = new Scanner( new BufferedReader( new FileReader(name + ".in") ) );
        BufferedWriter out = new BufferedWriter( new FileWriter(name + ".out") );
        
        char[] key = new char[26];
        
        key[0] = 'y';
        key[1] = 'h';
        key[2] = 'e';
        key[3] = 's';
        key[4] = 'o';
        key[5] = 'c';
        key[6] = 'v';
        key[7] = 'x';
        key[8] = 'd';
        key[9] = 'u';
        key[10] = 'i';
        key[11] = 'g';
        key[12] = 'l';
        key[13] = 'b';
        key[14] = 'k';
        key[15] = 'r';
        key[16] = 'z';
        key[17] = 't';
        key[18] = 'n';
        key[19] = 'w';
        key[20] = 'j';
        key[21] = 'p';
        key[22] = 'f';
        key[23] = 'm';
        key[24] = 'a';
        key[25] = 'q';
        
        int N = in.nextInt();
        
        String temp = "";
        String str = "";
        String[] arr = null;
        
        int i,j,index;
        int count = 1;
        
        temp = in.nextLine();
        
        while(in.hasNext())
        {
            temp = in.nextLine();
            arr = temp.split(" ");
            str = "";
            
            for(i=0 ; i<arr.length ; i++)
            {
                for(j=0 ; j<arr[i].length() ; j++)
                {
                    index = ( (int)arr[i].charAt(j) )-97;
                    str = str + key[index];
                }
                
                str = str + " ";
            }
            
            out.write("Case #" + count + ": " + str);
            out.newLine();
            count++;
        }
        
        out.close();
    }
}
