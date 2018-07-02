package methodEmbedding.Magic_Trick.S.LYD1830;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreyas Zagade
 */
class MagicTrick {
    
    public static void main(String arg[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int index=1;
        while(index<=t){
            int row=Integer.parseInt(br.readLine());
            String arr[]=null;
            String arr1[]=null;
            for(int i=1;i<=4;i++){
                if(row==i)
                    arr=br.readLine().split(" ");
                else
                    br.readLine();        
            }
            int row1=Integer.parseInt(br.readLine());
            for(int i=1;i<=4;i++){
                if(row1==i)
                    arr1=br.readLine().split(" ");
                else
                    br.readLine();        
            }
            HashSet<String> hs=new HashSet<String>();
            for(int i=0;i<4;i++)
                hs.add(arr[i]);
            Vector<String> v=new Vector<String>();
            int size=4;
            for(int i=0;i<4;i++){
                hs.add(arr1[i]);
                if(hs.size()==size){
                    v.add(arr1[i]);
                }else{
                    size++;
                }
            }
            if(v.isEmpty())
                System.out.println("Case #"+index+": Volunteer cheated!");
            else if(v.size()==1)
                System.out.println("Case #"+index+": "+v.firstElement());
            else
                System.out.println("Case #"+index+": Bad magician!");
            index++;
        }
    }
    
}
