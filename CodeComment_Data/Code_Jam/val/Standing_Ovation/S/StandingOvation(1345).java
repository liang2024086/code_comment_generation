package methodEmbedding.Standing_Ovation.S.LYD1917;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s = new BufferedReader(new FileReader("public.in"));
		int x = Integer.parseInt(s.readLine());
		int counter=0;
		String in="";
		int max=0;
		int need=0;
		int next=0;
		for(int i = 0; i< x; i++) {
			need=0;
			next=0;
			max=0;
			counter=0;
			in=s.readLine();
			max=Integer.parseInt(in.substring(0,in.indexOf(" ")));
			in=in.substring(in.indexOf(" ")+1);
			need+=Integer.parseInt(in.substring(0,1));
			in=in.substring(1);
			for(int j = 1; j< max+1; j++) {
				next=Integer.parseInt(in.substring(0,1));
				if(need<j) {
					counter+=j-need;
					need=j;	
				}
				if(in!="")
					in=in.substring(1);
				need+=next;
			}
			System.out.println("Case #"+(i+1)+": "+counter);
		}
		s.close();
		
	}
}
