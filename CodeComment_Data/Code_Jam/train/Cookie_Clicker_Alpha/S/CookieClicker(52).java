package methodEmbedding.Cookie_Clicker_Alpha.S.LYD882;


import java.io.*;
import java.util.StringTokenizer;

public class CookieClicker {
    String s="";
    int N,i,t;
    double C,F,X,cur,val,temp;
    StringTokenizer st;

    public CookieClicker(){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream("B-small-attempt0.in");
            DataInputStream dis=new DataInputStream(fis);
            fos=new FileOutputStream("B-small-attempt0.out");
            DataOutputStream dos=new DataOutputStream(fos);
            N=Integer.parseInt(dis.readLine());
            for(i=1;i<=N;i++)
            {
                cur=2;
                val=0;
                st=new StringTokenizer(dis.readLine());
                C=Double.parseDouble(st.nextToken());
                F=Double.parseDouble(st.nextToken());
                X=Double.parseDouble(st.nextToken());
                while((X/cur)>((C/cur)+(X/(cur+F)))){
                    val+=C/cur;
                    cur+=F;
                }
                if(cur==2){
                    val=X/cur;
                }
                else{
                    val+=X/cur;
                }
//                System.out.println("Cur: "+cur+" / Val: "+val);
                s+="Case #"+i+": "+String.format("%.7f",val)+"\n";
            }            
            dos.writeBytes(s);
            fis.close();
            fos.close();
//            System.out.println(s);
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
       new CookieClicker();
    }
    
}
