package methodEmbedding.Counting_Sheep.S.LYD338;

import java.io.*;



public class cntingSheep {
	
	public static void main(String[] args) throws IOException
	{	
		try {
			File fin = new File("/home/hadoop/javaworkspace/codejam2016/files/A-small-attempt1.in");
			File fout = new File("/home/hadoop/javaworkspace/codejam2016/files/output1.txt");
			FileReader in = new FileReader(fin);
			FileWriter out = new FileWriter(fout);
			
			BufferedReader buff = new BufferedReader(in);
			
			int n = 0;
			int count = 0;
			int num = 0;
			
			int mul = 1;
			int res = 0;
			
			String str1 = "";
			String str2 = "";
			
			String inp;
			
			while((inp = buff.readLine()) != null) {
				if(inp != ""){
				System.out.println(inp);
					if(n==0) 
					n = Integer.parseInt(inp);
					else {
					count++;
					num = Integer.parseInt(inp);
					if (num == 0){	
						out.write("Case #"+count+": INSOMNIA");
					out.write("\n");}
					else
					{
					str2 = "";
					mul = 1;
					while (str2.length() != 10){
						
					res = num * mul;
					mul++;
					str1 = Integer.toString(res);
					
					for (int i=1;i<=str1.length(); i++) {
						if(str2.indexOf(str1.substring(i-1, i)) < 0)
							str2 = str2 + str1.substring(i-1, i);
					}
					}
					out.write("Case #"+count+": "+res);
					out.write("\n");
					}
					}
					
			}
			}
			in.close();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	}
