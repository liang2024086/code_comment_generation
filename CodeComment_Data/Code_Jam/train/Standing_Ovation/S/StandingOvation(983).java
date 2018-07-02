package methodEmbedding.Standing_Ovation.S.LYD282;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		Scanner sc = new Scanner(new File("A-small-attempt4.in"));
		PrintWriter writer = new PrintWriter("A-small-output.out");
		int T= sc.nextInt();
		int [] smax= new int[T+1];
		String[] line= new String[T+1];
		for(int i=1; i<=2*T; i++){			
			if(i%2!=0){
		    smax[(i+1)/2] = sc.nextInt();
			}
			else{
			
				line[i/2]=sc.next();
			}
		}	
		for(int k=1; k<=T; k++){
		char [] chardigit= new char[line[k].length()];
		int [] chartonum = new int[line[k].length()];
		int num=0;
		int result=0;
    	for (int i=0; i<line[k].length(); i++){
    		chardigit[i]=line[k].charAt(i); 
    		chartonum[i]=(int)chardigit[i];
    		chartonum[i]=(chartonum[i]-48);
    		}
    	for (int i=0; i<(line[k].length()-1); i++){
    		num=num+chartonum[i];
    		result=result+chartonum[i];
		if(result<i+1){
	      result=result+(i+1-result);
		  }	
    	}
    	result=result-num;
    	writer.println("Case #"+k+": "+result);
    	
		}
		writer.close();
	}

}
