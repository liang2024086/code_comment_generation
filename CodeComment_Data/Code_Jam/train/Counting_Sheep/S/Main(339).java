package methodEmbedding.Counting_Sheep.S.LYD568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	
	
	public static void main(String[] args) throws Exception {
//		System.setIn(new FileInputStream("in/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out/output.out")));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=n; i++){
			
			long x = Integer.parseInt(br.readLine());
			if(x==0){
				sb.append("Case #").append(i).append(": ").append("INSOMNIA\n");
				continue;
			}
			long aux = x;
			
			boolean vetor[] = new boolean[11];
			int count = 0;
			
			
			while(count<10){
				
				long aux2 = aux;
				
				while(aux2>0){
					int num = (int) (aux2%10);
					if(!vetor[num])count++;
					
					vetor[num] = true;
					aux2/=10;
				}
				
				aux += x;
				
			}
			
			sb.append("Case #").append(i).append(": ").append(aux-x).append("\n");
			
		}
		
		
		
		bw.write(sb.toString());
		bw.flush();
		
	}
	
}
