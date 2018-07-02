package methodEmbedding.Cookie_Clicker_Alpha.S.LYD414;


import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class Jam2{
    public static void main(String[] args){
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader("src/basicRound/B-small-attempt0.in"));
            
            String line = fileIn.readLine();
            int n = Integer.parseInt(line);
            
            for(int i=1; i<=n; i++){ //////////main loop
            	line = fileIn.readLine();
                String[] numstr = line.split(" ");
                double[] nums = new double[3];
                for(int j=0;j<3;j++){
                	nums[j] = Double.parseDouble(numstr[j]);
                }
                
                
                // finished parsing
                
                double wait = 0;
                double buyAndWait = -1;
                double cps = 2;
                
                double timeToBuy = 0;
                
                double totalBuy = 0;
                
                //if buy farm and wait takes shorter time
                do{
                	totalBuy += timeToBuy;
                	
                	wait = nums[2]/cps;
                	
                	//time to make cookie to buy farm
                	buyAndWait = nums[0]/cps;
                	
                	timeToBuy = nums[0]/cps;
                	
                	// cps after buying farm
                	cps += nums[1];
                			
                	buyAndWait += nums[2]/cps;
                	
                	
                }while(buyAndWait < wait);
                
                double total = totalBuy + wait;
                
                DecimalFormat df = new DecimalFormat("#.0000000");
                
                System.out.println("Case #"+ i +": "+df.format(total));
                
                
                
            }//main for
            
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}    
