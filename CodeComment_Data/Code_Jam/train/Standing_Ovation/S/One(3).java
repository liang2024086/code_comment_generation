package methodEmbedding.Standing_Ovation.S.LYD770;

import java.util.*;
public class One {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T,SMAX,frnds,audi,value;
        String SLEV;
        T=s.nextInt();
        for(int i=0;i<T;i++)
        {
            SMAX=s.nextInt();
            SLEV=s.next();
            frnds=0;
            audi=0;
	    value=0;
            for(int j=0;j<SMAX+1;j++)
            {
                int SV;
                SV=Integer.parseInt(""+SLEV.charAt(j));
                if(audi>=j)
                {
                    audi=SV+audi;
                }
                else
                {
                    frnds=(j-audi);
                    audi=SV+audi+frnds;
		    value=value+frnds;
                }
            }
            System.out.println("Case #"+(i+1)+": "+value);
        }
    }
    
}
