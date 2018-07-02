package methodEmbedding.Counting_Sheep.S.LYD1451;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class countingsheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//read from file
		final String input = "A-small-attempt2.in";
		final String output = "A-small-attempt2.out";
		int n;
		String line,total;
		
		FileReader fr = new FileReader(input);
		BufferedReader bf = new BufferedReader(fr);
		
		//HashMap<String, Integer> digitMap = new HashMap<String,Integer>();
		List<String> digits = new ArrayList<String>();
		List<String> results = new ArrayList<String>();
		
		String next ="";
		String lastname = "";
		int c = 0;
		
		total = bf.readLine();
		line = bf.readLine();
		while ( line != null ){
			//System.out.print("n = "+ line + " ");
			n = Integer.parseInt(line);
			
			c++;
			int i = 1;
			boolean allcounted = false;
			digits = new ArrayList<String>();
			int repeat = 0;
			
			while ( !allcounted && repeat <=1000 ){
				next = n * i + "";
				
				for (int j=0;j < next.length();j++){
					
					String l = next.charAt(j)+"";
					if (! digits.contains(l)){
						digits.add(l);
					}else{
						repeat++;
					}
					if (digits.size() == 10 ) {
						allcounted = true;
					}
				}	
				i++;
			}
			if (!allcounted ){
				results.add("INSOMNIA");
				//bw.write("Case #"+c+": INSOMNIA");
			}else{
				results.add(next);
				//bw.write("Case #"+c+": "+ next);
			}
			
			//System.out.println("Case #"+c+": "+ next);
			line = bf.readLine();
		}
		FileWriter fw = new FileWriter(output);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int count = 0;
		for (String str : results){
			count ++ ;
			System.out.println("Case #"+count+": "+ str);
			bw.write("Case #"+count+": "+ str+"\n");
			bw.newLine();
		}
		bf.close();
		bw.close();
	}
}
