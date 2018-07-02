package methodEmbedding.Magic_Trick.S.LYD1394;

import java.io.*;
import java.util.*;

public class p1{
	
	public static void main(String []args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inp;

		int k = Integer.parseInt(in.readLine());
		for(int z = 0; z < k; z++){
			boolean arr[] = new boolean[16];
			int n = Integer.parseInt(in.readLine());
			for(int i = 0; i < 4; i++){
				String tmp = in.readLine();
				if(i != n - 1) continue;
				StringTokenizer tok = new StringTokenizer(tmp);
				for(int j = 0 ; j < 4; j++){
					int t = Integer.parseInt(tok.nextToken());
					arr[t-1] = true;
				}
			}
			n = Integer.parseInt(in.readLine());
			boolean found = false, bad = false;
			int zz = 0 ;
			for(int i = 0; i < 4; i++){
				StringTokenizer tok = new StringTokenizer(in.readLine());
				if(i == n-1){
					for(int j = 0; j < 4; j++){
						int t = Integer.parseInt(tok.nextToken());
						if(arr[t-1]){
							if(found) bad = true;
							zz = t;
							found = true;
						}
					}
				}

			}
			System.out.print("Case #"+(z+1)+": ");
			if(bad) System.out.println("Bad magician!");
			else if(!found) System.out.println("Volunteer cheated!");
			else System.out.println(zz);
		}

	}

}
