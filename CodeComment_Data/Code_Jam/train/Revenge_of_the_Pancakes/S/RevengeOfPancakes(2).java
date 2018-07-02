package methodEmbedding.Revenge_of_the_Pancakes.S.LYD117;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class RevengeOfPancakes {
    private static final char SMILESIDE = '+';
    private static final char BLANKSIDE = '-';
    
    private static final String CASE = "Case #";
    public static void main(String[] args) throws Exception {

//        String ipFileName = "A-small-attempt0.in";
        
//        BufferedReader br = new BufferedReader(new FileReader(new File(ipFileName)));
//        PrintWriter pw = new PrintWriter(ipFileName+".out");
        
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        
        long start = System.currentTimeMillis();
        
        int tcs = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=tcs;++i){
            int flipCount = 0;
            String opFormat = CASE+i+": ";
            String currentStack = br.readLine();
            //removing trailing smilesides
            int newEnd = -1;
            for(int j=currentStack.length()-1;j>=0;--j){
                if(currentStack.charAt(j)==BLANKSIDE){
                    newEnd = j+1;
                    break;
                }
            }
            //removed trailing smilesides

            //In this case, we have found a stack full of SMILESIDES, so we can safely output 0
            //Is it plainly just the number of alternating SMILESIDES and BLANKSIDES + 1, after removing all the trailing SMILESIDES ?
            if(newEnd == -1){
               pw.println(opFormat+flipCount);
            }
            else{   //In this case, we have at least one BLANKSIDE that we have to flip
                char currentSide = currentStack.charAt(0);
                for(int j=0;j<newEnd;++j){
                    if(currentSide!=currentStack.charAt(j)){
                        flipCount++;
                        currentSide = currentStack.charAt(j);
                    }
                }
                //for the last flip to SMILESIDES
                flipCount++;
                pw.println(opFormat+flipCount);
            }
        }
    
        long end = System.currentTimeMillis();
//        System.out.println("Total Time Taken : "+((end-start)/1000d)+"s");
        
        pw.flush();
        pw.close();
        br.close();
    }
}

