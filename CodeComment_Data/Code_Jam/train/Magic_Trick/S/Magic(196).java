package methodEmbedding.Magic_Trick.S.LYD1877;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter fout=new FileWriter("A-small-attempt0.out");
		int t=Integer.parseInt(br.readLine());
		int j=1;
		while(t>0)
		{
			int r1=Integer.parseInt(br.readLine());
			String ar[]=new String[4];
			String ar1[]=new String[4];
			for(int i=0;i<4;i++)
			{
				if(r1==(i+1))
					ar=br.readLine().split(" ");
				else
					br.readLine();
			}
			
			int r2=Integer.parseInt(br.readLine());
			for(int i=0;i<4;i++)
			{
				if(r2==(i+1))
					ar1=br.readLine().split(" ");
				else
					br.readLine();
			}
			ArrayList <String>list1=new ArrayList<String>();
			ArrayList <String>list2=new ArrayList<String>();
			Collections.addAll(list1, ar);
			Collections.addAll(list2, ar1);
			list1.retainAll(list2);
			if(list1.size()==1)
			{
		//	System.out.println("Case #"+j+": "+list1.get(0));
			fout.write("Case #"+j+": "+list1.get(0)+"\n");
			}
			else if(list1.size()>1)
			{//	System.out.println("Case #"+j+": "+"Bad magician!");
				fout.write("Case #"+j+": "+"Bad magician!"+"\n");
			
			}
			else if(list1.size()==0)
			{//	System.out.println("Case #"+j+": "+"Volunteer cheated!");
				fout.write("Case #"+j+": "+"Volunteer cheated!"+"\n");
			}
			j++;
			t--;
		}
		fout.flush();
		fout.close();

	}

}
