import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(isSubsequence("rjufvjafbxnbgriwgokdgqdqewn", "mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq"));
    }

    static boolean isSubsequence(String s, String t) {
       return solve("", t, s);
    }

    private static boolean solve(String p, String up, String s){
      if(up.isEmpty()){
        if(s.equals(p)) return true;
        return false;
      }
      boolean flag = solve(p + up.charAt(0), up.substring(1), s);
      if(flag) return flag;
      boolean flag1 = solve(p, up.substring(1), s);
      if(flag1) return flag1;
      return false;
    }
    
}
