package methodEmbedding.Speaking_in_Tongues.S.LYD391;


import java.io.BufferedReader;
import java.io.Writer;
import java.util.StringTokenizer;


public class SpeakingInTongues 
{
	public static final char[] NORMAL_TEXT = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static final char[] GOOGLERESE_TEXT = {'y','h','f','i','c','w','l','b','k','u','o','m','x','s','e','v','0','p','d','r','j','g','t','0','j','q'	};
	
	public static final String NORMAL_TEXT_STR = "abcdefghijklmnopqrstuvwxyz ";
	public static final String GOOGLERESE_TEXT_STR = "ynficwlbkuomxsevzpdrjgthaq ";
	public static void main(String[] args) 
	{
		ReadWriteInputFile readObj = new ReadWriteInputFile();
		BufferedReader br = null;
		Writer outWriter = null;
		int caseNo = 0,i=0;
		
		String strLine="";
		StringBuffer strGooglereseStr = null;
		br = readObj.readInputFile("A-small-attempt0.in");
		outWriter = readObj.writeOutputFile("output.txt");
		if(br!=null || outWriter!=null)
		{
			try
			{
				caseNo = Integer.parseInt(br.readLine());
				while ((strLine = br.readLine()) != null)
				{
					//System.out.println(strLine);
					strGooglereseStr = new StringBuffer();
					for (int j = 0; j < strLine.length(); j++) 
					{
						char lChar = strLine.charAt(j);
						int indexNo = GOOGLERESE_TEXT_STR.indexOf(Character.toString(lChar));
						char[] tmp = {};
							
						tmp = NORMAL_TEXT_STR.toCharArray();
						strGooglereseStr.append(tmp[indexNo]);
					}
					outWriter.write("Case #"+(++i)+": "+strGooglereseStr.toString()+"\n");
				}
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			readObj.closeObjects(outWriter);
		}
	}
}
