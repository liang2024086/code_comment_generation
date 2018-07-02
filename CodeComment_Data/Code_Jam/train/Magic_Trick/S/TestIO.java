package methodEmbedding.Magic_Trick.S.LYD1559;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class TestIO {

	public static void main(String args[]) throws IOException
	{
		File iF = new File("D:\\A-small-attempt0.txt");
		File oF = new File("D:\\output.txt");
		
		FileReader fr = new FileReader(iF);

		oF.createNewFile();
		FileWriter fw = new FileWriter(oF);
		
		String tmp = "";
		
		char [] a = new char[1];
	      while(fr.read(a)!=-1) 
	      {
	    	  //fw.write(a);
	    	  tmp+=a[0];
	      }
		fr.close();
		
//		int cas = 0,tc = tmp.charAt(0);
//		while(++cas<=tc)
//		{
//			int q1 = tmp.charAt(1);
//			
//		}
		
		StringTokenizer st = new StringTokenizer(tmp,"\r\n");
		int tc = Integer.parseInt(st.nextToken());
		int cas = 0;
		while(st.hasMoreTokens() && ++cas<=tc)
		{
			int q1,q2;
			q1 = Integer.parseInt(st.nextToken());
			StringTokenizer st1 ;
			switch(q1)
			{
			case 1:
				st1 = new StringTokenizer(st.nextToken());
				st.nextToken();
				st.nextToken();
				st.nextToken();
				break;
			case 2:
				st.nextToken();
				st1 = new StringTokenizer(st.nextToken());
				st.nextToken();
				st.nextToken();
				break;
			case 3:
				st.nextToken();
				st.nextToken();
				st1 = new StringTokenizer(st.nextToken());
				st.nextToken();
				break;
			default:
				st.nextToken();
				st.nextToken();
				st.nextToken();
				st1 = new StringTokenizer(st.nextToken());
				break;
			
			}
			
			int q1a[] = new int[4];
			q1a[0]=Integer.parseInt(st1.nextToken());
			q1a[1]=Integer.parseInt(st1.nextToken());
			q1a[2]=Integer.parseInt(st1.nextToken());
			q1a[3]=Integer.parseInt(st1.nextToken());
			
			q2 = Integer.parseInt(st.nextToken());
			switch(q2)
			{
			case 1:
				st1 = new StringTokenizer(st.nextToken());
				st.nextToken();
				st.nextToken();
				st.nextToken();
				break;
			case 2:
				st.nextToken();
				st1 = new StringTokenizer(st.nextToken());
				st.nextToken();
				st.nextToken();
				break;
			case 3:
				st.nextToken();
				st.nextToken();
				st1 = new StringTokenizer(st.nextToken());
				st.nextToken();
				break;
			default:
				st.nextToken();
				st.nextToken();
				st.nextToken();
				st1 = new StringTokenizer(st.nextToken());
				break;
			
			}
			
			int q2a[] = new int[4];
			q2a[0]=Integer.parseInt(st1.nextToken());
			q2a[1]=Integer.parseInt(st1.nextToken());
			q2a[2]=Integer.parseInt(st1.nextToken());
			q2a[3]=Integer.parseInt(st1.nextToken());
			
			int ctr=0,ans=0;
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(q1a[i]==q2a[j])
					{
						ctr++;
						ans=q1a[i];
					}
					
				}
				if(ctr>1)
					break;
			}
			
			String op;
			switch(ctr)
			{
			case 0:
				op = "Case #"+cas+": Volunteer cheated!\r\n";
				break;
			case 1:
				op = "Case #"+cas+": "+ans+"\r\n";
				break;
			default:
				op = "Case #"+cas+": Bad magician!\r\n";
				break;
			}
			
			fw.write(op);
		}
		
		
		fw.flush();
		fw.close();
		
		//System.out.println(tmp);
		
	}
}
