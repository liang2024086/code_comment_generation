package methodEmbedding.Speaking_in_Tongues.S.LYD1593;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sumanb
 */
public class CodeJamQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        char [] translator = new char[26];
        translator[0]='y';
        translator[1]='h';
        translator[2]='e';
        translator[3]='s';
        translator[4]='o';
        translator[5]='c';
        translator[6]='v';
        translator[7]='x';
        translator[8]='d';
        translator[9]='u';
        translator[10]='i';
        translator[11]='g';
        translator[12]='l';
        translator[13]='b';
        translator[14]='k';
        translator[15]='r';
        translator[16]='z';
        translator[17]='t';
        translator[18]='n';
        translator[19]='w';
        translator[20]='j';
        translator[21]='p';
        translator[22]='f';
        translator[23]='m';
        translator[24]='a';
        translator[25]='q';        
        
        for(int i= 1; i<= num ; ++i)
        {
            String line = br.readLine();
            String op = new String();
            for(int j = 0; j< line.length(); ++j)
            {
                if(line.charAt(j) == ' ')
                    op += ' ';
                else
                op = op + translator[line.charAt(j) - 'a'];
            }
            System.out.println("Case #"+ i +": "+op);
        }
    }
}
