import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve2(new String[] {"1", "C"}));
    }

    private static int solve(String[] ops){
      ArrayList<Integer> scores = new ArrayList<>();

      for (int i = 0; i < ops.length; i++) {
        if(ops[i] == "+"){
          scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
        }
        else if(ops[i] == "D"){
          scores.add(scores.get(scores.size() - 1) * 2);
        }
        else if(ops[i] == "C"){
          scores.remove(scores.get(scores.size() - 1));
        }
        else{
          scores.add(Integer.parseInt(ops[i]));
        }
      }

      int sum = 0;

      for(Integer e: scores) sum+=e;
      return sum;
    }

    private static int solve2(String[] ops){
     int[] scores = new int[1000];
     int s = 0;

      for (int i = 0; i < ops.length; i++) {
        if(ops[i] == "+"){
          scores[s] = scores[s - 1] + scores[s - 2];
          s++;
        }
        else if(ops[i] == "D"){
          scores[s] = scores[s - 1] * 2;
          s++;
        }
        else if(ops[i] == "C"){
          s--;
        }
        else{
          scores[s] = Integer.parseInt(ops[i]);
          s++;
        }
      }
      int sum = 0;

      for (int i = 0; i < s; i++) {
        sum += scores[i];
      }
      return sum;
    }

    
    
}