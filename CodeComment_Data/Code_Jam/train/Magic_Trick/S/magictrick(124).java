package methodEmbedding.Magic_Trick.S.LYD659;

import java.util.*;
import java.io.*;
public class magictrick {
    public magictrick() {
    }
    public static void main (String[] args) {
    	try{
		    int same=0,answer=0;
		    Scanner sc= new Scanner(System.in);
		    String name=sc.next();
			Scanner inFile= new Scanner(new FileReader(name));
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			int test=inFile.nextInt();
			int[][] array= new int[4][4];
			int[] check= new int[4];
			int cas=0;
			while(test>0){
				cas++;
				same=0;
				int first=inFile.nextInt();
				first--;
				for(int i=0;i<4;i++){		
					for(int j=0;j<4;j++)
						array[i][j]=inFile.nextInt();
				}
				for(int i=0;i<4;i++)
					check[i]=array[first][i];
				int second= inFile.nextInt();
				second--;
				for(int i=0;i<4;i++){
						for(int j=0;j<4;j++)
						array[i][j]=inFile.nextInt();
				}
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++)
					if(array[second][i]==check[j]){
						same++;
						answer=check[j];
					}	
				}
				if(same==0){
					writer.println("Case #"+cas+": Volunteer cheated!");
				}
				else if(same==1){
					writer.println("Case #"+cas+": "+answer);
				}
				else{
				writer.println("Case #"+cas+": Bad magician!");
				}
				
				test--;
			}
			inFile.close();
			writer.close();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
	}
}
