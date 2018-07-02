package methodEmbedding.Magic_Trick.S.LYD1621;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

public class code{
	public static void main(String args[]) throws IOException{
		String input;
		int ncase=0, ret=0;
		StringTokenizer token ;
		FileReader file = new FileReader("A-small-attempt1.in");
		BufferedReader inFile = new BufferedReader(file);

                FileWriter wr = new FileWriter("output");
		BufferedWriter bw = new BufferedWriter(wr);
		PrintWriter out = new PrintWriter(bw);


		input = inFile.readLine();
		ncase = Integer.parseInt(input);

		int first[][] = new int[4][4];
                int second[][] = new int[4][4];
                int ans1 = 0,  ans2 = 0, count=0; 

		for(int i=1; i<=ncase ; i++){
                                count = 0;
             			input = inFile.readLine();
  			       ans1 = Integer.parseInt(input)-1;
                          
			for(int j=0;j<4;j++){
                                input = inFile.readLine();
                                token = new StringTokenizer(input);
                                first[j][0] = Integer.parseInt(token.nextToken());
				first[j][1] = Integer.parseInt(token.nextToken());
				first[j][2] = Integer.parseInt(token.nextToken());
                                first[j][3] = Integer.parseInt(token.nextToken());
			}
                               
                               input = inFile.readLine();
			       ans2 = Integer.parseInt(input)-1;
                       
                          for(int j=0;j<4;j++){
                                input = inFile.readLine();
                                token = new StringTokenizer(input);
                                second[j][0] = Integer.parseInt(token.nextToken());
				second[j][1] = Integer.parseInt(token.nextToken());
				second[j][2] = Integer.parseInt(token.nextToken());
                                second[j][3] = Integer.parseInt(token.nextToken());
			}
			
			for(int j=0;j<4;j++){
                             for(int k=0;k<4;k++){				
                        if(first[ans1][j]==second[ans2][k]){
                            count++; ret = first[ans1][j] ; }
			else ;
				}
                         }
             if(count==1)
		 out.println("Case #" + i + ": " + ret);
	     else if(count>1)
                 out.println("Case #" + i + ": " + "Bad magician!") ;
             else 
		out.println("Case #" + i + ": " + "Volunteer cheated!") ;
		} 
              inFile.close(); out.close();
	}

}
