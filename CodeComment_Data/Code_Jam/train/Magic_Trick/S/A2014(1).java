package methodEmbedding.Magic_Trick.S.LYD488;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class A2014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    try{
    	    FileInputStream fstream = new FileInputStream("A-small-attempt1.in");
    	    DataInputStream in = new DataInputStream(fstream);
    	        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    	    String strLine;


    	    
    	    strLine = br.readLine();

    	    int T = Integer.valueOf(strLine);
 //   	    System.out.println(T);
    	    
    	    int N[][][] = new int[T][2][4];

    	    
    	    int i = 0;    	    
       	    while ((strLine = br.readLine()) != null)   {

    	    	int x = Integer.valueOf(strLine);
//    	    	System.out.println(x);
    	    	for (int r=1; r<=4; r++){
    	    		strLine = br.readLine();
    	    		String[] ss = strLine.split(" ");

    	    		if (r == x) {
    	    			N[i][0][0] = Integer.valueOf(ss[0]);
    	    			N[i][0][1] = Integer.valueOf(ss[1]);
    	    			N[i][0][2] = Integer.valueOf(ss[2]);
    	    			N[i][0][3] = Integer.valueOf(ss[3]);
    	  //  			System.out.println(N[i][0][1]);
    	    		}
    	    	}
    	    	
    	    	strLine = br.readLine();
    	    	x = Integer.valueOf(strLine);
    	    	for (int r=1; r<=4; r++){
    	    		strLine = br.readLine();
    	    		String[] ss = strLine.split(" ");
    	    		if (r == x) {
    	    			N[i][1][0] = Integer.valueOf(ss[0]);
    	    			N[i][1][1] = Integer.valueOf(ss[1]);
    	    			N[i][1][2] = Integer.valueOf(ss[2]);
    	    			N[i][1][3] = Integer.valueOf(ss[3]);
    	    			//System.out.println(N[i][1][1]);
    	    		}
    	    	}
    	    	
    	    int vysl=-1;
    	    int counter = 0;
    	    for (x=0; x<4; x++){
    	    	for (int y=0; y<4; y++){
    	    		if (N[i][0][x] == N[i][1][y]) {counter ++; vysl=N[i][0][x];}
    	    	}
       	    }
       	    
       	    if (counter == 1) { System.out.println("Case #"+(i+1)+": " + vysl);}
       	    if (counter > 1) { System.out.println("Case #"+(i+1)+":"+" Bad magician!");}
       	    if (counter == 0) { System.out.println("Case #"+(i+1)+":"+" Volunteer cheated!");}
       	    i++;
       	    }	    
    	    in.close();
    	    }catch (Exception e){//Catch exception if any
    	      System.err.println("Error: " + e.getMessage());
    	    }
       	    
	    }
    	    
}

