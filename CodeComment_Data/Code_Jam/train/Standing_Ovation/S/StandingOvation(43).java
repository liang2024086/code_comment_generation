package methodEmbedding.Standing_Ovation.S.LYD209;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("C:\\akshay\\A-small-practice.in");
		    File outFile = new File("C:\\akshay\\A-small-practice.out");
		    try{
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    Scanner in = new Scanner(new File("C:\\akshay\\A-small-attempt0.in"));
		    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		    int testCases = Integer.parseInt(in.nextLine());
		    for(int t=1;t<=testCases;t++){
		       
			int max=Integer.parseInt(in.next());
		    	String ch=in.next();
		    	char[] val=(ch.toCharArray());
		    	int num=0,count=0;
		    	for(int i=0;i<=max;i++){
		    		if(num>=i){
		    			num+=(int)(val[i])-48;
		    		}
		    		else{
		    			count++;
		    			num+=1+(int)val[i]-48;
		    		}
		    	}
		        bw.write("Case #" + t +": "+count);
		        bw.newLine();
		    	//System.out.print("Case #" + t +": "+count+"\n");
		    }
		    br.close();
		    bw.close();
		    }catch(Exception e){
		    	System.out.println(e);
		    }
	}

}
