package methodEmbedding.Standing_Ovation.S.LYD2071;

import java.io.*;


public class StandingOvation {

	private static BufferedWriter bw;
	private static BufferedReader br;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\cdixit\\Desktop\\A-small-attempt0.in"));
			bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\cdixit\\Desktop\\output1.txt").getAbsoluteFile()));
			Integer T = new Integer(br.readLine());
			for (int i=0; i < T; i++)
			{
				String instance = br.readLine();
				String[] splitted = instance.split(" ");
				
				
				int total = 0;
				int tempcount = 0;
				int bring = 0;
				while(tempcount < splitted[1].length())
				{
					total += (int)splitted[1].charAt(tempcount)-48;
					tempcount++;
				}
		//		System.out.println("total = " + total);
				int standing = (int)splitted[1].charAt(0) - 48;
				int k = 1;
				while (standing != total)
				{
					int s = (int)splitted[1].charAt(k) - 48;
				//	System.out.println("s = " + s + " k = " + k);
					if (standing < k)
					{
						bring++;
						total++;
						standing++;
					}
					else
					{
						standing += s;
						k++;
					}
				}
				
				System.out.println(bring);
				int l = i+1;
				bw.write("Case #" + l + ": " + bring + "\n");

			}
			bw.close();			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
