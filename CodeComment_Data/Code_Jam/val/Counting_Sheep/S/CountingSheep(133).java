package methodEmbedding.Counting_Sheep.S.LYD1358;

import java.io.*;

/**
 * Created by hardCode on 4/9/2016.
 */
class CountingSheep {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t,k=1,i,p;
        long n,count,temp,ans=0;
        boolean hash[]=new boolean[10];
        t=Integer.parseInt(br.readLine());


        while(t-->0){
            n=Integer.parseInt(br.readLine());
            if(n==0){
                System.out.println("case #"+k+": INSOMNIA");
            }
            else{
                count=0;
                for (i = 0; i<10 ; i++)hash[i]=false;
                i=1;

                while(count!=10){

                    temp=n*i;
                    ans=temp;

                    while(temp!=0){

                        p= (int) (temp%10);

                        if(!hash[p]){
                            hash[p]=true;
                            count++;
                        }

                        temp/=10;
                    }
                    i++;
                }
                System.out.println("case #" + k +": "+ans);            }
            k++;
        }
    }
}
