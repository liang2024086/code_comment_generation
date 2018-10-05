package methodEmbedding.Speaking_in_Tongues.S.LYD426;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class Main {
	public static void main(String[] args) throws IOException{
		
		 BufferedReader input =  new BufferedReader(new FileReader("/home/al/Desktop/in"));
	      
	        String line = null;
	        StringBuffer res = new StringBuffer("");
	        
	        int n = Integer.valueOf(input.readLine());
	        
	        Map<String, String> cc = new TreeMap<String, String>();
	        
	        cc.put("a", "y");
	        cc.put("b", "h");
	        cc.put("c", "e");
	        cc.put("d", "s");
	        cc.put("e", "o");
	        cc.put("f", "c");
	        cc.put("g", "v");
	        cc.put("h", "x");
	        cc.put("i", "d");
	        cc.put("j", "u");
	        cc.put("k", "i");
	        cc.put("l", "g");
	        cc.put("m", "l");
	        cc.put("n", "b");
	        cc.put("o", "k");
	        cc.put("p", "r");
	        cc.put("q", "z");
	        cc.put("r", "t");
	        cc.put("s", "n");
	        cc.put("t", "w");
	        cc.put("u", "j");
	        cc.put("v", "p");
	        cc.put("w", "f");
	        cc.put("x", "m");
	        cc.put("y", "a");
	        cc.put("z", "q");
	        
	        

	        for(int i = 0 ;i<n; i++ )
	        {
	        	line = input.readLine();
	        	res = new StringBuffer("");
	        	for(int j = 0; j< line.length();j++)
	        	{
	        		char tmp = line.charAt(j);
	        		char[] tt = new char[1];
	        		tt[0] = tmp;
	        		String s = new String(tt);
	        		
	        		if(cc.containsKey(s))
	        		{
	        			res.append(cc.get(new String(tt)));	
	        		}else
	        		{
	        			res.append(tmp);
	        		}
	        	}
	        	System.out.println("Case #"+(i+1)+": "+ res);
	        }
	        
	      
	     
	    
	    
		
		
	}
}
