package methodEmbedding.Magic_Trick.S.LYD2043;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Zhenyi
 * 2014 Apr 11, 2014 7:27:05 PM
 */
public class MagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File(
				"C:/Users/Zhenyi/Downloads/A-small-attempt0.in"));
		FileWriter out = new FileWriter(
				"C:/Users/Zhenyi/Downloads/A-small-attempt0.out");

		int N = in.nextInt();

		for (int cases = 1; cases <= N; cases++) {
			int row1 = in.nextInt();
			int[][] array1 = new int[4][4];
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					array1[i][j] = in.nextInt();
				}
			}
			int row2 = in.nextInt();
			int[][] array2 = new int[4][4];
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					array2[i][j] = in.nextInt();
				}
			}
			HashSet<Integer> hs1 = new HashSet<Integer>();
			HashSet<Integer> hs2 = new HashSet<Integer>();
			for(int j = 0; j < 4; j++){
				hs1.add(array1[row1-1][j]);
			}
			for(int j = 0; j < 4; j++){
				hs2.add(array2[row2-1][j]);
			}
			int count = 0; 
			int result = -1;
			for(int n : hs1){
				if(hs2.contains(n)){
					count ++;
					result = n;
				}
			}
			if(count == 1){
				out.write("Case #" + cases + ": " + result +"\n");
			}else{
				if(count == 0){
					out.write("Case #" + cases + ": " + "Volunteer cheated!\n");
				}else{
					out.write("Case #" + cases + ": " + "Bad magician!\n");
				}
			}
		}
		in.close();
		out.flush();
		out.close();
	}
}
