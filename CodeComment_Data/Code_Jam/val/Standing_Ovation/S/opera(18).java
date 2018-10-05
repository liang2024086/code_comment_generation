package methodEmbedding.Standing_Ovation.S.LYD1097;

import java.io.*;
import java.util.*;

public class opera {

    public static BufferedReader br = null;
    public static BufferedWriter bw = null;
    public static FileWriter fw = null;

    public static void main (String[] args) throws FileNotFoundException, IOException{
        String currLine;
        List<String> myList = new ArrayList<String>();
        File file = new File(args[1]);
        br = new BufferedReader(new FileReader(args[0]));
        fw = new FileWriter(file.getAbsoluteFile());
        bw = new BufferedWriter(fw);
        
        
        while ((currLine = br.readLine()) != null) {
            myList.add(currLine);
        }
        String[] arr = myList.toArray(new String[myList.size()]);
        int trials = Integer.parseInt(arr[0]);
        
        for (int i=1; i<=trials; i++) {
            String currTrial = arr[i];
            char[] currAr = arr[i].toCharArray();
            int highestLevel = Character.getNumericValue(currAr[0]);
            int totalpplAt0ShyLvl = Character.getNumericValue(currAr[2]);
            int totalpplb4current = 0;
            int totaladdFriend = 0;
            
            totalpplb4current = totalpplAt0ShyLvl;
            String arrowspaces = " ";
            for (int j=1; j<highestLevel+1; j++) {
                int currentShyLevel = j;
                int currentPositionInArray = j+2; //Since maxShyLevl + Space before firstShyCount
                int currentNumberofPeopleWithThisShyness = Character.getNumericValue(currAr[currentPositionInArray]);
                
                if (currentNumberofPeopleWithThisShyness == 0) {
                } else {
                    if (totalpplb4current < currentShyLevel) {
                        int addFriend = currentShyLevel - totalpplb4current;
                        totaladdFriend = totaladdFriend + addFriend;
                        totalpplb4current = totalpplb4current + currentNumberofPeopleWithThisShyness + addFriend;
                    } else {
                        totalpplb4current = totalpplb4current + currentNumberofPeopleWithThisShyness;
                    }
                }
                
            }
            
            String content = "Case #" + i + ": " + totaladdFriend + "\n";
            
            bw.write(content);
        }
        bw.close();
        
    }


}
