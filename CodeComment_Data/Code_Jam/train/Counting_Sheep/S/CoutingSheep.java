package methodEmbedding.Counting_Sheep.S.LYD956;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CoutingSheep {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
		int size = Integer.parseInt(br.readLine());
		String line = "";
		int index = 0;
		while((line = br.readLine())!= null ){
			index++;
			int[] digits = new int[10];
			long num = Long.parseLong(line);
			long ori = num;
			if(num == 0){
				//INSOMNIA
				System.out.println("INSOMNIA");
				bw.write("Case #"+index+": INSOMNIA");
				bw.newLine();
				continue;
			}
			int count = 0;
			while(count!=10){
				long temp = num;
				while(temp!=0){
					int digit = (int)(temp % 10);
					temp /=10;
					if(digits[digit] == 0){
						digits[digit] = 1;
						count++;
						if(count==10)
							break;
					}
				}
				num+=ori;
			}
			bw.write("Case #"+index+": "+(num-ori));
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
