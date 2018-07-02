package methodEmbedding.Revenge_of_the_Pancakes.S.LYD622;

import java.io.*;

public class b{
    public static void main(String[] args){
        try{
            File input = new File("in");
            FileInputStream fis = new FileInputStream(input);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            int n = Integer.parseInt(dis.readLine());
            for(int t=1; t<=n; t++){
                String line = dis.readLine().trim();
                int ans = line.charAt(line.length()-1)=='+' ? 0 : 1;
                for(int i=1; i<line.length(); i++){
                    ans += line.charAt(i)!=line.charAt(i-1) ? 1 : 0;
                }
                System.out.println("Case #"+t+": "+ans);
            }
            fis.close();
            bis.close();
            dis.close();
        }
        catch(FileNotFoundException e) { }
        catch(IOException e) { }
    }
}
