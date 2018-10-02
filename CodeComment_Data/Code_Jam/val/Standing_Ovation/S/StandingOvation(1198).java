package methodEmbedding.Standing_Ovation.S.LYD2076;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new FileReader("in.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt"));
		
		int t=Integer.parseInt(br.readLine());
		
		for(int tt=0;tt<t;tt++){
			
			String[] in=br.readLine().split(" ");
			
			int n=Integer.parseInt(in[0]);
			int[] arr=new int[n+1];
			
			for(int i=0;i<n+1;i++){
				arr[i]=in[1].charAt(i)-'0';
			}
			
			int sum=arr[0];
			int ans=0;
			
			for(int i=1;i<=n;i++){
				if(arr[i]==0)
					continue;
				if(i>sum){

					ans+=i-sum;
					sum+=i-sum;
				}
				
				sum+=arr[i];
				
			}
			bw.write("Case #"+(tt+1)+": "+ans+"\n");
		}
		bw.close();
	}
}
