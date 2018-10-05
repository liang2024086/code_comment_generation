package methodEmbedding.Magic_Trick.S.LYD1655;

import java.io.*;
import java.util.*;

public class MagicTrick{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("magictrick.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("magictrick.out")));
		int inputnumber = Integer.parseInt(f.readLine());
		for(int i=1; i<=	inputnumber; i++){
			int startposition = Integer.parseInt(f.readLine());
			int[] start = new int[16];
			int count =0;
			for(int j=0; j<4; j++){
				StringTokenizer st = new StringTokenizer(f.readLine());
				for(int k=0; k<4; k++){
					start[count] = Integer.parseInt(st.nextToken());
					count++;
				}
			}
			/*for(int n=0; n<16; n++){
				System.out.println(start[n]);
			}*/
			int endposition = Integer.parseInt(f.readLine());
			int[] end = new int[16];
			int count2 =0;
			for(int j=0; j<4; j++){
				StringTokenizer st = new StringTokenizer(f.readLine());
				for(int k=0; k<4; k++){
					end[count2] = Integer.parseInt(st.nextToken());
					count2++;
				}
			}
			/*for(int n=0; n<16; n++){
				System.out.println(end[n]);
			}*/
			//System.out.println(startposition + " " + endposition);
			int[] initial = new int[4]; // row in start that number is in
			int a =0;
			if(startposition==1){
				a=0;
			}
			if(startposition==2){
				a=4;
			}
			if(startposition==3){
				a=8;
			}
			if(startposition==4){
				a=12;
			}
			for(int j=0;j<4; j++){
				initial[j] = start[a];
				a++;
			}
			/*for(int j=0; j<4; j++){
				System.out.println(initial[j]);
			}*/
			int[] ending = new int[4]; //row in end that the number is in
			if(endposition==1){
				a=0;
			}
			if(endposition==2){
				a=4;
			}
			if(endposition==3){
				a=8;
			}
			if(endposition==4){
				a=12;
			}
			for(int j=0;j<4; j++){
				ending[j] = end[a];
				a++;
			}
			/*for(int j=0; j<4; j++){
				System.out.println(ending[j]);
			}*/
			int ans =0;
			int zzz = 0;
			for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					if(initial[j]==ending[k]){
						zzz = initial[j];
						ans++;
					}
				}
			}
			//System.out.println(ans);
			if(ans==0){
				out.println("Case #" + i + ": " + "Volunteer cheated!");
			}
			else if(ans==1){
				out.println("Case #" + i + ": " + zzz);
			}
			else{
				out.println("Case #" + i + ": " + "Bad magician!");
			}
		}
		out.close();
		System.exit(0);
	}
}
