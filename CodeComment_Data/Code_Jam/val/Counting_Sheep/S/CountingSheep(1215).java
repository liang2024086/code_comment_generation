package methodEmbedding.Counting_Sheep.S.LYD279;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.lang.*;
/**
 *
 * @author Ash
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        FileInputStream fin = new FileInputStream("C:\\Users\\Ash\\Downloads\\A-small-attempt1.in");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        File file = new File("C:\\Users\\Ash\\Downloads\\A-small.out");
        FileOutputStream fout = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fout);
        System.setOut(ps);
        int n,num,count=0,k;
        int visited[] = new int[10];
        int t = Integer.parseInt(br.readLine());
        for (int i=1;i<=t;i++)
        {   count=0;
            k=1;
            for(int j=0;j<10;j++)
                visited[j]=0;
          n = Integer.parseInt(br.readLine());
          if(n==0)
             System.out.println("Case #"+i+": INSOMNIA");
          else
          {
             while(count!=10)
             {
                 num=n*k;
                 while(num>0)
                 {
                     if(visited[num%10]==0)
                     {
                         visited[num%10]=1;
                         count++;
                     }
                     num=num/10;
                     
                 }
                 k++;
             }
          System.out.println("Case #"+i+": "+(n*(k-1)));
        }
        }
        
        
    }
    
}
