package methodEmbedding.Standing_Ovation.S.LYD857;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String Args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A-small-attempt0.out")));
		int T = Integer.valueOf(br.readLine());
		for(int i=0;i<T;i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				int index = 0;
				int personas=0;
				int sal=0;
				for(char p:st.nextToken().toCharArray()){
					int vp = p-'0';
					if (personas<index){
						sal+=(index-personas);
						personas+=(index-personas);
						
					}
					personas+=vp;
					index++;
				}
				bw.write("Case #"+(i+1)+": "+sal+"\n");
		}
		bw.flush();
		bw.close();
	}
	
}
