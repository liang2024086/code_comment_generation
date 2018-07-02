package methodEmbedding.Speaking_in_Tongues.S.LYD1062;

import java.io.*;

class p1
{
	public static void main(String s[])
	{
		try{
			File f = new File("A-small-attempt0.in");
			File o = new File("Output.out");
			String strLine=null;

			BufferedReader br = new BufferedReader(new FileReader(f));
			PrintWriter out = new PrintWriter(new FileWriter(o));
			 
			strLine = br.readLine();
			int totalcases=Integer.parseInt(strLine);
			
			for(int k=0; k<totalcases; k++)	
			{
				String currentline="";
				strLine = br.readLine();
				String word[]=strLine.split(" ");

				for(int i=0; i<word.length; i++)
				{
					for(int j=0; j<word[i].length(); j++)
					{
						if(word[i].charAt(j) == 'y')//
							currentline=currentline+"a";

						else if(word[i].charAt(j) == 'n')//
							currentline=currentline+"b";							

						else if(word[i].charAt(j) == 'f')//
							currentline=currentline+"c";							

						else if(word[i].charAt(j) == 'i')//
							currentline=currentline+"d";							

						else if(word[i].charAt(j) == 'c')//
							currentline=currentline+"e";							

						else if(word[i].charAt(j) == 'w')//
							currentline=currentline+"f";							

						else if(word[i].charAt(j) == 'l')//
							currentline=currentline+"g";							

						else if(word[i].charAt(j) == 'b')//
							currentline=currentline+"h";							

						else if(word[i].charAt(j) == 'k')//
							currentline=currentline+"i";							

						else if(word[i].charAt(j) == 'u')//
							currentline=currentline+"j";							

						else if(word[i].charAt(j) == 'o')//
							currentline=currentline+"k";							

						else if(word[i].charAt(j) == 'm')//
							currentline=currentline+"l";							

						else if(word[i].charAt(j) == 'x')//
							currentline=currentline+"m";							

						else if(word[i].charAt(j) == 's')//
							currentline=currentline+"n";							

						else if(word[i].charAt(j) == 'e')//
							currentline=currentline+"o";							

						else if(word[i].charAt(j) == 'v')//
							currentline=currentline+"p";							
						
						else if(word[i].charAt(j) == 'p')//
							currentline=currentline+"r";							

						else if(word[i].charAt(j) == 'd')//
							currentline=currentline+"s";							

						else if(word[i].charAt(j) == 'r')//
							currentline=currentline+"t";							

						else if(word[i].charAt(j) == 'j')//
							currentline=currentline+"u";							

						else if(word[i].charAt(j) == 'g')//
							currentline=currentline+"v";							

						else if(word[i].charAt(j) == 't')//
							currentline=currentline+"w";							

						else if(word[i].charAt(j) == 'h')//
							currentline=currentline+"x";							

						else if(word[i].charAt(j) == 'a')//
							currentline=currentline+"y";							

						else if(word[i].charAt(j) == 'q')//
							currentline=currentline+"z";					

						else if(word[i].charAt(j) == 'z')//
							currentline=currentline+"q";

						else
							currentline=currentline+"#";							
					}
					currentline=currentline+" ";
				}
//				System.out.println("Start:"+startingnum+" End:"+endingnum);
//				if(first==1)
//				{
					out.println("Case #"+(k+1)+": "+currentline);
//					first=0;
//				}
//				else if(first==0)
//					out.println("\n"+"Case #:"+i+": "+pairs);
			}
			br.close();
			out.close();
		}catch (Exception e)
		{//Catch exception if any
		System.err.println("Error: " + e.getMessage());
		}
	}
}

//q
//z
