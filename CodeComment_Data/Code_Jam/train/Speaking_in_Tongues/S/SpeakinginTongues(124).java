package methodEmbedding.Speaking_in_Tongues.S.LYD1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Anirban
 */
public class SpeakinginTongues {
    public static void main(String [] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int tc = 1;
        int T = Integer.parseInt(br.readLine());

        char map[] = new char[26];
        map[0] = 'y'; map[1] = 'h'; map[2] = 'e'; map[3] = 's'; map[4] = 'o';
        map[5] = 'c'; map[6] = 'v'; map[7] = 'x'; map[8] = 'd'; map[9] = 'u';
        map[10] = 'i'; map[11] = 'g'; map[12] = 'l'; map[13] = 'b'; map[14] = 'k';
        map[15] = 'r'; map[16] = 'z'; map[17] = 't'; map[18] = 'n'; map[19] = 'w';
        map[20] = 'j'; map[21] = 'p'; map[22] = 'f'; map[23] = 'm'; map[24] = 'a'; map[25] = 'q';

        while(T-- > 0){
             String in = br.readLine();
             int len = in.length();

             System.out.printf("Case #%d: ", tc);
             for(int i = 0; i < len; i++){
                 if(in.charAt(i) == ' ')
                     System.out.print(' ');
                 else
                    System.out.print(map[in.charAt(i) - 'a']);
             }
             System.out.println();
             tc++;
        }
    }
}
