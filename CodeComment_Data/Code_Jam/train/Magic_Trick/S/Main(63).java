package methodEmbedding.Magic_Trick.S.LYD1091;

import java.io.*;

public class Main {

	public static void main(String arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int i=0;i<T;i++) {
			int a1 = Integer.parseInt(in.readLine())-1;
			int[] q1 = new int[17];
			for(int j=0;j<4;j++) {
				String input = in.readLine();
				if(j==a1) {
					String temp[] = input.split("\\s");
					for(int k=0;k<temp.length;k++) {
						q1[Integer.parseInt(temp[k])] = 1;
					}
				}
			}
			int a2 = Integer.parseInt(in.readLine())-1;
			for(int j=0;j<4;j++) {
				String input = in.readLine();
				if(j==a2) {
					String temp[] = input.split("\\s");
					int result = 0;
					for(int k=0;k<temp.length;k++) {
						if(q1[Integer.parseInt(temp[k])] == 1) {
							if(result==0) {
								result = Integer.parseInt(temp[k]);
							}
							else {
								System.out.println("Case #"+(i+1)+": Bad magician!");
								result = -1;
								break;
							}
						}
					}
					if(result==0) {
						System.out.println("Case #"+(i+1)+": Volunteer cheated!");
					}
					else if(result>0){
						System.out.println("Case #"+(i+1)+": "+result);
					}
				}
			}	
		}
	}
}
