package methodEmbedding.Counting_Sheep.S.LYD643;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;


public class Fall_asleep {
	public static void main(String args[]) throws IOException{
		String filename = "C:/Users/Administrator/Desktop/A-small-attempt2.in";
		FileReader fr = new FileReader(filename);
		BufferedReader br =  new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("C:/Users/Administrator/Desktop/out_a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line;
		int inputs[] = new int[101];
		int N = 0;
		while ( (line = br.readLine()) != null){
			inputs[N] = Integer.valueOf(line);
			System.out.println(inputs[N]);
			N++;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0;i<=9;i++)
			set.add(i);
		
		for (int i=1;i<N;i++){
			if (inputs[i] == 0){
				bw.write("Case #"+i+": INSOMNIA\n");
			}
			else{
				HashSet<Integer> temp_set = new HashSet<Integer>(set);
				int number = inputs[i];
				while (temp_set.size() > 0){
					int temp = number;
					while (temp > 0){
						int digtal = temp%10;
						if (temp_set.contains(digtal))
							temp_set.remove(digtal);
						temp = temp/10;
					}
					if (temp_set.size() == 0)
						break;
					number = number+inputs[i];
				}
				bw.write("Case #"+i+": "+number+"\n");
			}
		}
		bw.flush();
	}
}
