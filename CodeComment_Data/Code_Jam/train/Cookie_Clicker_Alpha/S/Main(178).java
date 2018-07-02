package methodEmbedding.Cookie_Clicker_Alpha.S.LYD527;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main
{
    //-----CONSTANTS-----

    //-----VARIABLES-----

    //-----CONSTRUCTORS-----
    public Main()
    {
    }

    public static void main(String[] args)
    {
	// Read .in file with input
		FileInputStream fstream = null;
		int T = 0;
		try {
			fstream = new FileInputStream("C:\\Users\\Heleen\\workspace\\GCJ\\src\\cookie2014\\B-small-practice.in");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			PrintWriter writer = new PrintWriter("C:\\Users\\Heleen\\workspace\\GCJ\\src\\cookie2014\\output.out","UTF-8");
			T =	Integer.parseInt( br.readLine());
			double C = 0.0;
			double F = 0.0;
			double X = 0.0;
			
			for(int testcase=0;testcase<T;testcase++){
			    
			    String readLine = br.readLine();
			    String[] dimensions = readLine.split(" ");
			    C = Double.parseDouble(dimensions[0]);
			    F = Double.parseDouble(dimensions[1]);
			    X = Double.parseDouble(dimensions[2]);
			    

			    System.out.println("Case #"+(testcase+1)+": input ["+C+"-"+F+"-"+X+"]");
			    boolean done = false;
			    double cookies = 0.0;
			    double rate = 2.0;
			    double time = 0.0;
			    double futureRate = 2.0+F;
			    while(!done){
				double timeToC = (C-cookies)/rate;
				double timeToX = (X-cookies)/rate;
				System.out.println("TimeToC "+timeToC+" and TimeToX "+timeToX);
				if(timeToC-timeToX>0.0 || timeToC-timeToX==0.0) {
				    writer.println("Case #"+(testcase+1)+": "+(time+timeToX));
				    done = true;
				}else{
				    //continue until you have enough to buy cookies
				    cookies = C;
				    time+=timeToC;
				    //calculate how much time it would cost to continue until you have enough cookies to win
				    timeToX = (X-cookies)/rate;
				    //calculate how much time it would take you to have enough cookies to win, after you bought farm
				    double timeAfterFarm = (X-cookies+C)/futureRate;

				    System.out.println("TimeAfterFarm "+timeAfterFarm+" and TimeToX "+timeToX);
				    //if buying farm would not win any time -> keep collecting cookies
				    if(timeAfterFarm-timeToX>0.0 || timeAfterFarm-timeToX == 0.0){   
					writer.println("Case #"+(testcase+1)+": "+(time+timeToX));
					   done = true;
				    }
				    else{
					// Buy Farm and adjust rate				    }
					cookies = cookies-C;
					rate = futureRate;
					futureRate = (futureRate+F);
				    }				
				}
			    }
			}
			writer.close();
			br.close();
		}catch(FileNotFoundException e){
		    System.err.println(e);
		}catch(IOException e){

		    System.err.println(e);
		}
    }
    //-----PUBLIC FUNCTIONS-----

    //-----PROTECTED FUNCTIONS-----

    //-----PRIVATE FUNCTIONS-----
    
}
