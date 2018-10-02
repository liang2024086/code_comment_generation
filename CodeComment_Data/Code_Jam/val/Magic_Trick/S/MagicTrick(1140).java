package methodEmbedding.Magic_Trick.S.LYD338;


import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String filename = "A-small-attempt0.in";
			String out = "a.out";
			Scanner sc = new Scanner(new File(filename));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(out)));
			//Scanner sc = new Scanner(System.in);
			int numcase = sc.nextInt();
			for(int zz = 0; zz < numcase; zz ++){
				int ret = -1;
				int row = sc.nextInt();
				int[][] temp = new int[4][4];
				boolean[] res = new boolean[16];
				for(int i = 0; i < 16; i++) res[i] = false;
				for(int i = 0; i < temp.length; i++)
					for(int j = 0; j <temp[i].length; j++) temp[i][j] = sc.nextInt();
				for(int j = 0; j< temp.length; j++){
					int z = temp[row-1][j];
					res[z-1] = true;
				}
				
				row = sc.nextInt();
				for(int i = 0; i < temp.length; i++)
					for(int j = 0; j <temp[i].length; j++) temp[i][j] = sc.nextInt();
				for(int j = 0; j< temp.length; j++){
					int z = temp[row-1][j];
					if(res[z-1] && ret == -1){
						ret = z;
					}
					else if(res[z-1] && ret != -1){
						System.out.printf("Case #%d: Bad magician!\n", zz+1);
						pw.printf("Case #%d: Bad magician!\n", zz+1);
						ret = -2;
						break;
					}
				}
				if(ret == -2){
					continue;
				}
				else if (ret == -1){
					pw.printf("Case #%d: Volunteer cheated!\n", zz+1);
				}
				else{
					pw.printf("Case #%d: %d\n", zz+1, ret);
				}
			}
			sc.close();
			pw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
