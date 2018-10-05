package methodEmbedding.Cookie_Clicker_Alpha.S.LYD671;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class q2 {
    public static void main(String args[])throws Exception
    {
        FileInputStream fis=new FileInputStream("input.in");
        DataInputStream dis=new DataInputStream(fis);
        FileOutputStream fos=new FileOutputStream("output.out");
        PrintWriter pw=new PrintWriter(fos);
        int n=Integer.parseInt((dis.readLine()));
        for (int i = 1; i <=n; i++) 
        {
            StringTokenizer st=new StringTokenizer(dis.readLine());
            double c=Double.parseDouble(st.nextToken());
            double f=Double.parseDouble(st.nextToken());
            double x=Double.parseDouble(st.nextToken());
            double a=((((f*(x-c))/c)-2)/f);
            
            int low=(int)(a);
            if(a<0)
            {
                low=-1;
            }
            int high=(low+1);
            double sum=0.0;
            
            for (int j = 0; j <= low; j++) 
            {
                double v=(1/(2+(j*f)));
                sum=sum+v;
                //System.out.println(v*c);
            }
            sum=sum*c;
            //System.out.println(sum);
            double abc=(x/(2+high*f));
            //System.out.println(abc);
            sum=sum+abc;
            pw.format("Case #%d: %.7f\n",i,sum);
        }
        pw.close();
        fos.close();
    }
    
}
