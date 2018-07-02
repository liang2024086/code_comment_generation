package methodEmbedding.Cookie_Clicker_Alpha.S.LYD821;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author chaitanya
 */
public class Main {
    public static void main(String[] args){
        File f = new File("//home//chaitanya//Documents//Code//Cookies//src//cookies//data");
        try{
            Scanner s = new Scanner(f);
            int times=s.nextInt();s.nextLine();
            
            for(int i=0;i<times;i++){
                String parts[]=s.nextLine().trim().split(" ");
                
                Calculate cl = new Calculate(2.0,Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]));
                double ans = cl.maximise();
                
                System.out.println("Case #"+(i+1)+": "+ans);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
