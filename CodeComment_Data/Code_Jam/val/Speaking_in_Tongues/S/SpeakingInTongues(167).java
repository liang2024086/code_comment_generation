package methodEmbedding.Speaking_in_Tongues.S.LYD689;


import java.io.IOException;
import java.util.ArrayList;

import codejam.filestuff.FileStuff;

public class SpeakingInTongues {
	
	public static void main(String[] args) throws IOException {
		FileStuff fs = new FileStuff("A-small-attempt0.in","A-small.out","speaking_in_tongues");
		ArrayList<String> input = new ArrayList<String>();
		input = fs.ReadFromFile();
		
		ArrayList<String> output = new ArrayList<String>();
		
		int xCase = Integer.valueOf(input.get(0));
		int xPointer = 1;
		
		for (int i=1;i<=xCase;i++)
		{
			String strOut = "Case #" + String.valueOf(i) + ":";
			String strRep = "ynficwlbkuomxsevzpdrjgthaq";
			String strLine = input.get(xPointer);
			xPointer++;
			String strRes = "";
			for (int a=0;a<strLine.length();a++)
			{
				char chRep = strLine.charAt(a);
				if (chRep == ' ')
				{
					strRes += " ";
				} else
				{
					int xFound = 0;
					for (int b=0;b<strRep.length();b++)
					{
						if (strRep.charAt(b) == chRep)
						{
							xFound = b;
							break;
						}
					}
					xFound += 97;
					strRes += (char)xFound;
				}
			}
			strOut += " " + strRes;
			output.add(strOut);
		}
		fs.WriteToFile(output);
		System.out.print("Done!!!");
	}

}
