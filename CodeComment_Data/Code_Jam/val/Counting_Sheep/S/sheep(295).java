package methodEmbedding.Counting_Sheep.S.LYD171;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class sheep {

    public static void main(String[] args)throws IOException{

    int T;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T=Integer.parseInt(br.readLine());
    int caseN = 1;
    while(T!=0){
    int i=2;
    String N,n;
    String ans="INSOMNIA";
    n=br.readLine();
    N=n;
    boolean flag=true;

    int visited[] =new int[10];
    Arrays.fill(visited,0);

    if(Integer.parseInt(n)==0){

        ans="INSOMNIA";
    }else{

    while(flag){


   for(int k=0;k<n.length();k++){

        int index=Character.getNumericValue(n.charAt(k));

        visited[index]=1;
   }

   int tempSeen[]=new int[10];
   System.arraycopy(visited, 0, tempSeen, 0, visited.length);
   Arrays.sort(tempSeen);

   if(tempSeen[0]==0){

   int temp=Integer.parseInt(N)*i;
   n=String.valueOf(temp);

   i++;
   }else{
   flag=false;


   }




    }
    ans=n;
    }
        System.out.println("Case #"+caseN+": "+ans);
        caseN++;
    T--;
    }

    }

}
