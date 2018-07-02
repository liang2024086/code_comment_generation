package methodEmbedding.Speaking_in_Tongues.S.LYD1052;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author daniel
 */
public class CodeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
           
        int num = 0;
        String eng = "abcdefghijklmnopqrstuvwxyz ";
        String goo = "ynficwlbkuomxsevzpdrjgthaq ";
        String in = "";
        String out = "";
        
        Scanner kb = new Scanner(System.in);
        num = kb.nextInt();
        
       
        
        ArrayList<String> inputs = new ArrayList();
        ArrayList<String> outs = new ArrayList();
        
        for (int i = 0; i < num; i++)
        {
            
            in = kb.nextLine();
            inputs.add(in);
        }
        
   
    
        for (int i = 0; i < inputs.size(); i++)
        {
            out = "";
            for (int n = 0; n < inputs.get(i).length(); n++)
            {
                for (int j = 0; j < goo.length(); j++)
                {
                    if (inputs.get(i).charAt(n) == goo.charAt(j))
                    {
                        out += eng.charAt(j);
                        
                    }
                } 
                
            }
            outs.add(out);

        }
        
        for (int i = 0; i < outs.size(); i++)
        {
            System.out.println("Case #" + (i+1) +": " + outs.get(i));
        }
        
    
    

    }
}
