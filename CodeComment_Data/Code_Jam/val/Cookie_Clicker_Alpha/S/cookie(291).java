package methodEmbedding.Cookie_Clicker_Alpha.S.LYD823;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base="/Users/gremillard999/Downloads/";
        String input=base + "B-small-attempt0.in";
        String output=base + "B-small-attempt0.out";
		
		try{
	        Scanner scan = new Scanner(new FileReader(input));
	        PrintWriter pw = new PrintWriter(output);
			double C = 0;
			double F = 0;
			double X = 0;
			double rate = 2;
			double answer = 0;
			double totalTime =0;
			double currentTime =0;
			double setTime = 0;
			
			int cases = scan.nextInt();
			for(int i=1; i<=cases; i++){
				C = scan.nextDouble();
				F = scan.nextDouble();
				X = scan.nextDouble();
				System.out.println(C+ " " + F + " " + X);
				
				totalTime = X/rate; //rate always starts at 2
				setTime = C/rate;
				currentTime = setTime+X/(rate+F);
				
				do{
					if(currentTime > totalTime){
						answer = totalTime;
						System.out.println(currentTime  + " > " + totalTime);
					}
					else{
						
						totalTime = currentTime;
						setTime = setTime+C/(rate+F);
						rate+=F;
						currentTime = setTime+X/(rate+F);
					}
				}while(answer == 0);
				
				
				pw.println("Case #"+i+": "+answer);
				
				C = 0;
				F = 0;
				X = 0;
				rate = 2;
				answer = 0;
				totalTime = 0;
				currentTime = 0;
				setTime = 0;
				//pw.println();
	            pw.flush();
	            //pw.close();
			}
		} catch(FileNotFoundException ex){
			Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
