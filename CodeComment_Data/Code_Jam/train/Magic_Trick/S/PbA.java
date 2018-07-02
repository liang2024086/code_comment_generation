package methodEmbedding.Magic_Trick.S.LYD1460;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;


public class PbA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileReader fr = null ;
    	Scanner sc = null;
    	int n_cases = 0;
    	int n;
    
    	try{
    		fr = new FileReader(args[0]);
    		sc = new Scanner(fr);
    		
    		if (sc.hasNextInt()) n_cases = sc.nextInt();
    		
    		for (int i=0;i<n_cases;i++){
    			
    			HashSet<Integer> s1 = new HashSet<Integer>();
    	    	HashSet<Integer> s2 = new HashSet<Integer>();
    			
    			if (sc.hasNextInt()) n = sc.nextInt();
    			else throw new RuntimeException("no 1st answer found at case "+i);
    			
    			for (int j=0;j<n;j++){
    				sc.nextLine();
    			}
    			for (int j=0;j<4;j++){
    				int k = sc.nextInt();
    				s1.add(k);
    			//	System.out.println("s1 added: "+k);
    			}

    			for (int j=n-1;j<4;j++){
    				sc.nextLine();
    			}
    			
    			if (sc.hasNextInt()) n = sc.nextInt();
    			else throw new RuntimeException("no 2nd answer found at case "+i);
    
    			for (int j=0;j<n;j++){
    				sc.nextLine();
    			}
    			for (int j=0;j<4;j++){
    				int k = sc.nextInt();
    				s2.add(k);
    				//System.out.println("s2 added: "+k);
    			}
    			for (int j=n-1;j<4;j++){
    				sc.nextLine();
    			}
    			
    			s1.retainAll(s2);
    			
    			if (s1.size() ==0){
    				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
    			}
    			else if (s1.size()==1){
    				System.out.println("Case #"+(i+1)+": "+s1.toArray()[0]);
    			}
    			else{
    				System.out.println("Case #"+(i+1)+": Bad magician!");
    			}
    			
    		}
    		
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	finally{
    		if(sc != null) sc.close();
    		if(fr != null)	try {fr.close();} catch (Exception e) {}
    	}
       	

	}

}
