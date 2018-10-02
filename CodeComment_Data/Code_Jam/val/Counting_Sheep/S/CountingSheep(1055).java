package methodEmbedding.Counting_Sheep.S.LYD169;


import java.util.*;
import java.io.*;
public class CountingSheep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//FileInputStream fis = new FileInputStream("TesCountSheep");
		BufferedReader br = new BufferedReader(new FileReader(new File("E:\\Backup\\Desktop\\Akash A\\Eclipse\\Workspace Akash\\Google Code Jam 2016\\A-small-attempt0.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:\\Backup\\Desktop\\Akash A\\Eclipse\\Workspace Akash\\Google Code Jam 2016\\TestOutSheep.txt")));
		StringBuilder sb = new StringBuilder("Case #");
		String  s1 = ": ",s2 = "INSOMNIA";
		long rem, tn, res;
		boolean flag;
		Set<Long> tset;
		int T = Integer.parseInt(br.readLine());
		long N;
		for (int i = 1; i <= T; i++) {
			N = Long.parseLong(br.readLine());
			//System.out.println(N);
			if ( N == 0l )
			{
				sb.append(i);
				sb.append(s1);
				sb.append(s2);
				//System.out.println(sb.toString());
				bw.append(sb.toString());
				bw.newLine();
			} 
			else
			{
				//tn = N;
				flag = true;
				tset = new TreeSet<Long>();
				for (int j = 1; flag; j++) 
				{
					tn = j * N;
					while (tn != 0 && flag) 
					{
						rem = tn % 10l;
						tn = tn / 10l;
						tset.add(rem);
						if (tset.size() == 10)
						{
							flag = false;
							res = j * N;
							sb.append(i);
							sb.append(s1);
							sb.append(res);
							//System.out.println(sb.toString());
							bw.append(sb.toString());
							bw.newLine();
						}
					}
				}
			}
			tset = null;
			sb.delete(6,sb.length());
		}	
		br.close();
		bw.close();
	}
}
