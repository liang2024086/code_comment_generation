package methodEmbedding.Speaking_in_Tongues.S.LYD454;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SpeakingInTonguesss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    char[] b={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] u={' ','y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        
        PrintWriter pw =null;
        Scanner sc =null;
        try{
                //new SpeakingInTongues();
             //new SpeakingInTongues();
              

 sc =new Scanner(new FileReader("C:\\Users\\gad\\Downloads\\A-small-attempt5.in"));
                pw =new PrintWriter(new FileWriter("D:\\mystudy\\aSpkoutput.out"));
                int cC=Integer.parseInt(sc.nextLine());
                
                for(int cnt=0;cnt<cC;cnt++)
                    {
                        
                            String s=sc.nextLine();
                            char[] l=new char[s.length()];
                            String out ="";
                            for(int n=0;n<s.length();n++)
                                 {
                                    for(int j=0;j<27;j++)
                                    {
                                        if(s.charAt(n)==b[j])
                                            l[n]=u[j];
                                    }
                                    out+=l[n];
                     
                                 }
                            pw.println("Case #"+(cnt+1)+": "+out);
                    }
            
        } catch (IOException ex){
            Logger.getLogger(SpeakingInTonguesss.class.getName()).log(Level.SEVERE,null,ex);
        } finally{
            pw.flush();
            pw.close();
            sc.close();
                }
        
    }

    }

