package methodEmbedding.Standing_Ovation.S.LYD1823;


import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("A.in"));
        try(PrintWriter pw = new PrintWriter("StandingOvation.txt")){
        int T = Integer.parseInt(br.readLine());
        int a[][] = new int[T][];
        int n;
        int cntr[] = new int[T];
        for(int i=0;i<T;i++){
            String line = br.readLine();
            String[] s = line.trim().split("\\s+");
            n = Integer.parseInt(s[0])+1;
            //System.out.println("n = "+n+", i = "+i);
            a[i] = new int[n];
            if(n==1)
                cntr[i] = 0;
            else{
                int b = Integer.parseInt(s[1]);
            //System.out.println("b = "+b);
                int j=s[1].length()-1;
            //System.out.println("j = "+j);
                while(b/10>0){
                    a[i][j] = b%10;
                //System.out.println("a[i]["+j+"] = "+a[i][j]);
                    b = b/10;
                //System.out.println("b = "+b);
                    j--;
                }
            //System.out.println("b = "+b);
                a[i][j] = b;
                int sum = a[i][0];
                cntr[i] = 0;
                for(j=1;j<a[i].length;j++){
                    if(sum<j){
                        for(int k=0;k<j;k++){
                            if(a[i][k]!=0)
                                continue;
                            else{
                                while(a[i][k]<=9 && sum<j){
                                    a[i][k] += 1;
                                    sum += 1;
                                    cntr[i] += 1;
                                }
                            }
                            if(sum==j)
                                break;
                        }
                    }
                    sum += a[i][j];
                }
            }
            
        }
        for(int i=0;i<T;i++){
            if(i== T-1)
             pw.print("Case #"+(i+1)+": "+cntr[i]);
            else
             pw.println("Case #"+(i+1)+": "+cntr[i]);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
