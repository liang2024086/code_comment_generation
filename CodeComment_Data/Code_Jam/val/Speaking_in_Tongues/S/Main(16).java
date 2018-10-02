package methodEmbedding.Speaking_in_Tongues.S.LYD1610;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String file = "A-small-attempt1";
        BufferedReader in = new BufferedReader(new FileReader(file + ".in"));
        FileWriter archivo = new FileWriter(file+".out");
       PrintWriter outs = new PrintWriter(archivo);
       outs.flush();


        
        char bca[] = new char[26];
        String inp = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
        String out = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
        bca[25] = 'q';
        bca['q'-97] = 'z';
        for (int i = 0; i < 105; i++) {
            bca[inp.charAt(i) - 97] = out.charAt(i);
        }
        int n = Integer.parseInt(in.readLine());
        for(int i=1;i<=n;i++)
        {
            StringBuilder k = new StringBuilder();
            k.append("Case #").append(i).append(": ");
            String l = in.readLine();
            for(int j=0;j<l.length();j++)
                if(l.charAt(j)==' ')
                    k.append(' ');
                else k.append(bca[l.charAt(j)-97]);
            outs.println(k);
        }
        
        //System.out.println(k);
        outs.close();
        in.close();
        System.exit(0);

    }
}
