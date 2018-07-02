package methodEmbedding.Magic_Trick.S.LYD1965;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Aruna
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String[] strEle = new String[4];
        String[] strEle22 = new String[4];
        try{
            //System.out.println("Aruna--->Started testing");
        
            FileInputStream fstream = new FileInputStream("c:\\Aruna\\Inputfile.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            int tcCount = -1;
            int tc = 0;
            int rowNumSC = -1;
            int itr = 0;
            int totalRows = 4;
            boolean isFirstTry = false;
            boolean isSecondTry = false;
            
            while ((strLine = br.readLine()) != null)   {
                
                
                itr++;
                if (tcCount == -1) {
                     //System.out.println ("No. of TestCases:" +strLine);
                    tcCount = new Integer(strLine);
                } else {
                       
                    
                        if (itr > totalRows && isFirstTry) {
                            //System.out.println("Aruna---> row number of the selected card22 ::" + strLine);   
                            isSecondTry = true; 
                            rowNumSC = new Integer(strLine);
                            itr=0;
                        }
                        if (tcCount > 0 && rowNumSC == -1 && !isFirstTry && !isSecondTry) {
                            //System.out.println("Aruna---> row number of the selected card ::" + strLine);  
                            isFirstTry = true;
                            tc++;
                            rowNumSC = new Integer(strLine);
                            itr=0;
                        }
                        if (rowNumSC > 0 && itr == rowNumSC && isFirstTry && !isSecondTry) {
                             String strFirstOrder = strLine;
                             strEle = strFirstOrder.split(" ");                     
                        }
                         if (rowNumSC > 0 && itr == rowNumSC && isSecondTry) {
                             String str2ndOrder = strLine;
                             strEle22 = str2ndOrder.split(" ");  

                             Collection<String> list1 = new ArrayList(Arrays.asList(strEle));
                             Collection<String> list2 = new ArrayList(Arrays.asList(strEle22));
                           //  System.out.println(list1);
                             //System.out.println(list2);
                             list1.retainAll(list2);
                             int finalList = list1.size();
                             if (finalList == 0) {
                                System.out.println("Case #" + tc +": Volunteer Cheated!");
                             } else if (finalList > 1) {
                                 System.out.println("Case #" + tc +": Bad magician!");
                             } else if (finalList == 1 ) {
                                 String[] str = list1.toArray(new String[finalList]);
                                 System.out.println("Case #" + tc +": " +str[0]);
                             }                            
                          }
                          if (itr >= totalRows && isFirstTry && isSecondTry) { 
                            //resetting the values                              
                             rowNumSC = -1;
                             itr = 0;
                             isFirstTry = false;
                             isSecondTry = false;
                        }
                  }

            }
             in.close();
         }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
         }
        
        
        System.out.println("Aruna--->Completed testing");
        
}
}
