package methodEmbedding.Magic_Trick.S.LYD671;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        int[][] grid1 = new int[4][4], grid2 = new int[4][4];
        int n, row1, row2, i, j, k, l, t;
        StringTokenizer st;
        StringBuffer out = new StringBuffer("");
        
        for (t = 1; t <= testCases; t++) {
            
            row1 = Integer.parseInt(br.readLine()) - 1;
            for (i = 0; i < 4; i++) {
                
                st = new StringTokenizer(br.readLine());
                for (j = 0; j < 4; j++) {
                    
                    grid1[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            row2 = Integer.parseInt(br.readLine()) - 1;
            for (i = 0; i < 4; i++) {
                
                st = new StringTokenizer(br.readLine());
                for (j = 0; j < 4; j++) {
                    
                    grid2[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int count = 0;
            int pos = 0;
            for (i = 0; i < 4; i++) {
                
                for (j = 0; j < 4; j++) {
                    
                    if (grid1[row1][i] == grid2[row2][j]) {
                        count++;
                        pos = i;
                        break;
                    }
                }
            }
            
            out.append("Case #");
            out.append(t);
            out.append(": ");
            if (count == 1) {
                out.append(grid1[row1][pos]);
            } else if (count > 1) {
                out.append("Bad magician!");
            } else {
                out.append("Volunteer cheated!");
            }
            
            out.append("\n");
        }
        
        System.out.print(out.toString());
    }
}
