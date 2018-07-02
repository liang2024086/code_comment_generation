package methodEmbedding.Speaking_in_Tongues.S.LYD220;


import java.util.TreeMap;

public class Jam_Q_A_S {

    public static void main(String[] args) {
        TreeMap<Character, Character> t = new TreeMap<Character, Character>();
        String in = "aoz ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String out = "yeq our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

        for (int i = 0; i < in.length(); i++) {
            t.put(in.charAt(i), out.charAt(i));
        }
        t.put('q', 'z');
        System.out.println(t);

        String[] input = {
            "ejp mysljylc kd kxveddknmc re jsicpdrysi",
            "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
            "de kr kd eoya kw aej tysr re ujdr lkgc jv",
            "hello i am the google code jam test data",
            "how are you",
            "aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny ieeeeeeeee",
            "y n f i c w l b k u o m x s e v z p d r j g a t h a q set k oset xa ynfd",
            "schr rkxc tesr aej dksl tkrb xc",
            "wpkcsid iesr mcr wpkcsid mcr dfkcsrkwkf vpelpcdd le nekso",
            "w ew rte czjymd w ew esc czjymd esc",
            "wep k ncrtccs rbpcc ysi s w ew k czjymd w ew k xksjd esc vmjd w ew k xksjd rte",
            "pklbr k wepler bcpc ks rbc dryrcd aej fymm kr y dyjdylc ks rbc xejrb",
            "k bygc ncdrci wpjkr dvkoc ysi xees set k dbymm ncdr aej rbc lja",
            "set rbyr aej oset leelmcpcdc vmcydc ie ser jdc kr re byfo ksre ejp dadrcxd",
            "na rbc vpkfoksl ew xa rbjxnd dexcrbksl tkfoci rbkd tya fexcd",
            "cyfb ew jd byd bkd ets dvcfkym lkwr ysi aej oset rbkd tyd xcysr re nc rpjc",
            "ysi kw aej iesr jsicpcdrkxyrc xc k tesr jsicpcdrkxyrc aej",
            "ymm aejp nydc ypc ncmesl re cppep rbc dveesa nypi",
            "kx fexxysicp dbcvypi ysi rbkd kd xa wygepkrc vpenmcx es rbc leelmc feic uyx",
            "wep rbedc tbe dvcyo ks y resljc ie ser dvcyo re erbcp vcevmc",
            "seneia jsicpdrysid rbcx dksfc rbca ypc dvcyoksl xadrcpkcd ks rbc dvkpkr",
            "tbeeeeeeeeeeeeeeeeeeeyyyyyyyyy k oset f vmjd vmjd",
            "mcr mkvd ie tbyr bysid ie",
            "rbkd bcpc kd ljsveticp yfrkgyrci rtcsra dcgcs fymkncp wjmm yjre se okfonyfo sykmrbpetksl xyabcx",
            "aej tysr dcmm rbksld yr xc neksl qeeex",
            "ys cac wep ys cac ysi y vklces wep y vklces",
            "vscjxesejmrpyxkfpedfevkfdkmkfegemfysefeskedkd",
            "lpccrksld fbccdc vevdkfmc rbc sjxncp aej bygc ikymci kd fjppcsrma ejr ew vepofbevd",
            "eb seeeee lellymep kd bcyici wep rbc epvbysylc",
            "eb xa lei mcrd xyoc ejr"
        };

        for (int i = 0; i < input.length; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            for (char c : input[i].toCharArray()) {
                System.out.print(t.get(c));
            }
            System.out.println();
        }
    }
}
