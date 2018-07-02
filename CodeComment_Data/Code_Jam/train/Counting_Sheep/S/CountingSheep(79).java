package methodEmbedding.Counting_Sheep.S.LYD874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("src/output.txt")));
		StringTokenizer s=new StringTokenizer(br.readLine());
		int t=Integer.parseInt(s.nextToken());
		for(int i=0;i<t;i++)
		{
			boolean output[]=new boolean[10];
			boolean flag=false;
			Arrays.fill(output, false);
			int n=Integer.parseInt(br.readLine());
			if(n==0){
				out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else{
				int j=1;
				while(!flag){
					int temp=j*n;
					int num=j*n;
					while(temp>0){
						int rem=temp%10;
						temp/=10;
		
						output[rem]=true;
					}
					if(output[0]==true && output[1]==true && output[2]==true && output[3]==true && output[4]==true && output[5]==true && output[6]==true && output[7]==true && output[8]==true && output[9]==true){
						flag=true;
						out.println("Case #"+(i+1)+": "+num);
						break;
					}
					j++;
				}
			}
		}
		out.close();
		br.close();
	}
}
