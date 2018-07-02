package methodEmbedding.Standing_Ovation.S.LYD1122;



import java.util.Scanner;

public class StandingOvation {
   
    public static void main(String args[])
    {
        int t,smax;
        int count=0;
        int total=0;
        String line;
        String[] splitLine;
        char[] splitLine1;
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        //scan1.nextLine();
        t=Integer.parseInt(scan.nextLine());
        //System.out.println("The value of t is"+t);
       
        int[] required=new int[t];
        for(int i=0;i<t;i++)
        {
            
            //System.out.println("stage 1");
            line=scan.nextLine();
           // System.out.println("The value of line is"+line);
            
            splitLine=line.split(" ");
            //System.out.println(splitLine);
            
            splitLine1=splitLine[1].toCharArray();
            if(Character.getNumericValue(((int)(splitLine[1].charAt(0))))==0)
            {
                count++;
                total=total+count;
               
            }
            else
            {
                total=total+(Character.getNumericValue(((int)(splitLine[1].charAt(0)))));
               
            }
            for(int j=1;j<=(Integer.parseInt(splitLine[0]));j++)
            {
                if(total<j)
                {
                    while(total<j)
                    {
                        count++;
                        total++;
                        
                    }
                     total=total+(Character.getNumericValue(((int)(splitLine[1].charAt(j)))));
                }
                else
                {
                    total=total+(Character.getNumericValue(((int)(splitLine[1].charAt(j)))));
                   
                }
                
            }
            required[i]=count;
            count=0;
            total=0;
        }
        for(int i=1;i<=t;i++)
        {
            System.out.println("Case #"+i+":"+" "+required[i-1]);
            
        }
       
    }
    
}
