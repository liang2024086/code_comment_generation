package methodEmbedding.Speaking_in_Tongues.S.LYD1083;


import java.io.*;

public class A {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Mostafa/Downloads/A-small-attempt0.in"));
		FileWriter fw = new FileWriter("D:/output.txt");
		PrintWriter out = new PrintWriter(System.out);
		int cases = Integer.parseInt(br.readLine());
		int[] map = new int[26];
		String[] samples=new String[3];
		String[] sol=new String[3];
		samples[0]="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		samples[1]="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		samples[2]="de kr kd eoya kw aej tysr re ujdr lkgc jv";
		sol[0]="our language is impossible to understand";
		sol[1]="there are twenty six factorial possibilities";
		sol[2]="so it is okay if you want to just give up";
		for(int i=0;i<samples.length;i++){
			for(int j=0;j<samples[i].length();j++){
				if(samples[i].charAt(j)==' ') continue;
				map[samples[i].charAt(j)-'a']=sol[i].charAt(j)-'a';
			}
		}
		map[16] = 25;
		map[25] = 16;
		for (int i = 0; i < cases; i++) {
			char[] init = br.readLine().toCharArray();
			for (int j = 0; j < init.length; j++) {
				if(init[j]==' ') continue;
				init[j] = (char) (map[init[j] - 'a'] + 'a');
			}
			fw.write("Case #" + (i + 1) + ": " + new String(init) + "\n");
			out.print("Case #" + (i + 1) + ": " + new String(init) + "\n");
		}
		fw.flush();
		out.flush();
	}
}
