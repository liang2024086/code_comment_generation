package methodEmbedding.Magic_Trick.S.LYD1693;


import java.io.BufferedReader;
import java.io.FileReader;

public class Jam1{
    public static void main(String[] args){
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader("src/basicRound/A-small-attempt0.in"));
            
            String line = fileIn.readLine();
            int n = Integer.parseInt(line);
            
            for(int i=1; i<=n; i++){
                line = fileIn.readLine();
                int first = Integer.parseInt(line) - 1;
      
                int[][] cardNum1 = new int[4][4];
                
                for(int a=0;a<4;a++){
                	line = fileIn.readLine();
                    String[] cards = line.split(" ");
                	for(int b=0;b<4;b++){
                		
                        //System.out.println("a: "+a+", b: "+b+" , card b:"+cards[b]);
                        cardNum1[a][b] = Integer.parseInt(cards[b]);
                	}
                    
                }
                
                line = fileIn.readLine();
                int secound = Integer.parseInt(line) -1;
                
                int[][] cardNum2 = new int[4][4];
                
                for(int a=0;a<4;a++){
                	line = fileIn.readLine();
                    String[] cards = line.split(" ");
                	for(int b=0;b<4;b++){
                		
                        cardNum2[a][b] = Integer.parseInt(cards[b]);
                	}
                    
                }
                
                // finished parsing
                
                int[] posi = new int[4];
                
                int ans = 0;
                int ansC = 0;
                
                for(int a=0;a<4;a++){
                	for(int b=0;b<4;b++){
                		if(cardNum1[first][a] == cardNum2[secound][b]){
                			ans = cardNum1[first][a];
                			ansC++;
                		}
                	}
                }
                
                //success with only one answer
//                System.out.println("i: "+i+", ansC: "+ansC);
                
                if (ansC == 1){
                	System.out.println("Case #"+ i +": "+ans);
                	//more than 1 answer
                }else if(ansC > 1){
                	System.out.println("Case #"+ i +": Bad magician!");
                }else{
                	System.out.println("Case #"+ i +": Volunteer cheated!");
                }
                
                
            }//main for
            
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}    
