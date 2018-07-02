package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1045;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;


public class Cookie {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
       double t1,t2;
        int N;
        double c,f,x,r=2,cu=0,t=0,l,m;
        int i,j,k;
        String n;
         String[] ar1=new String[3];
         String pp=null;
        String name="C:\\Users\\Ishadi\\Documents\\A\\B-small-attempt0.txt";
        String name1="C:\\Users\\Ishadi\\Documents\\A\\output.txt";
         BufferedReader br = new BufferedReader(new FileReader(name));
        BufferedWriter bw = new BufferedWriter(new FileWriter(name1,false));
         N=Integer.parseInt(br.readLine());
        for(i=0;i<N;i++)
        {   t=0;r=2;
           n=String.valueOf(i+1);
           bw.append("Case #");
           bw.append(n);
           bw.append(": ");
            pp=br.readLine();
            ar1=pp.split(" ");
            c=Double.parseDouble(ar1[0]);
            f=Double.parseDouble(ar1[1]);
            x=Double.parseDouble(ar1[2]);
            out.println("Cu= "+c);out.println("Cu= "+f);out.println("Cu= "+x);
           do {
            
            //out.println("Cu= "+cu);
            t1=(c-cu)/r;    //idamak
            t2=(x-cu)/r; //normal
            l=(t2-t1)*(r+f); //income from land end of t2
            if(l>x)
            {
                t=t+t1;
                r=r+f;
                
            
            }
                
              
            }while(l>x);
            t=t+t2;
             bw.append(String.valueOf(t)); 
                
            //Case #1: 1.0000000 
         bw.newLine();
        }
        bw.close(); 
    }
    
}
