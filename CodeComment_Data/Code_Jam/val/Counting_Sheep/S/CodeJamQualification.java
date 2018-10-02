package methodEmbedding.Counting_Sheep.S.LYD113;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Charles
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class CodeJamQualification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String inFile = "A-small-attempt0.in";
        String outFile = "B-large-practice.out";
        Scanner sc = new Scanner(new File(inFile));
        PrintWriter writer = new PrintWriter(outFile);
        boolean badInput = true;
        boolean[] numsFound = new boolean[10];
        boolean done1Test = false;
        for(int i = 0; i < 10; i++)
            numsFound[i] = false;
        int testCases = sc.nextInt();
        String s;
        for(int i = 1; i <= testCases; i++){
            int j = 2;
            s = sc.nextInt() + "";
            while(!done1Test){
                int temp = Integer.parseInt(s);
                int holdTemp = temp;
                if(temp == 0){
                    writer.println("Case #" + i + ": INSOMNIA");
                    break;
                }
                boolean aBoolean = true;
                while(aBoolean){
                    String temp2 = temp + "";
                    for(int l = 0; l < temp2.length(); l++){
                        if(l != temp2.length() - 1)
                            numsFound[Integer.parseInt(temp2.substring(l, l+1))] = true;
                        else
                            numsFound[Integer.parseInt(temp2.substring(l))] = true;
                    }
                    for(int x = 0; x < 10; x++){
                        if(!numsFound[x]){
                            break;
                        }
                        if(numsFound[x] && x == 9){
                            aBoolean = false;
                            done1Test = true;
                        }
                    }
                    if(done1Test)
                        break;
                    temp = holdTemp;
                    temp *= j;
                    j++;
                }
                
                writer.println("Case #" + i + ": " + temp);
            }
            for(int k = 0; k < 10; k++)
                numsFound[k] = false;
            done1Test = false;
        }
        writer.close();
    }
    
}
