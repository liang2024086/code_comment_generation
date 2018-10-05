package methodEmbedding.Speaking_in_Tongues.S.LYD152;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class SpeakingInTongues
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		String english = "abcdefghijklmnopqrstuvwxyz";
		String googlerese = "ynficwlbkuomxsevzpdrjgthaq";

		String[] engArr = english.split("");
		String[] googArr = googlerese.split("");

		//System.out.println(Arrays.asList(engArr));
		//System.out.println(Arrays.asList(googArr));

		HashMap<String,String> googEngMap = new HashMap<String, String>();

		for(int i=0; i<googArr.length; i++)
		{
			googEngMap.put(googArr[i],engArr[i]);
		}

		//System.out.println(googEngMap);

		File file = new File("src/main/resources/A-small-attempt2.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

		String line = "";

		ArrayList<String> lines = new ArrayList<String>();

		boolean first = true;
		int count = 0;

		while((line=br.readLine()) != null)
		{
			if(first)
			{
				count = Integer.parseInt(line);
				first = false;
				continue;
			}

			lines.add(line);
		}

		for(int j=0; j<lines.size(); j++)
		{
			String in = lines.get(j);
			StringBuffer out = new StringBuffer(in.length());

			for(int i=0; i<in.length(); i++)
			{
				char[] cArr = new char[1];
				cArr[0] = in.charAt(i);

				String gStr = new String(cArr);

				if(googEngMap.get(gStr) != null)
				{
					out.append(googEngMap.get(gStr));
				}
				else
				{
					out.append(gStr);
				}
			}

			//System.out.println(in);
			System.out.println("Case #" + (j+1) + ": " + out);
		}

	}

}
