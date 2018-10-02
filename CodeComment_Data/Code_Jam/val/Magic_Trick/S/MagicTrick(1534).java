package methodEmbedding.Magic_Trick.S.LYD422;

import java.io.*;
import java.util.HashMap;


public class MagicTrick {

	public static void main(String []args)
	{
		try
		{

			HashMap newmap = new HashMap();
			int cases=0,i=1,j=0,k=0,row1=0,row2=0,present=0,temp=0,ans=0;
			Object objans=0;

			FileInputStream fstream = new FileInputStream("C:/Users/Aravind/workspace/Codejam/src/A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Aravind/workspace/Codejam/src/A-small-attempt0.out"));
			String[] str = null;
			String tempstr=null;

			cases=Integer.parseInt(br.readLine());

			while (i<=cases)  
			{

				bw.write("Case #"+(i)+": ");
				i++;
				row1=Integer.parseInt( br.readLine());

				for ( j=0;j<4;j++) {
					tempstr=br.readLine();
					if ( j==row1-1) {
						str = tempstr.split(" ");
						for ( k=0;k<4;k++) {
							temp=Integer.parseInt(str[k]);
							newmap.put(temp,temp);
						}
					}
				}


				tempstr=br.readLine();
				row2=Integer.parseInt( tempstr);
				for ( j=0;j<4;j++) {
					tempstr=br.readLine();
					if ( j==row2-1) {
						str = tempstr.split(" ");
						for ( k=0;k<4;k++) {
							objans = newmap.get(Integer.parseInt(str[k]));
							if ( objans != null ) {
								present++;
								ans=Integer.parseInt(str[k]);
							}
						}
					}
				}

				if ( present ==0 )
					bw.write("Volunteer cheated!");
				else if ( present==1)
					bw.write(String.valueOf(ans));
				else 
					bw.write("Bad magician!");
				bw.write('\n');
				present=0;
				newmap.clear();
			}
			in.close();
			bw.close();
		}
		catch(Exception e)	 
		{
			System.out.println("Caught exception"+e);
		}
	}
}
