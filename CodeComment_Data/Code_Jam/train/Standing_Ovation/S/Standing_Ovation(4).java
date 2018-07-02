package methodEmbedding.Standing_Ovation.S.LYD1837;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Standing_Ovation {
    public static void main(String[] args) throws FileNotFoundException, IOException {
		// Read from a file using FileReader not system 
        BufferedReader in = new BufferedReader (new FileReader("A-small-attempt2.in")); 
		// object of a FileWriter into a file named o.out, this file is to be submitted to the judge
        FileWriter out = new FileWriter("Output.out"); 
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st ;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            int Smax=Integer.parseInt(st.nextToken());    
            String stTemp=st.nextToken();
            int count1= Integer.parseInt(stTemp.charAt(0)+"");
            int count2=0;
            for (int j = 1; j < stTemp.length(); j++) {
               int temp=Integer.parseInt(stTemp.charAt(j)+"");
                
            if(temp>0){
                if(count1>=j){
                    count1+= temp;
                }
                else{
                    count2+=j-count1;
                    count1+=j-count1+temp;
                }
            }
            //System.out.println(count1+"...."+count2);
            }
         // System.out.println(count2);
	// write into file using append 
            out.append("Case #"+(i+1)+": "+count2); 
           
	// move to new line at each test case
            out.append("\n"); 
			 
        }
	// this line is necessarily to complete the FileWriter correctly 
        out.close();  
    }
}
