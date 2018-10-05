package methodEmbedding.Cookie_Clicker_Alpha.S.LYD688;


import java.util.Scanner;

public class cookie {
	
	public static void main(String args[] ) throws Exception {
	
	Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    double c, f, x, tot, p;
    int t=1;

     while(t<=test)
     {
        p=2;
        tot=0;
    	 
        c=sc.nextDouble();
        f=sc.nextDouble();
        x=sc.nextDouble();
        
    	while((c/p+x/(p+f))<x/p) 
    	{tot+=(c/p);p+=f;}
    	
        tot+=x/p;
        
                      
        System.out.println("Case #"+t+": "+String.format("%.7f", tot));
        
       
        
    	 t++;
     }
     
    
	}
}
