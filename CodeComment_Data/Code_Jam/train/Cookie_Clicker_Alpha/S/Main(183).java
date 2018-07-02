package methodEmbedding.Cookie_Clicker_Alpha.S.LYD131;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String args[]) throws IOException {
		String fileName = "/Users/lyc035/Desktop/input.in";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        PrintStream output = new PrintStream("/Users/lyc035/Desktop/output.out");
            
        int nn = Integer.parseInt(br.readLine());
        String[] dataSplit = null;
        
        Double C = 0.0;
        Double F = 0.0;
        Double X = 0.0;
        
        Double spTime = 0.0;//????????????
        
        Double aTime = 0.0;//a????????????
        Double bTime = 0.0;//b????????????
        
        Double nowSpeed = 0.0;//??????????????????
        
        Double ans = 0.0;
        
        for (int i = 0; i < nn; i++) {
        	String s = br.readLine();
        	dataSplit = s.split(" ");
        	
        	C = Double.valueOf(dataSplit[0]);
        	F = Double.valueOf(dataSplit[1]);
        	X = Double.valueOf(dataSplit[2]);
        	
            spTime = 0.0;//????????????
            
            aTime = 0.0;//a????????????
            bTime = 0.0;//b????????????           
            
            nowSpeed = 2.0;//??????????????????
            
            ans = 0.0;
            
            boolean check = true;
            
        	while (true) {               		
        		//??????????????????(a)
        		aTime = X / nowSpeed;
        		
        		//???farm????????????(b)
        		bTime = C / nowSpeed;  
        		
        		if (ans == 0.0 || ans > (spTime + aTime)) {
        			ans = spTime + aTime;
        		} else {
        			check = false;
        		}
        		
        		if (check == false) {
        			break;
        		}
        		
        		//???????????????????????????????????????
        		if (aTime > bTime) {
        			spTime += bTime;
        			nowSpeed += F;
        		}      

        	}
        	DecimalFormat df = new DecimalFormat("0.0000000");
        	output.println("Case #" + (i + 1) + ": " + df.format(ans));
        }        
        output.close();
	}
}
