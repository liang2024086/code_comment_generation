package methodEmbedding.Revenge_of_the_Pancakes.S.LYD139;

import java.io.*;

public class Main {
	   public static void main(String args[]) throws IOException
	   {
		   String nameFile = "B-small-attempt0.in";
		   PrintWriter pw = new PrintWriter(new File("outputFile.txt"));
		   try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
			    String line;
			    char S[] = null;
			    char temp[];
			    int T = 0, count, happy;
			    boolean allHappy = false;
			    br.readLine();
			    while ((line = br.readLine()) != null) {
			    	allHappy = false;
			    	T++;
			    	count = 0;
			    	happy = 0;
			    	S = String.valueOf(line).toCharArray();
			    	temp = S.clone();
			    	while(!allHappy){
				    		for(int i=0; i<=S.length-1; i++){
				    				if(i+1 <= S.length-1 && S[i+1] != S[i]){
				    					count++;
					    				for (int j=i;j>=0;j--){
					    					if (S[i-j] == '-'){
					    						temp[j] = '+';
					    					}else{
					    						temp[j] = '-';
					    					}
					    				}
				    				}else if (i+1 > S.length-1){ 
					    				if (S[0] == '-'){
					    					count++;
						    				for (int j=i;j>=0;j--){
						    					if (S[i-j] == '-'){
						    						temp[j] = '+';
						    					}else{
						    						temp[j] = '-';
						    					}
						    				}
							    			allHappy = true;
							    		}else{
							    			allHappy = true;
							    		}
				    				}
				    				S=temp.clone();
					    	}
			    	}
			    	pw.print("Case #" + T + ": " + count + "\n");
			    }
			}
		   catch(IOException e){
			      System.out.print("Exception");
			   }
		   pw.close();
	   }
	   
	}
