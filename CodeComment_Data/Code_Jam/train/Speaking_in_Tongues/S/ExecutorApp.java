package methodEmbedding.Speaking_in_Tongues.S.LYD1438;


import com.codejam.two12.tongue.Googlerese;

public class ExecutorApp {
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
   //String inputFileName = "/Users/joekumar/Documents/workspace/CodeJam/src/com/jp/data/sample_input.txt";
  // String outputFileName = "/Users/joekumar/Documents/workspace/CodeJam/src/com/jp/data/sample_output.txt";
    String inputFileName = "/Users/joekumar/Downloads/A-small-attempt0.in";
    String outputFileName = "/Users/joekumar/Desktop/output/sample_output.txt";
    InputOutputProcessor inputOutputProcessor = new InputOutputProcessor();
    inputOutputProcessor.initializeInput(inputFileName);
    int numberOfCases = inputOutputProcessor.getNumberOfCases();
    
    String[] resultArray = new String[numberOfCases];
    inputOutputProcessor.setDoesInputHaveDataSetLines(false);
    inputOutputProcessor.setNumberOfDataSetLines(1);
    
    Googlerese.init();
    
    for (int i = 1; i <= numberOfCases; i++) {
      
      try {
        String[] dataSet = inputOutputProcessor.getDataSet();
       
       /* BotTrust botTrust = new BotTrust();
       int result =  botTrust.findRequiredSeconds(dataSet);
       String resultCase = "Case #"+ i + ": "+ result;
       resultArray[i-1] = resultCase;
       System.out.println(resultCase);*/
        Puzzle puzzle = PuzzleFactory.getPuzzleSolution("SpeakingTongues");
        String[] result = puzzle.solve(dataSet);
        String resultCase = "Case #"+ i + ": "+ result[0] ;
        System.out.println(resultCase);
        resultArray[i-1] = resultCase;
        
      }
      
      catch (Exception exp) {
        exp.printStackTrace();
        inputOutputProcessor.closeScanner();
      }
      
    }
    
    inputOutputProcessor.closeScanner();
    inputOutputProcessor.writeOutput(outputFileName, resultArray);
   
  }
  
}
