import java.io.StreamCorruptedException;
import java.util.*;

class solve {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new String[] { "Hello", "Alaska", "Dad", "Peace" })));
}

private static String[] solve(String[] words) {
    List<String> ans = new ArrayList<>();
    String first = "qwertyuiop";
    String second = "asdfghjkl";
    String third = "zxcvbnm";

    for (int i = 0; i < words.length; i++) {
        boolean isThere =false;
        String word = words[i].toLowerCase();
        for (int j = 0; j < word.length(); j++) {
            isThere = false;
            for (int m = 0; m < first.length(); m++) {
                if (first.charAt(m) == word.charAt(j)) {
                    isThere = true;
                    break;
                }
            }
            if(!isThere) break;
        }
        if(isThere) ans.add(words[i]);
    }

    for (int i = 0; i < words.length; i++) {
        boolean isThere = false;
        String word = words[i].toLowerCase();
        for (int j = 0; j < word.length(); j++) {
            isThere = false;
            for (int m = 0; m < second.length(); m++) {
                if (second.charAt(m) == word.charAt(j)) {
                    isThere = true;
                    break;
                }
            }
            if(!isThere) break;
        }
        if(isThere) ans.add(words[i]);
    }

    for (int i = 0; i < words.length; i++) {
        boolean isThere = false;
        String word = words[i].toLowerCase();
        for (int j = 0; j < word.length(); j++) {
            isThere = false;
            for (int m = 0; m < third.length(); m++) {
                if (third.charAt(m) == word.charAt(j)) {
                    isThere = true;
                    break;
                }
            }
            if(!isThere) break;
        }
        if(isThere) ans.add(words[i]);
    }
    String[] same = new String[ans.size()];
    for (int i = 0; i < same.length; i++) {
        same[i] = ans.get(i);
    }

    return same;
}

}
