package methodEmbedding.Speaking_in_Tongues.S.LYD996;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kevin
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String INPUT_FILE_PATH = "input/input.in";
        final String OUTPUT_FILE_PATH = "output/output.out";
        
        Mapper mapper = new Mapper();
        ReadWriteManager manager = new ReadWriteManager();
        Data input = new Data(), output = new Data();
        
        try {
            input = manager.read(INPUT_FILE_PATH);
        } catch (Exception ex) {
            Logger.getLogger(SpeakingInTongues.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        output.setNumberOfLines(input.getNumberOfLines());
        ArrayList<String> inputText = input.getText(), outputText = new ArrayList<String>();
        
        for(int i = 0; i < input.getNumberOfLines(); ++i) {
            String inputString = inputText.get(i), outputString = new String();
            
            outputString += "Case #" + (i + 1) + ": ";
            
            for(int j = 0; j < inputString.length(); ++j) {
                outputString += mapper.translate(inputString.charAt(j));
            } 
            
            outputText.add(outputString);
        }
        
        output.setText(outputText);
        
        try {
            manager.write(OUTPUT_FILE_PATH, output);
        } catch (Exception ex) {
            Logger.getLogger(SpeakingInTongues.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}


