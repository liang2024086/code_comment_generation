package methodEmbedding.Magic_Trick.S.LYD229;

import java.io.*;
import java.util.*;


public class GoogleCodeJam {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer i,j,n,t,ans1,ans2,temp,common,ans,iter=1;
		Integer[][] a = new Integer[5][5];
		Integer[][] b = new Integer[5][5];
		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Output.txt").getAbsoluteFile()));
		String line;
		try {
		t = Integer.parseInt(br.readLine());
		while(t-- != 0) {
			common = 0;
			ans = -1;
			ans1 = Integer.parseInt(br.readLine());
			temp = 0;
			while(temp != 4) {
				line = br.readLine();
				String[] ip = line.split(" ");
				for(i=0;i<ip.length;i++)
					a[temp][i]=Integer.parseInt(ip[i]);
				temp++;
			}
			ans2 = Integer.parseInt(br.readLine());
			temp = 0;
			while(temp != 4) {
				line = br.readLine();
				String[] ip = line.split(" ");
				for(i=0;i<ip.length;i++)
					b[temp][i]=Integer.parseInt(ip[i]);
				temp++;
			}
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					if(a[ans1-1][i] == b[ans2-1][j]) {
						common++;
						ans = a[ans1-1][i];
					}
				}
			}
			bw.write("Case #");
			bw.write(iter.toString());
			bw.write(": ");
			iter++;
			if(common == 1) {
				bw.write(ans.toString());
				bw.newLine();
			} else if(common == 0) {
				bw.write("Volunteer cheated!");
				bw.newLine();
			} else {
				bw.write("Bad magician!");
				bw.newLine();
			}
		}
		} finally {
			bw.close();
		}
	}

}
