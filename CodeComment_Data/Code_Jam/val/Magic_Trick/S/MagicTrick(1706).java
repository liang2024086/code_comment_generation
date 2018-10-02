package methodEmbedding.Magic_Trick.S.LYD256;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		int[] array = new int[4];
		int[] sarray = new int[4];
		int t,f,s,count=0;
		BufferedReader bi = new BufferedReader(new FileReader("/Users/vigneshiyer/Desktop/a.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/vigneshiyer/Desktop/op.txt"));
		String line;
		String[]temp;
		line = bi.readLine();
		t = Integer.parseInt(line);
		String[] result = new String[t];
		for (int i = 0; i < t; i++) {
			line = bi.readLine();
			f = Integer.parseInt(line);
			for (int j = 0; j < 4; j++) {
				line = bi.readLine();
				if(j==(f-1))
				{
					temp = line.split(" ");
					for (int k = 0; k < temp.length; k++) {
						array[k] = Integer.parseInt(temp[k]);
					}
				}				
			}
			
			line = bi.readLine();
			s = Integer.parseInt(line);
			for (int j = 0; j < 4; j++) {
				line = bi.readLine();
				if(j==(s-1))
				{
					temp = line.split(" ");
					for (int k = 0; k < temp.length; k++) {
						sarray[k] = Integer.parseInt(temp[k]);
					}
				}				
			}
			
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < sarray.length; k++) {
					if(array[j] == sarray[k])
					{
						result[i] = Integer.toString(array[j]);
						count++;
					}
				}
			}
			
			if(count == 0)
				result[i] = "Volunteer cheated!";
			else if(count>1)
				result[i] = "Bad magician!";
			
			count=0;
			
			
		}
		for (int i = 0; i < result.length; i++) {
			bw.write("Case #"+(i+1)+": "+result[i]);
			bw.newLine();
			bw.flush();
			//System.out.println("Case #"+(i+1)+": "+result[i]);
		}
	}

}
