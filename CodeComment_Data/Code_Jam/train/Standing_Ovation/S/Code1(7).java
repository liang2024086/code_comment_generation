package methodEmbedding.Standing_Ovation.S.LYD980;



import java.util.Scanner;

public class Code1 {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        byte t=s.nextByte();
        short frnd[]=new short[t];
        for (int i = 0; i < t; i++)
        {
            byte smax=s.nextByte();
            String st=s.next();
            byte n[]=new byte[smax+1];
            short sum;
            for (int j = 0; j < smax+1; j++)
            {
                n[j]=Byte.parseByte(st.charAt(j)+"");
            }
            sum=n[0];
            for (int j = 1; j < smax+1; j++)
            {
                if(sum<j)
                {
                    frnd[i]+=(j-sum);
                    sum+=(j-sum);
                }
                sum+=n[j];
            }
            
        }
        for (int i = 0; i < t; i++)
        {
            System.out.println("Case #"+(i+1)+": "+frnd[i]);
        }
    }
    
}
