package methodEmbedding.Standing_Ovation.S.LYD2195;


import java.io.*;

public class StandingOvation {

    private String fileName;
    
    public StandingOvation() {
        
        this.fileName = "input.in";
    
    }
    
    public static void main(String[] args)  throws IOException {
        
        StandingOvation obj = new StandingOvation();
        
        FileInputStream fis = new FileInputStream(obj.fileName);
        InputStreamReader ir = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(ir);
        
        int t = Integer.parseInt(br.readLine());
        int countTest = 1;
        
        while(t-- > 0) {
            
            String[] temp = (br.readLine()).split("\\s+");
            
            int n = Integer.parseInt(temp[0]);
            n++;
            int[] shyness = new int[n];
            
            for(int i = 0; i < n; i++) {
                shyness[i] = (int)temp[1].charAt(i) - 48;
            }
            
            int countCurr = 0;
            int needed = 0;
            
            for(int i = 0; i < n; i++) {
                if(countCurr < i) {
                    needed += (i - countCurr);
                    countCurr += (i - countCurr);
                }
                countCurr += shyness[i];
            }
            
            System.out.println("Case #" + countTest + ": " + needed);
            
            countTest++;
            
        }
        
    }
    
}
