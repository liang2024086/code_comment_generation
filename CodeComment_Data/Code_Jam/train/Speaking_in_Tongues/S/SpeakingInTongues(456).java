package methodEmbedding.Speaking_in_Tongues.S.LYD1117;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpeakingInTongues {
	
	
	public static void main(String[] args) throws IOException {
		
		 File file = new File(System.getProperty("user.dir") + "/src/codejam/A-small-attempt4.in");
		 Scanner in = new Scanner(file);
		
		 int  n = Integer.parseInt(in.nextLine());
		 
		 String[] alpha = {"y","h","e","s","o","c","v","x","d","u","i","g","l",
				         "b","k","r","z","t","n","w","j","p","f","m","a","q"};
		 
		 StringBuilder output = new StringBuilder("");
		 String str[] = null;
		 String build = "";
		 int valueC = 0;
			 
		 
		 for(int i=0;i<n;i++){
			 str = in.nextLine().split("");	
			 
			 for(int u=1;u<str.length;u++){
				
				 if(str[u].equals(" "))
					 build += " ";
				 else{					
				     char cc = str[u].charAt(0);
					 valueC = (int)cc - 97;
					 build += alpha[valueC];
					 build += "";
				 }
			 }
			 
			 output.append("Case #"+(i+1)+": " + build);
			 output.append('\n');
			 
			 build = "";
		 }
		
		
         File dstFile = new File(System.getProperty("user.dir") + "/src/codejam/B-small-attempt4.out"); 
		 
		 PrintWriter outFile = new PrintWriter( dstFile );		 
		 outFile.append(output.toString());
		 outFile.close();
		
	}
	

}
