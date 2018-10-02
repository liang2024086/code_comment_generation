package methodEmbedding.Speaking_in_Tongues.S.LYD415;


import java.util.*;

public class MainClass
{
	public static void main(String[] z)throws Exception
	{
		String string ="";
		ArrayList<String> list = new InputFile().readFile();
		int caseNumber =1;
		ArrayList<String> output = new ArrayList<String>();
		for(int i=0 ;i<list.size();i++)
		{
			System.out.println(string );
			string = 	"Case #" + caseNumber + ": " + new Translate().translationOfText(list.get(i));
			output.add(string);
			caseNumber++;
		}
		new OutputFile().writeFile(output);
	}
}
