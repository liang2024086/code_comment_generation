package methodEmbedding.Magic_Trick.S.LYD189;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class MagicTrick {

	public static void main(String[] args) throws NumberFormatException, IOException {
		if(args.length>=1)
			System.setIn(new FileInputStream(args[0]));
		if(args.length>1) {
			System.setOut(new PrintStream(new FileOutputStream(args[1])));
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.valueOf(br.readLine());
		for(int t=1;t<=T;++t) {
			int r1=Integer.valueOf(br.readLine());
			int[][] pos1=new int[4][4];
			for(int i=0;i<4;++i) {
				String[] tok = br.readLine().split(" ");
				for(int j=0;j<4;++j)
					pos1[i][j] = Integer.valueOf(tok[j]);
			}			
			int r2=Integer.valueOf(br.readLine());
			int[][] pos2=new int[4][4];
			for(int i=0;i<4;++i) {
				String[] tok = br.readLine().split(" ");
				for(int j=0;j<4;++j)
					pos2[i][j] = Integer.valueOf(tok[j]);
			}
			//System.out.println(Arrays.toString(pos1[r1]));
			//System.out.println(Arrays.toString(pos1[r2]));
			int[] count=new int[17];
			Arrays.fill(count,0);
			for(int i=0;i<4;++i)
			{
				++count[pos1[r1-1][i]];
				++count[pos2[r2-1][i]];
			}
			int twos=0;
			int ret=-1;
			for(int i=0;i<count.length;++i)
			{
				if(count[i]==2)
				{
					ret=i;
					++twos;
				}
			}
			if(twos==1)
				System.out.println("Case #"+t+": "+ret);
			else if(twos>0)
				System.out.println("Case #"+t+": "+"Bad magician!");
			else 
				System.out.println("Case #"+t+": "+"Volunteer cheated!");
		}
	}

}
