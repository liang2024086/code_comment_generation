package methodEmbedding.Counting_Sheep.S.LYD1552;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nidhi
 */
public class CountSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try{
        FileReader fr = new FileReader("A-small-attempt2.in");
           // FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        int T = Integer.parseInt(br.readLine());
        int N;
         
         FileWriter fw = new FileWriter("A-small-attempt2.out",true);
         // FileWriter fw = new FileWriter("a1.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            
        for(int i=0;i<T;i++)
        {
            N=Integer.parseInt(br.readLine());
            if(N==0) 
            {
                bw.write("Case #"+(i+1)+": INSOMNIA");
                bw.newLine();
                continue;
            }
            int[] a={0,0,0,0,0,0,0,0,0,0};
            int j=0,flg=0; long incr=0,prod=0;String str="";
            while(flg!=10)
            {
                incr++;
                prod=incr*N;
                str=prod+"";
                for(int k=0;k<str.length();k++)
                {
                    if(str.charAt(k)=='0' && a[0]==0)
                    {
                        a[0]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='1' && a[1]==0)
                    {
                        a[1]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='2' && a[2]==0)
                    {
                        a[2]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='3' && a[3]==0)
                    {
                        a[3]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='4' && a[4]==0)
                    {
                        a[4]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='5' && a[5]==0)
                    {
                        a[5]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='6' && a[6]==0)
                    {
                        a[6]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='7' && a[7]==0)
                    {
                        a[7]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='8' && a[8]==0)
                    {
                        a[8]=1;
                        flg++;
                    }
                    else if(str.charAt(k)=='9' && a[9]==0)
                    {
                        a[9]=1;
                        flg++;
                    }
                }
            }
            bw.write("Case #"+(i+1)+": "+prod);
            bw.newLine();
        }
            br.close();
           fr.close();
           bw.close();
           fw.close();
        }
        catch(FileNotFoundException ex){
        System.out.println("Exception"+ex);
        }
        catch(IOException ex){
        System.out.println("Exception"+ex);
        }
    }
    
}
