package methodEmbedding.Magic_Trick.S.LYD20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class A_Magic_Trick {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("src/A-small-attempt0.in"));
	    BufferedWriter bw = new BufferedWriter(new FileWriter("src/A-small-attempt0.out"));
	    
	    
	    int cases = Integer.valueOf(br.readLine());
	    
	    
	    String line =br.readLine();
	    int casenumber = 1;
	    while (line != null) {
	    	String[] firstList = null;
	    	String[] secondList = null;
		    int firstpick = Integer.valueOf(line);
		    for(int i =0; i<4 ; i++){
		    	line =br.readLine();
		    	if(i == firstpick-1){
		    		firstList = line.split(" ");
		    	}
		    }
		    line =br.readLine();
		    int secondpick = Integer.valueOf(line);
		    for(int i =0; i<4 ; i++){
		    	line =br.readLine();
		    	if(i == secondpick-1){
		    		secondList = line.split(" ");
		    	}
		    }
		    int result =0;
		    breakme:
		    for(int j= 0; j< firstList.length; j++){
			    for(int k= 0; k< secondList.length; k++){
			    	if(firstList[j].equals(secondList[k])){
			    		if(result == 0){
			    			result = Integer.valueOf(firstList[j]);
			    		}else{
			    			bw.write("Case #"+casenumber+": Bad magician!\n");
			    			result = -1;
			    			break breakme;
			    		}
			    	}
			    }
		    }
		    
		    if(result ==0){
		    	bw.write("Case #"+casenumber+": Volunteer cheated!\n");
		    }else if(result >0){
		    	bw.write("Case #"+casenumber+": "+result+"\n");
		    }
		    casenumber++;
	    	line = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
