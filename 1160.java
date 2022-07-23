import java.rmi.StubNotFoundException;
import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new String[] {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"}, "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
    }

    private static int solve(String[] words, String chars){
      int sumLength = 0;
      String copy = chars;
      for (int i = 0; i < words.length; i++) {
        boolean isGood = true;
        copy = chars;
        for (int j = 0; j < words[i].length(); j++) {
          if(copy.contains(String.valueOf(words[i].charAt(j)))){
            int p = copy.indexOf(String.valueOf(words[i].charAt(j)));
            copy = copy.substring(0,p) + " " + copy.substring(p + 1);
            if(i == 3) System.out.println(copy);
          }
          else {
            isGood = false;
            break;
          }
        }
        if(isGood) {
          System.out.println(words[i]);
          System.out.println(chars);
          System.out.println(i);
          sumLength += words[i].length();
        }

      }
     return sumLength;
    }
    
}
