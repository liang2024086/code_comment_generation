package methodEmbedding.Magic_Trick.S.LYD989;

import java.io.*;
import java.util.StringTokenizer;

public class MagicTrick {
    
    public MagicTrick(){
        String s="",ans="",arr="",temp="";
        int T,C,i,j,k;
        StringTokenizer st;
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream("A-small-attempt0.in");
            DataInputStream dis=new DataInputStream(fis);
            fos=new FileOutputStream("A-small-attempt0.out");
            DataOutputStream dos=new DataOutputStream(fos);
            T=Integer.parseInt(dis.readLine());
            for(i=1;i<=2*T;i++)
            {
                ans="Volunteer cheated!";
                C=Integer.parseInt(dis.readLine());
                for(j=1;j<C;j++)
                {
                   dis.readLine();
                }
                if(i%2!=0){
                    arr="/"+dis.readLine()+"/";
                    arr=arr.replaceAll(" ","/");
                }
                else{
                    st=new StringTokenizer(dis.readLine());
                    for(j=0;j<4;j++){
                        temp=st.nextToken();
                        for(k=0;k<4;k++){
                            if(arr.contains("/"+temp+"/")){
                                if(ans.equalsIgnoreCase("Volunteer cheated!")){
                                    ans=temp;
                                    break;
                                    //System.out.println(temp +"\t"+ arr);
                                }
                                else{
                                    ans="Bad magician!";
                                    j=4;
                                    break;
                                }
                            }
                        }
                    }
                }
                for(j=C;j<4;j++)
                {
                   dis.readLine();
                }
                if(i%2==0){
                    s+="Case #"+(i/2)+": "+ans+"\n";
                    //System.out.println(s);
                }
            }            
        dos.writeBytes(s);
        fis.close();
        fos.close();
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
       new MagicTrick();
    }  
}
