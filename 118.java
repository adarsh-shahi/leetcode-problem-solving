import java.util.*;
class solve {
    public static void main(String[] args) {
        System.out.println(solve(3));
    }

    private static List<List<Integer>> solve(int numRows){
      List<List<Integer>> list = new ArrayList<>();
      List<Integer> first = new ArrayList<>();
      first.add(1);
      list.add(first);


      for (int i = 1; i < numRows; i++) {
        List<Integer> instanse = new ArrayList<>();
        instanse.add(1);

        for(int j = 0; j < list.get(list.size() - 1).size() - 1; ++j){
            instanse.add(list.get(list.size() - 1).get(j) + list.get(list.size() - 1).get(j + 1));
        }

        instanse.add(1);
        list.add(instanse);
      }

     return list;
    }
    
}
