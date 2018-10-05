package methodEmbedding.Revenge_of_the_Pancakes.S.LYD637;

import java.io.*;



public class pancake {
	
	public static void main(String[] args) throws IOException
	{	
		try {
			File fin = new File("/home/hadoop/javaworkspace/codejam2016/files/B-small-attempt0.in");
			File fout = new File("/home/hadoop/javaworkspace/codejam2016/files/outmain.txt");
			FileReader in = new FileReader(fin);
			FileWriter out = new FileWriter(fout);
			
			BufferedReader buff = new BufferedReader(in);
			
			String inp;
			int n = 0;
			int case_no = 0;
			int k=0;
			int count = 0;
			
			while((inp = buff.readLine()) != null) {
				System.out.println(inp);
				if(n==0) 
					n = Integer.parseInt(inp);
				else {
					case_no++;
					
					k = 0;
					count = 0;
					for(int i=1; i< inp.length(); i++) {
						System.out.println(inp.substring(i,i+1));
						if(!inp.substring(k,k+1).equals(inp.substring(i,i+1))) {
							k = i;
							count++;
						
						}
					}
					System.out.println("Now: ");
					System.out.println(inp.substring(k,k+1));
					if(inp.substring(k,k+1).contains("-"))
					{
						count++;
						System.out.println("here1");
					}
					out.write("Case #"+case_no+": "+count);
					out.write("\n");
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
