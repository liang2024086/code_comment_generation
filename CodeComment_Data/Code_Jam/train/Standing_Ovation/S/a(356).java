package methodEmbedding.Standing_Ovation.S.LYD1742;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class one {
    public static void main(String []arg) throws FileNotFoundException{
        try{
    Scanner s=new Scanner(new File("d://A-small-attempt0.in"));
         //  Scanner s=new Scanner(System.in);
   PrintWriter p=new PrintWriter(new File("d://x.out"));
    int a=Integer.parseInt(s.nextLine());
    for(int k=0;k<a;k++){
    String []b=s.nextLine().split(" ");
    int num=Integer.parseInt(b[0]);
    int []v=new int[num+1];
    for(int j=0;j<=num;j++){
                    v[j]=(int)(b[1].charAt(j)-'0');
                                        

        }
           

    int stand=0,extra=0;
    for(int i=0;i<=num;i++){
                     if(stand>=i){stand+=v[i];}
                     else {
                         if(v[i]!=0){
                          extra=extra+(i-stand);
                         stand=i+v[i];
                         }
                     }  
                     System.out.println(i+" "+v[i]+" "+stand+" "+extra);

                            }
    
    
   p.println("Case #"+(k+1)+": "+extra);
          System.out.println("Case #"+(k+1)+": "+extra);
    }
    p.flush();
    p.close();
        }catch( NumberFormatException e){System.out.print(e);}
    
    
    }
}
