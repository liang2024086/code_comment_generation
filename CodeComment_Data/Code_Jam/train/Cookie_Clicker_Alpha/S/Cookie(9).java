package methodEmbedding.Cookie_Clicker_Alpha.S.LYD854;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sandeep_Kumar25
 */
import java.io.*;
import java.util.*;
public class Cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fstream1 = new FileInputStream("B-small-attempt0.in");	      
	DataInputStream in1 = new DataInputStream(fstream1);
	BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
	String str;
	FileWriter fwrite1 = new FileWriter("output.txt");
	BufferedWriter out1 = new BufferedWriter(fwrite1);
        while ((str = br1.readLine()) != null) {
            int tests = Integer.parseInt(str);
            for (int i=0;i<tests;i++)
            {
                double res = 0;
                String st = br1.readLine();
                String [] starr = st.split(" ");
                double c = Double.parseDouble(starr[0]);
                double f = Double.parseDouble(starr[1]);
                double x = Double.parseDouble(starr[2]);
                if (x < c)
                {
                    res = x/2.0;
                }
                else
                {
                    // input has been taken
                    // cost witt current cookie to finish x
                    double currentcost = 2.0;
                    double costtofinishx = x/currentcost;
                    double costtofinishc = c/currentcost;
                    double costtofinishxwithfarm = costtofinishc + (x/(currentcost + f));
                    //System.out.println(costtofinishxwithfarm+" "+costtofinishx+" "+currentcost+" "+costtofinishc);
                    
                    currentcost += f;                    
                    while (costtofinishxwithfarm < costtofinishx)
                    {
                    res += costtofinishc;    
                    costtofinishx = x/currentcost;
                    costtofinishc = c/currentcost;
                    costtofinishxwithfarm = costtofinishc + (x/(currentcost + f));
                    // after buying the cookie farm
                    currentcost += f;
                    //System.out.println(costtofinishxwithfarm+" "+costtofinishx+" "+currentcost+" "+costtofinishc);
                    }
                    
                    res += costtofinishx;
                    
                }
                
                out1.write("Case #"+(i+1)+": ");
                out1.write(String.format("%.7f", res)+"\n");
            }
        }
        br1.close();
        out1.close();
    }    
}
