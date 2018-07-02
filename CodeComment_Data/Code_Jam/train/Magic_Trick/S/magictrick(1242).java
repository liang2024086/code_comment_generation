package methodEmbedding.Magic_Trick.S.LYD907;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class magictrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		magictrick f = new magictrick();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("file/A-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("file/b.txt")));
			
		
			int count = Integer.parseInt(br.readLine());
			
			int c=1;
			
			while(c<=count)
			{
				
				int oldRow=0;
				oldRow= Integer.parseInt(br.readLine());
				ArrayList<Integer> oldArray = new ArrayList<Integer>();
				String oldRowStr="";
				StringTokenizer st;
				for(int i=1;i<=4;i++)
				{
					if(i==oldRow)
					{
						oldRowStr = br.readLine();
						st = new StringTokenizer(oldRowStr," ");
						
						oldArray.add(Integer.parseInt(st.nextToken()));
						oldArray.add(Integer.parseInt(st.nextToken()));
						oldArray.add(Integer.parseInt(st.nextToken()));
						oldArray.add(Integer.parseInt(st.nextToken()));
					}
					else
					br.readLine();
				}
				
				int newRow=0;
				newRow= Integer.parseInt(br.readLine());
				String newRowStr="";
				int elemCount=0;
				int elem=0;
				for(int i=1;i<=4;i++)
				{
					if(i==newRow)
					{
						newRowStr = br.readLine();
						st = new StringTokenizer(newRowStr," ");
						
						int checkElem=0;
						checkElem=Integer.parseInt(st.nextToken());
						if(oldArray.contains(checkElem))
						{
							elem=checkElem;
							elemCount++;
						}
						checkElem=Integer.parseInt(st.nextToken());
						if(oldArray.contains(checkElem))
						{
							elem=checkElem;
							elemCount++;
						}
						checkElem=Integer.parseInt(st.nextToken());
						if(oldArray.contains(checkElem))
						{
							elem=checkElem;
							elemCount++;
						}
						checkElem=Integer.parseInt(st.nextToken());
						if(oldArray.contains(checkElem))
						{
							elem=checkElem;
							elemCount++;
						}
						
					}
					else
					br.readLine();
				}
				
				if(elemCount==1)
				bw.write("Case #"+c+": "+elem);
				else if (elemCount>1)
					bw.write("Case #"+c+": "+"Bad magician!");
				else if(elemCount==0)
					bw.write("Case #"+c+": "+"Volunteer cheated!");
			    bw.newLine();
				c++;
			}
			
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
	}

}
