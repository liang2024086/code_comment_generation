package methodEmbedding.Speaking_in_Tongues.S.LYD256;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;


/**
 *
 * @author Yousuf
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) throws FileNotFoundException, IOException {

          String orgList[]={" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","s","r","t","v","u","w","x","y","z"};
          String tanList[]={" ","y","n","f","i","c","w","l","b","k","u","o","m","x","s","e","v","z","d","p","r","g","j","t","h","a","q"};


         FileInputStream a = new FileInputStream("A-small-attempt0.in");
        FileOutputStream b = new FileOutputStream("A-small-attempt0.out");

        BufferedReader in = new BufferedReader(new InputStreamReader(a));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(b));

        int numOfCases = Integer.parseInt(in.readLine());

        for(int i=0;i<numOfCases;i++)
        {
            String tmp = in.readLine();
            String result="";

            for(int j=0;j<tmp.length();j++)
            {
                String ab= ""+tmp.charAt(j);

                for(int q=0;q<tanList.length;q++)
                {
                    if(tanList[q].equalsIgnoreCase(ab))
                    {
                        result+=orgList[q];
                        q=tanList.length;
                    }
                }
            }
            
//System.out.println(tmp);
            out.write("Case #"+(i+1)+": "+result.trim());

            if(i<numOfCases-1)
                out.newLine();
        }

        in.close();
        out.flush();
        out.close();




    }

}
