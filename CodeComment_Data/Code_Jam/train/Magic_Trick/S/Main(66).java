package methodEmbedding.Magic_Trick.S.LYD29;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author chaitanya
 */
public class Main {
    public static void main(String[] args){
        File f = new File("//home//chaitanya//Documents//Code//Magic//src//magic//data");
        try{
            Scanner s = new Scanner(f);
            int times = s.nextInt();s.nextLine();
            
            for(int i=0;i<times;i++){
                int ans1 = s.nextInt();s.nextLine();
                //System.out.println(ans1);
                Grid g =new Grid(s);
                int num[] = g.getElements(ans1-1);
                //for(int m=0;m<num.length;m++)
                    //System.out.println(num[m]+" ");
                //System.out.println("");
                int ans2 = s.nextInt();s.nextLine();
                //System.out.println(ans2);
                Grid g1 = new Grid(s);
                int who[] = g1.getElements(ans2-1);
                int cnt=0;
                int per=0;
                for(int j=0;j<4;j++){
                    for(int k=0;k<4;k++){
                        if(num[j]==who[k]){
                            cnt++;
                            per=num[j];
                        }
                    }
                }
                if(cnt==0)
                    System.out.println("Case #"+(i+1)+": Volunteer cheated!");
                else if(cnt>1)
                    System.out.println("Case #"+(i+1)+": Bad magician!");
                else
                    System.out.println("Case #"+(i+1)+": "+per);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
