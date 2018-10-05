package methodEmbedding.Magic_Trick.S.LYD1797;

import java.io.*;
import java.util.HashSet;

public class MagicTrick{

	public static void main(String [] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input File Name : ");
		String fileLocation = "";
		try{
			fileLocation = in.readLine();
		}
		catch (IOException e){System.out.println("Input Error!");};

		BufferedReader file;
		String text = "";
		String output = "";
		try{
			file= new BufferedReader(new FileReader(fileLocation));
			int testcase = Integer.parseInt(file.readLine()); //Number of test cases
			
			for (int i=1; i<=testcase; i++){
				int rownum = Integer.parseInt(file.readLine());
				HashSet fourints = new HashSet();
				String firstfour = "";
				
				for(int n=1; n<=4; n++){
					if (rownum == n)
						firstfour = file.readLine();
					else
						file.readLine();
				}

				String[] str = firstfour.split(" ");
				for (int n=0; n<str.length; n++){
					fourints.add(Integer.parseInt(str[n]));
				}

				int secondRowNum = Integer.parseInt(file.readLine());
				String secondfour = "";
				for(int n=1; n<=4; n++){
					if (secondRowNum == n)
						secondfour = file.readLine();
					else
						file.readLine();
				}
				boolean found = false;
				int status = 0;
				str = secondfour.split(" ");
				for (int n=0; n<str.length; n++){
					int curr = Integer.parseInt(str[n]);
					boolean same = fourints.contains(curr);
					if (!found && same){
						found = true;
						status = curr;
					}
					else if (found && same){
						status = -1;
					}
				}
				if (!found)
					status = -2;

				System.out.println(firstfour + " " + secondfour);
				switch(status){
					case -1: output += "Case #" + i + ": Bad magician!"; break;
					case -2: output += "Case #" + i + ": Volunteer cheated!"; break;
					default: output += "Case #" + i + ": " + status;
				}

				if (i != testcase)
					output += "\n";
			}
			
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
			out.print(output);
			out.close();
		}
		catch (IOException e){System.out.println("File Input Error!");};
	}
}
