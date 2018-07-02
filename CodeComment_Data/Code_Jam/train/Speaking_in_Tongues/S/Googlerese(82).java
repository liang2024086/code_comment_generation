package methodEmbedding.Speaking_in_Tongues.S.LYD1260;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner ;


public class Googlerese {
	
	public static void main (String[] args ) throws Exception {
		
		// To Store the case number 
		 int NbLigne = 1;
		
	      // Open the stream on both out and in file		
		 Scanner in = new Scanner( new File("A-small-attempt7.in"));	
		 PrintWriter out = new PrintWriter( new File("Output.out"));
		 // Apply for each line in calculator.in
		 
		 @SuppressWarnings("unused")
			String bidon = in.nextLine(); // to jump the number of lines 
		 
		 while (in.hasNextLine()){
			 String l = in.nextLine();   // Extract First line from Input.in
			 Scanner x = new Scanner(l); // Extract Tokens from the line
			 String result = "" ;       // To stock the result of the line
		 // Calculating the result of the first line in Input.in
			 String token ="";
			  while ( x.hasNext()){
				  token = x.next(); // Get the first word in first line
			 // Now get the Algorithm to get the target word 
			       char tk=' ';
				  for( int i=0; i< token.length(); i++){
					  if(token.charAt(i)=='a') tk='y';
					  if(token.charAt(i)=='b') tk='h';
					  if(token.charAt(i)=='c') tk='e';
					  if(token.charAt(i)=='d') tk='s';
					  if(token.charAt(i)=='e') tk='o';
					  if(token.charAt(i)=='f') tk='c';
					  if(token.charAt(i)=='g') tk='v';  
					  if(token.charAt(i)=='h') tk='x';
					  if(token.charAt(i)=='i') tk='d';
					  if(token.charAt(i)=='j') tk='u';
					  if(token.charAt(i)=='k') tk='i';
					  if(token.charAt(i)=='l') tk='g';
					  if(token.charAt(i)=='m') tk='l';
					  if(token.charAt(i)=='n') tk='b';
					  if(token.charAt(i)=='o') tk='k';
					  if(token.charAt(i)=='p') tk='r';
					  if(token.charAt(i)=='q') tk='z';
					  if(token.charAt(i)=='r') tk='t';
					  if(token.charAt(i)=='s') tk='n';
					  if(token.charAt(i)=='t') tk='w';
					  if(token.charAt(i)=='u') tk='j';
					  if(token.charAt(i)=='v') tk='p';
					  if(token.charAt(i)=='w') tk='f';
					  if(token.charAt(i)=='x') tk='m';
					  if(token.charAt(i)=='y') tk='a';
					  if(token.charAt(i)=='z') tk='q';
					  result+=tk;
				  }		  			
				  result+=" ";
			  }
			  String str ="";
			  for( int i=0; i< result.length()-1; i++){
				 str += result.charAt(i);
			  }
			 out.println("Case #"+NbLigne+": "+str);
			 NbLigne++;
			 
		 }
		
		 out.close();
		 
		}	
	

}
