import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve("aaab", 'b')));
    }

    private static int[] solve(String s, char c){
     List<Integer> presnet = new ArrayList<>();
     for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == (c)) presnet.add(i);
     }
     System.out.println(presnet);

     int[] shortest = new int[s.length()];
     for (int i = 0; i < s.length(); i++) {
      int minSize = Integer.MAX_VALUE;
      for (int j = 0; j < presnet.size(); j++) {
        if(Math.abs( i - presnet.get(j) ) < minSize) minSize = Math.abs(i - presnet.get(j));
      }
      shortest[i] = minSize;
     }

     return shortest;
    }
    
}