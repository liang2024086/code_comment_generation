package methodEmbedding.Counting_Sheep.S.LYD1107;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CountingSheep {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String inf="E:\\java\\practice\\src\\practice\\inf.txt";
		String outf="E:\\java\\practice\\src\\practice\\outf.txt";
		BufferedReader br = new BufferedReader(new FileReader(inf));
		PrintWriter pw=new PrintWriter(outf);
		int t = Integer.parseInt( br.readLine());
		int tt=1;
		while(t-- > 0) {
			boolean[] array = new boolean[10];
		
			
			int n = Integer.parseInt( br.readLine());
			if(n==0) {
				pw.println("Case #"+tt+++": INSOMNIA");
			}else {
			int i=1;
		for(int num=n;num>0;num=n*i) {	
			for(int temp=num;temp>0;temp=temp/10) {
				int x= temp%10;
				array[x]= true;
			}
				int count=0;
				for(int j=0;j<=9;j++) {
				if(array[j])count++;
				
				}
				if(count==10)
					break;
				
			i++;
			}
	pw.println("Case #"+tt+++": "+n*i);
			}
		}
		pw.close();
		br.close();
		}
		

	}



