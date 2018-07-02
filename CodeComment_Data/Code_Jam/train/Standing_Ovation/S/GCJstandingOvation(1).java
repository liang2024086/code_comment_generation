package methodEmbedding.Standing_Ovation.S.LYD1596;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;


/**
 *
 * @author Sachin
 */
public class GCJstandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int t = 0, n = 0, data=0, num=0;
        int result = 0;

        File file = new File("output.txt");
        FileWriter fileWritter = new FileWriter(file.getName(), true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
               

        FileInputStream fr = new FileInputStream("C:\\Users\\Sachin\\Desktop\\A-small-attempt0.in");
        @SuppressWarnings("deprecation")
        StreamTokenizer st = new StreamTokenizer(fr);
        st.eolIsSignificant(false);
        st.whitespaceChars(0, 32);


        int learn = 0, flag = 0, j = 0;

        while (true) {
            
            flag++;
            result=0;
            learn = st.nextToken();
            if (learn == StreamTokenizer.TT_EOF)
            {
                break;
            }
            if (learn == StreamTokenizer.TT_NUMBER && flag == 1) 
            {
             
               t = (int) st.nval;
            }
            else if (learn == StreamTokenizer.TT_NUMBER && flag == 2) 
            {
             
                n = (int) st.nval;
                learn = st.nextToken();
                data = (int) st.nval;
                for(int i = n,stands = 0,pos=0; i >= 0; i--,pos++)
                {
                    j=data/(int)Math.pow(10, i);
                    data=data%(int)Math.pow(10, i);
                
                    if(stands>=pos)
                    {
                        stands=stands+j;
                    }
                    else
                    {
                        stands=stands+j;
                        result++;
                        stands++;
                    }   
                    
                }
                
            
            
                num++;
                bufferWritter.write("Case #" + num + ": " + result + "\n");
                flag = 1;
                result = 0;
            }
        }    
        
        
        bufferWritter.close();
        
}
}
