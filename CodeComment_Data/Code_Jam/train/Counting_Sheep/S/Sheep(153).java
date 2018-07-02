package methodEmbedding.Counting_Sheep.S.LYD620;

import java.io.*;
import java.util.HashSet;
import java.util.Arrays;

public class Sheep {
	public Sheep()throws IOException{
		BufferedReader rdr = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("A.out"));
        int cases = Integer.parseInt(rdr.readLine());
        
        String [] all = {"0","1","2","3","4","5","6","7","8","9"}; 
        
        for (int i = 0; i < cases; i++) {
        	int x = Integer.parseInt(rdr.readLine());
        	int n = 1;
        	int xnew = x;
        	HashSet <String> seen = new <String> HashSet();
        	String result = "INSOMNIA";
        	if(x!=0){
	        	while(!seen.containsAll(Arrays.asList(all))){
	        		xnew = x*n;
	        		String xs = ""+xnew;
	        		for(int j=0; j<xs.length(); j++){
	        			seen.add(""+xs.charAt(j));
	        		}
	        		n++;
	        	}
	        	result = ""+xnew;
        	}
        	//System.out.println(""+result);
        	pw.println("Case #"+(i+1)+": "+result);
        }
        pw.close();
        rdr.close();
	}
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		new Sheep();
	}

}
