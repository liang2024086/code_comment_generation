package methodEmbedding.Magic_Trick.S.LYD1005;

import java.util.*;

public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for(int caseNum = 1; caseNum <= numCases; caseNum++) {
			 int firstRow = in.nextInt() - 1;
			 Integer[] firstRowNums = new Integer[ 4 ];
             for(int m = 0; m < 4; m++) {
                for(int n = 0; n < 4; n++) {
                    int nextNum = in.nextInt();
                    if ( m == firstRow )
                        firstRowNums[ n ] = nextNum;
                }
             }
            int secondRow = in.nextInt() - 1;
            Integer[] secondRowNums = new Integer[ 4 ];
            for(int m = 0; m < 4; m++) {
                for(int n = 0; n < 4; n++) {
                    int nextNum = in.nextInt();
                    if ( m == secondRow )
                        secondRowNums[ n ] = nextNum;
                }
            }
            int lastMatch = -1;
            int matchCount = 0;
            for(int m = 0; m < 4; m++) {
                for(int n = 0; n < 4; n++) {
                   if ( firstRowNums[m] == secondRowNums[n] ) {
                       matchCount++;
                       lastMatch = firstRowNums[m];
                   }
                }
            }
            if ( matchCount == 0 )
                System.out.format("Case #%d: Volunteer cheated!\n", caseNum );
            else if ( matchCount == 1 )
                System.out.format("Case #%d: %d\n", caseNum, lastMatch );
            else
                System.out.format("Case #%d: Bad magician!\n", caseNum );
		}			
	}
}
