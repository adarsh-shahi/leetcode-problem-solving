import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(new String[] {"1","C"}));
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
    
}