package methodEmbedding.Speaking_in_Tongues.S.LYD1207;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeJam2012Q3 {
	public static void main(String [] args){
		final String FILE_NAME="A-small-attempt0.in";
		
		//IOUsage Variables
		String lineIn="";
		int numCases=0;
		
		//Index Variables
		
		
		//Contest vars
		String result="";
		String singleChar="";
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
			lineIn = br.readLine();
			numCases = Integer.parseInt(lineIn);
			
			for(int i=0; i<numCases; i++)
			{
				lineIn = br.readLine();
				for(int j=0; j<lineIn.length(); j++)
				{
					singleChar = lineIn.substring(j, j+1);
					if(singleChar.equals(" "))
					{
						result+=" ";
					}
					else if(singleChar.equals("a"))
					{
						result+="y";
					}
					else if(singleChar.equals("b"))
					{
						result+="h";
					}
					else if(singleChar.equals("c"))
					{
						result+="e";
					}
					else if(singleChar.equals("d"))
					{
						result+="s";
					}
					else if(singleChar.equals("e"))
					{
						result+="o";
					}
					else if(singleChar.equals("f"))
					{
						result+="c";
					}
					else if(singleChar.equals("g"))
					{
						result+="v";
					}
					else if(singleChar.equals("h"))
					{
						result+="x";
					}
					else if(singleChar.equals("i"))
					{
						result+="d";
					}
					else if(singleChar.equals("j"))
					{
						result+="u";
					}
					else if(singleChar.equals("k"))
					{
						result+="i";
					}
					else if(singleChar.equals("l"))
					{
						result+="g";
					}
					else if(singleChar.equals("m"))
					{
						result+="l";
					}
					else if(singleChar.equals("n"))
					{
						result+="b";
					}
					else if(singleChar.equals("o"))
					{
						result+="k";
					}
					else if(singleChar.equals("p"))
					{
						result+="r";
					}
					else if(singleChar.equals("q"))
					{
						result+="z";
					}
					else if(singleChar.equals("r"))
					{
						result+="t";
					}
					else if(singleChar.equals("s"))
					{
						result+="n";
					}
					else if(singleChar.equals("t"))
					{
						result+="w";
					}
					else if(singleChar.equals("u"))
					{
						result+="j";
					}
					else if(singleChar.equals("v"))
					{
						result+="p";
					}
					else if(singleChar.equals("w"))
					{
						result+="f";
					}
					else if(singleChar.equals("x"))
					{
						result+="m";
					}
					else if(singleChar.equals("y"))
					{
						result+="a";
					}
					else
					{
						result+="q";
					}
				}

				System.out.println("Case #"+(i+1)+": "+result);

				
				result = "";
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		
	}
}
