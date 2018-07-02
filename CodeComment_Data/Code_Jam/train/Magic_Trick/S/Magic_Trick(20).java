package methodEmbedding.Magic_Trick.S.LYD565;

import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class Magic_Trick{
	public static void main(String[] args){
		int cases = 0;
		String file = "C:\\Users\\Kyle\\Downloads\\A-small-attempt0.in";
		String line;
		PrintWriter writer = null;

		try{
			writer = new PrintWriter("C:\\Users\\Kyle\\Documents\\output");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

		try(BufferedReader br = new BufferedReader(new FileReader(file))){

			line = br.readLine();
			cases = Integer.parseInt(line);

			int val = 0;

			for(int i = 0; i < cases; i++){
				Set<String> first = new HashSet<String>();
				Set<String> second = new HashSet<String>();
				val = Integer.parseInt(line = br.readLine());
				String row = "";

				for(int j = 0; j < 4; j++){
					if(j == val-1){
						row = br.readLine();
					}
					else{
						br.readLine();
					}
				}

				String[] nums = new String[4];
				nums = row.split(" ");
				for(String n : nums){
					first.add(n);
				}

				val = Integer.parseInt(line = br.readLine());

				for(int j = 0; j < 4; j++){
					if(j == val-1){
						row = br.readLine();
					}
					else{
						br.readLine();
					}
				}

				nums = new String[4];
				nums = row.split(" ");

				for(String n : nums){
					second.add(n);
				}

				Set<String> ret = new HashSet<String>();

				for(String x : first){
					if(second.contains(x)){
						ret.add(x);
					}
				}

					writer.print("Case #" + (i+1) + ": ");
					if(ret.size() == 1){
						for(String x : ret){
							writer.print((x + "\n"));
						}
					}
					else if(ret.size() > 0){
						writer.print(("Bad magician!\n"));
					}
					else{
						writer.print(("Volunteer cheated!\n"));
					}
			}
			writer.close();
			br.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
