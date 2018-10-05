package methodEmbedding.Magic_Trick.S.LYD1357;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MagicTrick {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("_input.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_output.in"));

        br.readLine();//first line for the case count
        String line = null;
        int index = 1;
        
        while((line = br.readLine())!=null){
            
            int answerLoc = Integer.parseInt(line);
            
            for(int i=0; i<answerLoc; i++){
                line = br.readLine();
            }
            
            String[] firstRow = line.split("\\s");
            
            for(int i=0; i<=4-answerLoc; i++){
                line = br.readLine();
            }
            
            answerLoc = Integer.parseInt(line);
            
            for(int i=0; i<answerLoc; i++){
                line = br.readLine();
            }
            
            String[] secondRow = line.split("\\s");
            
            int answerCount = 0;
            String answer = "";
            
            for(String s : firstRow){
                for(String t : secondRow){
                    if(s.equalsIgnoreCase(t)){
                        answer = s;
                        answerCount++;
                    }
                }
            }
            
            for(int i=0; i<4-answerLoc; i++){
                line = br.readLine();
            }
            
            if(answerCount>1){
                answer = "Bad magician!";
                bw.append("Case #" + index++ + ": " + answer + "\n");
            }
            else if(answerCount==0){
                answer = "Volunteer cheated!";
                bw.append("Case #" + index++ + ": " + answer + "\n");
            }
            else{
                bw.append("Case #" + index++ + ": " + answer + "\n");
            }
            
        }
        
        br.close();
        bw.close();
        
    }
}
