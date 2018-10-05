package methodEmbedding.Magic_Trick.S.LYD616;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MagicTrick {
public static void main(String args[])
{
	BufferedReader br = null;
	BufferedWriter bw =null;
	 
	try {

		String sCurrentLine;
		int noOfCases;
		br = new BufferedReader(new FileReader("/Users/ramvibhakar/Documents/workspace/CodeJam/testcase"));
		sCurrentLine=br.readLine();
		noOfCases=Integer.parseInt(sCurrentLine);
		File file = new File("/Users/ramvibhakar/Desktop/testcase.out");
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		bw = new BufferedWriter(fw);
		for(int i=1;i<=noOfCases;i++)
		{
			int firstAnswer=Integer.parseInt(br.readLine());
			for(int j=1;j<firstAnswer;j++)
			{
				br.readLine();
			}
			sCurrentLine=br.readLine();
			String cards1[]=sCurrentLine.split(" ");
			for(int k=firstAnswer+1;k<=4;k++)
			{
				br.readLine();
			}
			int secondAnswer =Integer.parseInt(br.readLine());
			for(int j=1;j<secondAnswer;j++)
			{
				br.readLine();
			}
			sCurrentLine=br.readLine();
			String cards2[]=sCurrentLine.split(" ");
			List<String> aList = new ArrayList<String>( Arrays.asList(cards1));
			List<String> bList =  new ArrayList<String>(Arrays.asList(cards2));
			for(int k=secondAnswer+1;k<=4;k++)
			{
				br.readLine();
			}
			aList.retainAll(bList);
			if(aList.size() == 1)
			{
				System.out.println("Case #"+i+": "+aList.get(0));
				bw.write("Case #"+i+": "+aList.get(0)+"\n");
			}
			else if(aList.size() > 1)
			{
				System.out.println("Case #"+i+": "+"Bad magician!");
				bw.write("Case #"+i+": "+"Bad magician!\n");
			}
			else
			{
				System.out.println("Case #"+i+": "+"Volunteer cheated!");
				bw.write("Case #"+i+": "+"Volunteer cheated!\n");
			}
			}
		
	}catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (br != null)br.close();
			if (bw != null)bw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
}
