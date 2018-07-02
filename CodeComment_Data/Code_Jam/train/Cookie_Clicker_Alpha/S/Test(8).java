package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1487;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Password {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        String password[] = new String[cases];
        for (int i = 0; i < cases; i++) {
            password[i] = br.readLine();
            map.put(password[i], Boolean.TRUE);
        }
        String res = "";
        for (int i = 0; i < cases; i++) {
            String rev = "";
            for (int j = 0; j < password[i].length(); j++) {
                rev = password[i].charAt(j) + rev;
            }
            if (map.containsKey(rev)) {
                res = rev;
                break;
            }
        }
        System.out.println(res.length() + " " + res.charAt(res.length() / 2));
    }
}
