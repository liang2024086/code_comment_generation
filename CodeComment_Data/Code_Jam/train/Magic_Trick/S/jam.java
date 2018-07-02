package methodEmbedding.Magic_Trick.S.LYD633;

import java.io.*;
import java.util.*;

public class jam {
   
	public static void main (String[] args) throws IOException {
            BufferedReader f = new BufferedReader(new FileReader("A-small-attempt4.in"));
            StringTokenizer st = new StringTokenizer(f.readLine());
            int test_cases = Integer.parseInt(st.nextToken());
            String result= null;
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test7.out")));
            for ( int j = 0; j < test_cases; j++) {
            	result = null;
            	//PARSE EACH TEST CASE NOW. 
            	String blah = f.readLine();
                st = new StringTokenizer(blah);
                //if (j==0) System.out.println(blah);
                int row_num = Integer.parseInt(st.nextToken());
                int[] row1 = new int[4];
                for (int i = 1; i <= 4; i ++) {
                	st = new StringTokenizer(f.readLine());
                	if (i == row_num) {
                        
                        for (int k = 0; k < 4; k++) {
                    	    row1[k] = Integer.parseInt(st.nextToken());

                        }

                    }
                }
                blah = f.readLine();
                st = new StringTokenizer(blah);
                //if (j==0) System.out.println (blah);
                row_num = Integer.parseInt(st.nextToken());
                int[] row2 = new int[4];
                for (int i = 1; i <= 4; i++) {
                	st = new StringTokenizer(f.readLine());
                    if (i == row_num) {
                        for (int k = 0; k < 4; k++) {
                        	row2[k] = Integer.parseInt(st.nextToken());
                        }
                    }
                }
                // NOW WE CHECK SIMILARITIES
                outerloop:
                for (int z = 0; z<4;z++) {
                	for (int y = 0; y<4; y++) {
                		if (row1[z] == row2[y]) {
                			//if (j==0) System.out.print(row1[z] + " " + row2[y]);
                			if (result != null) {
                				result = "Bad Magician!";
                				break outerloop;
                			} 
                			result = Integer.toString(row1[z]);
                		}
                	}
                }

                if (result == null) {
                    out.println("Case #" + (j+1) + ": Volunteer cheated!");
                } else {
                	out.println("Case #" + (j+1) + ": " + result);
                }


            }
            out.close();
            System.exit(0);
	}

} 
 
