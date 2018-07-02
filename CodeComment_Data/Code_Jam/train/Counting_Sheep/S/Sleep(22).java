package methodEmbedding.Counting_Sheep.S.LYD1194;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Sleep {

	
	public static void main(String[] args) {
		int noOfinput ;
		
		
		BufferedReader br = null;

		File file = new File("/Users/abhisheksingh/Downloads/jm/op.txt");


		try {
			String sCurrentLine;
			boolean flag = false;
			br = new BufferedReader(new FileReader("/Users/abhisheksingh/Downloads/jm/A-small-attempt0.in"));
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			noOfinput = Integer.parseInt(br.readLine()); 
			double sleepNo ;
			for(int i =0;i<noOfinput;i++){
				ArrayList<Character> lst = new ArrayList<Character>();
				sCurrentLine = br.readLine();
/*				for(int j=0;j<sCurrentLine.length();j++){
					if(sCurrentLine.charAt(j)=='0')
						continue;
					flag = true;
				}*/
				Long  currNo = Long.parseLong(sCurrentLine); 
				Long tem = currNo;
				if(currNo == 0)
					flag = true;
				if(!flag) {
					Long l =1L;
				while(lst.size()!=10){
					tem = l * currNo;
					sCurrentLine = tem+"";
					for(int k =0;k<sCurrentLine.length();k++){
						if(!lst.contains(sCurrentLine.charAt(k))){
							lst.add(sCurrentLine.charAt(k));
						Collections.sort(lst);
						}
					}
					l++;
				}
				}
				String res ;
				if(flag){
					res = "INSOMNIA";
				}
				else{
					res = tem+"";
				}
				bw.write("Case #"+(i+1)+":"+res);
				bw.newLine();
				flag = false;
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
	
	}
	

}
