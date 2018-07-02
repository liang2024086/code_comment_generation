package methodEmbedding.Cookie_Clicker_Alpha.S.LYD417;

import java.io.*;
import java.lang.Math;
import java.text.*;

class Cookie{
	public static void main(String[] args) throws Exception{
	DecimalFormat df = new DecimalFormat("0.0000000");
      	double n=0,time=0;
        int t;
        String line;
        String[] parts;
	PrintWriter printWriter = new PrintWriter ("output.txt");       
	BufferedReader scan1 = new BufferedReader(new FileReader("B-small-attempt0.in"));
        t=Integer.parseInt(scan1.readLine());
        double[] c=new double[t];
        double[] f=new double[t];
        double[] x=new double[t];
        for(int i=0;i<t;i++){
        line=scan1.readLine();
        parts = line.split(" ");
        c[i]=Double.parseDouble(parts[0]);
        f[i]=Double.parseDouble(parts[1]);
        x[i]=Double.parseDouble(parts[2]);
        }
        
        for(int i=0;i<t;i++){
		n=0;
		time=0;
            while(true){
		if(((x[i]/(2+n*f[i]))<((c[i]/(2+n*f[i]))+(x[i]/(2+(n+1)*f[i]))))){
                    time=time+(x[i]/(2+n*f[i]));
                    break;
		}
		time=time+(c[i]/(2+n*f[i]));
                n++;
                
                
	}
	printWriter.println("CASE #"+(i+1)+": "+df.format(time));
        }
	printWriter.close ();
        
    }
}
