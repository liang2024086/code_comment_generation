package methodEmbedding.Magic_Trick.S.LYD2114;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class magicTrick {

	 public static void main(String[] args) throws IOException {
		 FileWriter f = new FileWriter(new File("MagicTrick.out"));
		 Scanner s = new Scanner(new FileInputStream("MagicTrick.in"));
		 int counts = s.nextInt();
		 int line_num;
		 int temp;
		 int val;
		 int count;
		 boolean check=false;
		 boolean bad=false;
		 System.out.println(counts);
		 int[] first = new int[4],second = new int[4];
		 for(int t=0;t<counts;t++){
			 System.out.print("Case #"+(t+1)+": ");
             f.write("Case #"+(t+1)+": ");
			 val=-1;
			 bad=false;
			 check=false;
			 first = new int[4];
			 second = new int[4];
			 
			 //////first
			 line_num = s.nextInt();
			// System.out.println(line_num+"<====");
			 for(int i=1;i<5;i++){
				 
                 for(int j=0;j<4;j++){
                	 //System.out.println("TEST");
                	 if(i==line_num) first[j] = s.nextInt();
                	 else temp=s.nextInt();
                 }
			 }
			 
			 //////second
			 line_num = s.nextInt();
					 for(int i=1;i<5;i++){
		                 for(int j=0;j<4;j++){
		                	 if(i==line_num) second[j] = s.nextInt();
		                	 else temp=s.nextInt();
		                 }
					 }
			////check
					 for(int i=0;i<4;i++){
						 for(int j=0;j<4;j++){
							 //WSystem.out.println(first[i]+"===="+second[j]);
							 if(first[i]==second[j]&&check==false) {val=first[i]; check=true;}
							 else if(first[i]==second[j]&&check==true) bad=true;
						 }
						 
					 }
			////result
				if(bad) {f.write("Bad magician!"); System.out.println("Bad magician!");}
				else if(val!=-1) {f.write(""+val+""); System.out.println(val);}
				else {f.write("Volunteer cheated!"); System.out.println("Volunteer cheated!");}
				f.write("\n");
		 }
		 f.close();
	 }
}
