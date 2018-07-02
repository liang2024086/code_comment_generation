package parseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SplitTool{

static final int LOWER = 0;
static final int UPPER = 1;
static final int UNDER = 2;
static final int NUMBER = 3;
static final int OTHER = 4;
static final int SYMBOL = 5;

public static String isAbbr (String id, List<String> words) {
    for (String word:words) {
        if (word.indexOf(id) == 0) return word;
    }
    char[] charId = id.toCharArray();
    int i, j;

    String firstLetters = "";
    for (String word:words) firstLetters+=word.charAt(0);
    int position = firstLetters.indexOf(id);
    //System.out.println(firstLetters+" | "+id);
    if (position >= 0) {
        //System.out.println(firstLetters+" | "+id);
        String fullName = "";
        for (int k=0; k<id.length(); ++k, ++position)
            fullName+=words.get(position)+",";
        //for (String word:words) System.out.println(word);
        return fullName;
    }

    for (String word:words) {
        i = j = 0;
        char[] charWord = word.toCharArray();
        while (i<charId.length && j<charWord.length) {
            while (j<charWord.length && charWord[j]!=charId[i]) ++j;
            if (j==charWord.length) break;
            ++j;
            ++i;
        }
        if (i==charId.length) return word;
    }
    return null;
}

public static int getCase (char ch) {
    if (ch>='A' && ch<='Z') return UPPER;
    else if (ch>='a' && ch<='z') return LOWER;
    else if (ch>'0' && ch<='9') return NUMBER;
    else if (ch == '_') return UNDER;
    else return OTHER;
}

public static List<List<String>> split (String string) {
    char[] charId = string.toCharArray();
    List<String> phrases = new ArrayList<String>();
    List<List<String>> words = new ArrayList<List<String>>();
    int i=0, j;
    while (i<charId.length && getCase(charId[i])==OTHER) ++i;
    for (; i<charId.length; ++i) {
        for (j=i+1; j<charId.length && getCase(charId[j])!=OTHER; ++j);
        phrases.add(string.substring(i, j));
        i=j;
        while (i<charId.length && getCase(charId[i])==OTHER) ++i;
        --i;
    }
    for (String ph:phrases) words.add(splitPhrase(ph));
    return words;
}

static final int LOW = 1;
static final int HIGH = 2;

public static List<String> splitPhrase (String string) {
    char[] str = string.toCharArray();
    List<String> words = new ArrayList<String>();
    int i=0, j, k, case_;
    int startCase = getCase(str[0]), state;
    while (i<str.length && getCase(str[i])==UNDER) ++i;
    /*if (startCase == LOWER) state = LOW;
    else if (startCase == UPPER) state = HIGH;
    else state = LOW;*/
    for (; i<str.length; ++i) {
        if (getCase(str[i])==LOWER) state = LOW;
        else state = HIGH;
        for (j=i+1; j<=str.length; ++j) {
            if (j==str.length) {
                words.add(string.substring(i,j).toLowerCase());
                break;
            }
            case_ = getCase(str[j]);
            if (case_ == LOWER) {
                state = LOW;
                continue;
            } else if (case_ == NUMBER) {
                boolean ifEnd = false;
                k = j + 1;
                while (k < str.length && getCase(str[k]) == NUMBER) ++k;
                if (k == str.length) ifEnd = true;
                if (ifEnd) {
                    words.add(string.substring(i,j).toLowerCase());
                    break;
                }
            } else if (case_ == UPPER) {
                if (state == LOW || (j+1<str.length && getCase(str[j+1]) == LOWER && j>=1 && getCase(str[j-1]) == LOWER)) {
                    //end.
                    //have problems.
                    //System.out.println("^^^^^^^^^^^"+str[j+1]);448
                    //System.out.println(string);
                    words.add(string.substring(i, j).toLowerCase());
                    //System.out.println(string.substring(i,j).toLowerCase());
                    break;
                }
                state = HIGH;
            } else if (case_ == SYMBOL) {
                state = HIGH;
                continue;
            } else { //UNDER
                words.add(string.substring(i,j).toLowerCase());
                break;
            }
        }
        i=j;
        while (i<str.length && getCase(str[i]) > UPPER) ++i;
        --i;
    }
    //System.out.print(string+" : ");for (String w:words)System.out.print(w+", ");System.out.println();
    return words;
}

}
