package methodEmbedding.Counting_Sheep.S.LYD842;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Counting_Sheep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String inputFile = "/Users/abhishekagarwal/Development/Java/codechef/Google_Codejam_2016/src/A-small-attempt0.in";
		File file = new File(inputFile);
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));
		BufferedReader r = new BufferedReader(new InputStreamReader(buf, StandardCharsets.UTF_8));
		int t = Integer.parseInt(r.readLine()),count=1;
		PrintWriter p = new PrintWriter(new File("output1.txt"));
		while(t>0) {
			int mask[] = new int[10];
			int i = Integer.parseInt(r.readLine());
			int num = i;
			while(num>0) {
				mask[num%10] = 1;
				num/=10;
			}
			int j=2;
			int runs = 1000000;
			for(;j<runs;j++) {
				num = j*i;
				while(num>0) {
					mask[num%10] = 1;
					num/=10;
				}
				int sum=0;
				for(int k=0;k<10;k++)
					sum+=mask[k];
				if(sum==10)
					break;
			}
			if(j==runs)
				p.println("Case #"+(count)+": INSOMNIA");
			else
				p.println("Case #"+(count)+": "+j*i);
			t--;
			count++;
		}
		r.close();
		p.close();
		
	}

}
