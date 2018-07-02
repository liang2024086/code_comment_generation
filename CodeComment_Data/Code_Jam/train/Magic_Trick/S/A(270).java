package methodEmbedding.Magic_Trick.S.LYD905;

import java.util.*;
import java.io.*;
//google code jam round 1 A
public class A{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int z = Integer.parseInt(in.readLine());
		for(int i=1; i<=z;i++){	
			//System.out.println(i);
			int n1 = Integer.parseInt(in.readLine());
			int[] nums1 = new int[4];
			int[] nums2 = new int[4];
			for(int o=1; o<=4; o++){
				if(o!=n1) in.readLine();
				else{
					String [] g = in.readLine().split(" ");
					for(int u=0; u<4; u++){
						nums1[u] = Integer.parseInt(g[u]);
					}
				}
			}
			int n2 = Integer.parseInt(in.readLine());
			for(int o=1; o<=4; o++){
				if(o!=n2) in.readLine();
				else{
					String [] g = in.readLine().split(" ");
					for(int u=0; u<4; u++){
						nums2[u] = Integer.parseInt(g[u]);
					}
				}
			}
			int ans=0;
			int num =-1;
			for(int o=0; o<4; o++){
				for(int u=0; u<4; u++){
					if(nums1[o]==nums2[u]){
						ans++;
						if(ans==1) num = nums1[o];
					}
				}
			}
			sb.append("Case #"+i+": ");
			if(ans==1) sb.append(num+"\n");
			else if(ans==0) sb.append("Volunteer cheated!\n");
			else if(ans>1) sb.append("Bad magician!\n");
		}
		System.out.print(sb);
	}
}
