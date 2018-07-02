package methodEmbedding.Magic_Trick.S.LYD729;

import java.util.*;

public class Solution {
    public static void main ( String[] args ) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int c = 1;
	while( c <= T ) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    HashSet<Integer> hs = new HashSet<Integer>();
	    int row = sc.nextInt()-1;
	    int[][] grid = new int[4][4];
	    for( int i = 0; i < 4; i++ ) {
		for( int j = 0; j < 4; j++ ) {
		    grid[i][j] = sc.nextInt();
		}
	    }
	    for( int i = 0; i < 4; i++ ) {
		hs.add(grid[row][i]);
	    }
	    row = sc.nextInt()-1;
            for( int i = 0; i < 4; i++ ) {
                for( int j = 0; j < 4; j++ ) {
                    grid[i][j] = sc.nextInt();
                }
            }
            for( int i = 0; i < 4; i++ ) {
		if( hs.contains(grid[row][i]) ) {
		    res.add((Integer)grid[row][i]);
		}
            }
	    String str = "";
	    if( res.size() == 1 ) {
		str += res.get(0);
	    } else if( res.size() > 1) {
		str += "Bad magician!";
	    } else {
		str += "Volunteer cheated!";
	    }
	    System.out.printf("Case #%d: %s\n",(c++),str);
	}
    }
}
