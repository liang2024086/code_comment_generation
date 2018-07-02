package methodEmbedding.Magic_Trick.S.LYD2015;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Magician {
public static void main(String[] args)  {
	
	BufferedReader br = 
	          new BufferedReader(new InputStreamReader(System.in));
	        String s;
			try {
				s = br.readLine();
			
	        int n=Integer.parseInt(s);
	        HashSet<Integer> s1;
	        HashSet<Integer> s2;
	        for (int i = 0; i < n; i++) {
	        	//System.out.println("here");
	        	s = br.readLine();
		        int a1=Integer.parseInt(s);
		        //System.out.println("a1="+a1);
		        s1=new HashSet<Integer>();
		        for (int j = 0; j < 4; j++) {
		        	s=br.readLine();
		        	
		        	if(a1-1==j){
		        		 String temp[]=s.split(" ");
		        		 for (int k = 0; k < temp.length; k++) {
							s1.add(Integer.parseInt(temp[k]));
						}
		        	}
				}
		        
		        s = br.readLine();
		        int a2=Integer.parseInt(s);
		        s2=new HashSet<Integer>();
		        for (int j = 0; j < 4; j++) {
		        	s=br.readLine();
		        	if(a2-1==j){
		        		 String temp[]=s.split(" ");
		        		 for (int k = 0; k < temp.length; k++) {
							s2.add(Integer.parseInt(temp[k]));
						}
		        	}
				}
		        
		        s1.retainAll(s2);
		        //System.out.println(s1);
		        if(s1.size()==1)
		        	System.out.println("Case #"+(i+1)+": "+(s1+"").replace("[", "").replace("]", ""));
		        else if(s1.isEmpty())
		        	System.out.println("Case #"+(i+1)+": Volunteer cheated!");
		        else
		        	System.out.println("Case #"+(i+1)+": Bad magician!");
		        
			}

} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}
}
