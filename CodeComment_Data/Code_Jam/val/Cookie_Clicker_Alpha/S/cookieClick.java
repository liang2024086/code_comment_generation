package methodEmbedding.Cookie_Clicker_Alpha.S.LYD908;

import java.util.*;
import java.io.*;
public class cookieClick {

    public cookieClick() {
    }
    
    public static void main (String[] args) {
		try{
		    double seconds=0;
		    Scanner sc= new Scanner(System.in);
		    String name=sc.next();
			Scanner inFile= new Scanner(new FileReader(name));
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			int test=inFile.nextInt();
			
			int cas=0;
			while(test>0){
				cas++;
				seconds=0.0000000;
				double  i=2.0000000;
				double c=inFile.nextDouble();
				double f= inFile.nextDouble();
				double x=inFile.nextDouble();
				while(true){
				double temp=c/i;
				double tempe=temp+x/(i+f);
				if(tempe>(x/i)){
					seconds=seconds+x/i;
					break;
				}	
					seconds=seconds+temp;
					i=i+f;
				}
				writer.println("Case #"+cas+": "+seconds);
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
