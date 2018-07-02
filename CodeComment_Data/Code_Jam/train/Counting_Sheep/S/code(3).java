package methodEmbedding.Counting_Sheep.S.LYD451;

import java.util.*;
public class a {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
                
                
                
                int T = in.nextInt();
                
                for (int i = 0; i < T; i++) {
                    int N=in.nextInt();
                    if(N!=0)
                    {
                        String allDigits="";
                        int count=1;
                        while (true) { 
                           //N*=count;
                          String Nstr=(N*count)+""; 
                       
                          for (int j = 0; j < Nstr.length(); j++) {
                              if(!allDigits.contains(Nstr.charAt(j)+""))
                              {
                                  allDigits+=Nstr.charAt(j);
                              }
                                  
                            }
                            if(allDigits.length()==10) break;
                         else count++;
                        }
                        System.out.println("Case #"+(i+1)+": "+N*count);
                    }
                    else System.out.println("Case #"+(i+1)+": INSOMNIA");
            }
   
        }
}
