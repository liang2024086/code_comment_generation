package methodEmbedding.Magic_Trick.S.LYD207;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("src/codejam14/input.in"));
		FileWriter writer = new FileWriter(
				new File("src/codejam14/output.txt"));
        int $case = Integer.parseInt(br.readLine());
        String line;
    	String newline = "";
    	String[] firstArr = null,secondArr = null;
        for(int i=1;i<=$case;i++){
        	int firstIn = -1,secondIn=-1;
        	for(int z=1;z<3;z++){
        		if(z==1){
        			firstIn = Integer.parseInt(br.readLine());
        			for(int j=1;j<=4;j++){
                		line = br.readLine();
                		if(j==firstIn){
                			firstArr = line.trim().split(" ");
                		}
        			}
        		}
        		else if(z==2){
        			secondIn = Integer.parseInt(br.readLine());
        			for(int j=1;j<=4;j++){
                		line = br.readLine();
                		if(j==secondIn){
                			secondArr = line.trim().split(" ");
                		}
        			}	
            	}
        	}
        	int flag=0,out=0;
        	for(String a : firstArr){
        		for(String b : secondArr){
        			if(a.equals(b)){
        				flag++;
        				out=Integer.parseInt(b);
        			}
        		}
        	}
        	if(i>1)
        		newline="\n";
        	if(flag==1){
        		writer.write(newline+"Case #" +i+": "+out);
        	}
        	else if(flag>1){
        		writer.write(newline+"Case #" +i+": Bad magician!");
        	}
        	else if(flag==0){
        		writer.write(newline+"Case #" +i+": Volunteer cheated!");
        	}
        	writer.flush();
        }
        br.close();
        writer.close();
	}
}
