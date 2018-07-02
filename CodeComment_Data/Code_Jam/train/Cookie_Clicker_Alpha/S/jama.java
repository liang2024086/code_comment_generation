package methodEmbedding.Cookie_Clicker_Alpha.S.LYD869;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.text.DecimalFormat;
import java.util.ArrayList;

class jama {
	static String outFile="c:\\codeJam\\output.txt";
	static String inFile="c:\\codeJam\\input.in";
	static int []gCts=null;
	static double gain=2;
	
    public static void main(String[] args) {
    	FileReader fr=null;
		try {
			fr = new FileReader(inFile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        BufferedReader bufferRead = new BufferedReader(fr);

        
    	//BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    try {
	    	System.out.println("\n");
			FileWriter fw = new FileWriter(outFile);
			
			String s = bufferRead.readLine();
			int testCases=Integer.parseInt(s);
			ArrayList<String> sars = new ArrayList<String>();
			for(int i=0; i< testCases; i++){
				s = bufferRead.readLine();
				sars.add(s);				
			}

			for(int j=0; j<sars.size(); j++){
				gain=2;
				String [] split=sars.get(j).split(" ");
				double C=Double.parseDouble(split[0]);
				double F=Double.parseDouble(split[1]);
				double X=Double.parseDouble(split[2]);
				double timeToNextFarm=C/gain;
				double currentCookies=0;
				double totalTime=0;
				double timeToFinish=X/gain;
				boolean done=false;
				int ct=0;
				while(!done){
					timeToNextFarm=C/gain;
					timeToFinish=X/gain;
					if(timeToFinish<timeToNextFarm){
						totalTime=totalTime+timeToFinish;
						done=true;
						break;
					}
					double nextGain=gain+F;
					double timeIfBuyNextFarm=timeToNextFarm+(X/nextGain);
					if(timeIfBuyNextFarm<timeToFinish){
						
						totalTime=totalTime+timeToNextFarm;						
						gain=nextGain;
					}else{
						totalTime=totalTime+timeToFinish;
						done=true;
						break;
					}
				}
				String output=String.format("%.7f", totalTime);
				System.out.println("Case #"+(j+1)+": "+output);
				fw.write("Case #"+(j+1)+": "+ output+"\r\n");
				
				
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
    }
}
