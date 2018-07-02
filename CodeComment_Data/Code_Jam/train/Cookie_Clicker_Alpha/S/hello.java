package methodEmbedding.Cookie_Clicker_Alpha.S.LYD581;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class hello {

    public static void main(String[] args)throws FileNotFoundException{
    	int i=1;
    	DecimalFormat df = new DecimalFormat("#.#######");
    	Scanner sf = new Scanner(new File("input.txt"));
    	PrintWriter out = new PrintWriter("output.txt");
    	//read and write
    	sf.nextLine();//no_of_test
    	while(sf.hasNextLine()) {
    		boolean cont=true;
    		double c,f,x;
    		double a,m,md,n,nd,b;
    		String ans="-1";
    		String line=sf.nextLine();
    		Scanner scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            c=Double.parseDouble(scanner.next());
            f=Double.parseDouble(scanner.next());
            x=Double.parseDouble(scanner.next());
            //finding  minimum
            a=(x/(2.0));
    		m=(c/(2.0));
    		md=2.0;
    		n=(x/(2.0+f));
    		nd=2.0+f;
    		b=m+n;
            while(cont){
            	if(a<=b){
            		cont=false;
            		ans=df.format(a);
            	}	
            	a=b;
            	md=md+f;
            	m=m+(c/md);
            	nd=nd+f;
            	n=(x/nd);
            	b=m+n;	
            }
            out.println("Case #"+i+": "+ans);
            i++;
            scanner.close();
    	}
    	sf.close();
    	out.close();
    }   
}
