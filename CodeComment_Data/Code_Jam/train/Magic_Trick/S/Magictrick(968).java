package methodEmbedding.Magic_Trick.S.LYD2221;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maheswaran M
 */
public class Magictrick {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
         String cases  = br.readLine();
         
         int noOfCases = Integer.parseInt(cases);
         
         for(int i=0;i< noOfCases; i++) {
             String first = br.readLine();
             int firstAnswer = Integer.parseInt(first);
             
             String firstAnswerItems  = "";
             
             for(int j = 0; j< 4;j++) {
                 String thisRow = br.readLine();
                 if(j == (firstAnswer - 1) ) {
                     firstAnswerItems = thisRow;
                 }
             }
             
             String[] firstAnswerRow = firstAnswerItems.split(" ");
             firstAnswerItems = "|";
             for(String s : firstAnswerRow) {
                 firstAnswerItems += s+"|";
             }
             
             String second = br.readLine();
             int secondAnswer = Integer.parseInt(second);
             
             String secondAnswerItems  = "";
             
             for(int j = 0; j< 4;j++) {
                 String thisRow = br.readLine();
                 if(j == (secondAnswer - 1) ) {
                     secondAnswerItems = thisRow;
                 }
             }
             
             String[] secondAnswerRow = secondAnswerItems.split(" ");
             secondAnswerItems = "";
             
             int possibilities = 0;
             String result ="";
             for(String s : secondAnswerRow) {
           //      System.out.println("\n Value " + s + " out " + firstAnswerItems.indexOf(s+"|"));
                 
                 if(firstAnswerItems.indexOf("|"+s+"|") != -1) {
                     result = s;
                     possibilities++;
                 }
             }
             
             if(possibilities == 0) {
                 result = "Volunteer cheated!";
             }
             else if(possibilities > 1){
                 result = "Bad magician!";
             }
             
             System.out.println("Case #"+(i+1) + ": "+ result);
             
         }
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
         
    }
    
}
