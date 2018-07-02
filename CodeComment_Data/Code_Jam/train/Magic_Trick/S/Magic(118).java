package methodEmbedding.Magic_Trick.S.LYD1236;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			int[] num=new int[16];
			Arrays.fill(num, 0);
			int r1,r2;
			r1=in.nextInt();
			for(int j=0;j<16;j++){
				int t;
				t=in.nextInt();
				if(j/4==r1-1){
					num[t-1]++;
				}
			}
			r2=in.nextInt();
			for(int j=0;j<16;j++){
				int t;
				t=in.nextInt();
				if(j/4==r2-1){
					num[t-1]++;
				}
			}
			int pos=100;
			for(int j=0;j<16;j++){
				if(num[j]==2){
					if(pos==100){
						pos=j;
					}
					else{
						pos=-1;
						break;
					}
				}
			}
			out.print("Case #"+(i+1)+": ");
			if(pos==-1){
				out.println("Bad magician!");
			}else if(pos==100){
				out.println("Volunteer cheated!");
			}else{
				out.println(pos+1);
			}
		}
		in.close();
		out.close();
	}

}
