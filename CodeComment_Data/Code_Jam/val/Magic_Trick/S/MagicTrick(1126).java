package methodEmbedding.Magic_Trick.S.LYD555;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int c = 0; c < T; c++) {
			boolean[] f1 = new boolean[16];
			boolean[] f2 = new boolean[16];
			int f = Integer.parseInt(in.readLine());
			for (int i = 0; i < f-1; i++) {
				in.readLine();
			}
			String[] s = in.readLine().split(" ");
			for (int i = 0; i < s.length; i++) {
				f1[Integer.parseInt(s[i])-1]=true;
			}
			for (int i = f; i < 4; i++) {
				in.readLine();
			}
			f = Integer.parseInt(in.readLine());
			for (int i = 0; i < f-1; i++) {
				in.readLine();
			}
			s = in.readLine().split(" ");
			for (int i = 0; i < s.length; i++) {
				f2[Integer.parseInt(s[i])-1]=true;
			}
			for (int i = f; i < 4; i++) {
				in.readLine();
			}
			boolean trampa = false;
			int ans = -1;
			for (int i = 0; i < 16; i++) {
				if(f1[i] && f2[i])
				{
					if(ans==-1)
						ans = i+1;
					else
						trampa = true;
				}
			}
			if(ans!=-1 && !trampa)
				System.out.println("Case #"+(c+1)+": "+ans);
			else if(trampa)
				System.out.println("Case #"+(c+1)+": "+"Bad magician!");
			else
				System.out.println("Case #"+(c+1)+": "+"Volunteer cheated!");
		}
	}
}
