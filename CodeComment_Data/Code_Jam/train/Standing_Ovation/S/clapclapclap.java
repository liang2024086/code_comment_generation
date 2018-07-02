package methodEmbedding.Standing_Ovation.S.LYD668;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class clapclapclap {
	
	public static void main(String[] args)
	{
		try {
			Scanner sc = new Scanner(Paths.get("A-small-attempt0.in"));
			String out="";
			
			int T = sc.nextInt();
			
			for (int i = 0; i<T; i++)
			{
				int n = sc.nextInt();
				String s = sc.nextLine().trim();
				
				int k  = 0;
				int kq = 0;
				for (int j = 0; j<=n ; j++)
				{
					
					int si = Integer.parseInt(s.substring(j,j+1));
					
					//System.out.println(j + "~ " + si + " ~ " + k + " ~ " + kq);
					if (j <= k)
					{
						k= k + si;
					}
					else
					{
						kq = kq + j - k;
						System.out.println(kq);
						k = j + si;
					}
				}
				
				System.out.println("Case #" + (i+1) + ": " + kq);
				out = out + "Case #" + (i+1) + ": " + kq + "\r\n";
				
			}
			
			FileWriter f = new FileWriter("output.txt");
			f.write(out);
			f.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
