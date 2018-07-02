package methodEmbedding.Standing_Ovation.S.LYD449;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter out = new PrintWriter(outputStream);
        final int T = Integer.valueOf(in.readLine());
        for(int i=1;i<=T;i++){
            final String[] inp = in.readLine().split(" ");
            final int smax = Integer.valueOf(inp[0]);
            final char[] chars = inp[1].toCharArray();
            int standing = 0;
            int friends = 0;
            for (int c=0;c<chars.length;c++) {
                int num = (int)(chars[c]-'0');
                if(num>0){
                    if(standing>=c){
                        standing += num;
                    }else{
                        friends += (c-standing);
                        standing += (c-standing+num);
                    }
                }

            }
            out.println(String.format("Case #%d: %d",i,friends));

        }


        out.close();
    }
}
