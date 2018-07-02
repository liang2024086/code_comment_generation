package methodEmbedding.Revenge_of_the_Pancakes.S.LYD605;


import java.io.*;
import java.util.*;

public class Second1 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fin1 = new FileInputStream("D:\\JAM\\B-small-attempt0.in");
		System.setIn(fin1);
		
		PrintStream fout1 = new PrintStream(new FileOutputStream("D:\\JAM\\B-out0.out"));
	    System.setOut(fout1);
	    
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int firT = in.nextInt();
//	    int firT = 1;
//	    String n = "+++----++++--+++";
	    for (int i = 1; i <= firT; ++i) {
	    	int log = 0;
	    	int fla = 0;
	    	String n = in.next();
	    	for (int j = 0; j < 100; j++) {
	    		if(n.charAt(0) == '+'){
	    			fla =1;
	    		}
				n = n.replaceAll("\\+\\+", "\\+");
				if(j==0 && n.equals("+")){
					log = 1;
					break;
				}
				n = n.replaceAll("--", "-");
			}
	    	if(log==1){
	    		System.out.println("0");
	    	}
	    	else{
	    		int o1 = n.length();
	    		if(o1%2 == 0){
	    			if(n.charAt(0) == '-'){
	    				o1 = o1-1;
	    				System.out.println(o1);
	    			}
	    			else{
	    				System.out.println(o1);
	    			}
	    		}
	    		else{
	    			if(n.charAt(0) == '+'){
	    				o1 = o1-1;
	    				System.out.println(o1);
	    			}
	    			else{
	    				System.out.println(o1);
	    			}
	    		}
	    	}
	    	//System.out.println(n);
	    }
		
		
	}

}
