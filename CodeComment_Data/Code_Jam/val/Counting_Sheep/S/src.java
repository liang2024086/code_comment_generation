package methodEmbedding.Counting_Sheep.S.LYD30;

import java.util.Scanner;
public class src{

     private static Scanner inp;

	public static void main(String []args){
        
        Integer T=0;
        inp = new Scanner(System.in);
        while(T<1||T>100){T=inp.nextInt();}
        Integer N[]=new Integer[T];
        for(int i=0;i<T;i++){N[i]=-1;}
        String Op[]=new String[T];
        Integer tab[]=new Integer[10];
        int flag=0,mycase=0;
        for(int i=0;i<T;i++)
        {
            while(N[i]<0||N[i]>1000000){N[i]=inp.nextInt();}
        }
        for(int i=0;i<T;i++)
        {
            flag=0;
            for(int l=0;l<10;l++){tab[l]=-1;}
            mycase=0;
            if(N[i]==0){Op[i]="INSOMNIA";}
            else
            {//ELSE
            
                while(flag==0)
                {
                    
                    Integer number=N[i]*(++mycase);
                        while (number > 0) {
                        tab[number%10]=0;
                        number = number / 10;
                        }
                        int s=0;
                    for(int k=0;k<10;k++){ if(tab[k]==0){s++;} }
                        if(s==10){ flag=1; Op[i]=""+(mycase*N[i]); }
                }
            }
        }
        //Input process ends
        for(int i=0;i<T;i++)
        {
            System.out.println("Case #"+(i+1)+": "+Op[i]);
        }
     }
}
