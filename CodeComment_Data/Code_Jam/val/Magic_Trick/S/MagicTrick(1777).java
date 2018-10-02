package methodEmbedding.Magic_Trick.S.LYD2162;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class MagicTrick {

	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new FileReader("inputs/A-small-attempt4.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("inputs/sol.out")));
		 String str = in.readLine();
		 int cases = Integer.valueOf(str);
		 for(int i=1; i<=cases;i++){
			 //1st iteration
			 str= in.readLine();
			 int row=Integer.valueOf(str);
			 int j;
			 for(j=0;j<row-1;j++){
				 in.readLine();
			 }
			 str=in.readLine();
			 for(j++;j<4;j++)
				 in.readLine();
			 int[] nums =  new int[4];
			 int aindex=0;
			 int sindex=0;
			 for(int k=0;k<str.length();k++){
				 if(str.charAt(k)==' '){
					 nums[aindex]=Integer.valueOf(str.substring(sindex, k));
					 aindex++;
					 sindex=k+1;
				 }
			 }
			 nums[aindex]=Integer.valueOf(str.substring(sindex));
			 System.out.println(Arrays.toString(nums));
			 //2nd iteration
			 str= in.readLine();
			 row=Integer.valueOf(str);
			 for(j=0;j<row-1;j++){
				 in.readLine();
			 }
			 str=in.readLine();
			 for(j++;j<4;j++)
				 in.readLine();
			 sindex=0;
			 int numCards=0;
			 int card=-1;
			 for(int k=0;k<str.length();k++){
				 if(str.charAt(k)==' '){
					 int num=Integer.valueOf(str.substring(sindex, k));
					 int h;
					 for(h=0;h<4;h++){
						 if(nums[h]==num){
							 numCards++;
							 card=num;
							 //break;
						 }
					 }
					 sindex=k+1;
				 }
			 }
			 int num=Integer.valueOf(str.substring(sindex));
			 int h;
			 for(h=0;h<4;h++){
				 if(nums[h]==num){
					 numCards++;
					 card=num;
					 //break;
				 }
			 }
			 if(i<cases){
				out.print("Case #"+i+": ");
			 	if(numCards==0)
				 	out.println("Volunteer cheated!");
			 	else if(numCards==1)
				 	out.println(card);
			 	else
			 		out.println("Bad magician!");
			 }
			 else{
				 out.print("Case #"+i+": ");
				 	if(numCards==0)
					 	out.print("Volunteer cheated!");
				 	else if(numCards==1)
					 	out.print(card);
				 	else
				 		out.print("Bad magician!");
			 }
			 
		 }
		 out.close();
	}

}
