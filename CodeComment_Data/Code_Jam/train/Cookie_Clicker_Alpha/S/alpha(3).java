package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1613;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class alpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader buf=new BufferedReader(new FileReader("file.in"));
		PrintWriter printer=new PrintWriter("file.out");
		int T=Integer.parseInt(buf.readLine());
		for(int i=0;i<T;i++){
			printer.print("Case #"+(i+1)+": ");
			double C,F,X;
			String[] str=buf.readLine().split(" ");
			C=Double.parseDouble(str[0]);
			F=Double.parseDouble(str[1]);
			X=Double.parseDouble(str[2]);
			//System.out.println(i+":");
			if(X<=C){
				printer.printf("%.7f\n", X/2);
			}else{
				double time=C/2;
				for(double j=0;j<1000000;j++){
					//is it better to buy another or wait?
					//System.out.println(X+","+C+","+F+","+j);
					//System.out.println("a: "+(X-C)/(F*j+2));
					//System.out.println("b: "+X/(F*(j+1)+2));
					if((X-C)/(F*j+2)<X/(F*(j+1)+2)){
						//System.out.println((X-C)/(F*j+2));
						time+=(X-C)/(F*j+2);
						break;
					}else{
						//System.out.println((C)/(F*(j+1)+2));
						time+=(C)/(F*(j+1)+2);
					}
				}
				printer.printf("%.7f\n",time);

			}
		}
		printer.close();
	}

}
