import java.util.*;
// https://leetcode.com/problems/count-items-matching-a-rule/

class solve {
    public static void main(String[] args) {
        ArrayList<List<String> > listOfLists = new ArrayList<List<String> >();
        List<String> list1
        = new ArrayList<String>();
    list1.add("phone");
    list1.add("blue");
    list1.add("pixel");
    listOfLists.add(list1);

    List<String> list2
        = new ArrayList<String>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
    listOfLists.add(list2);

    List<String> list3
        = new ArrayList<String>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
    listOfLists.add(list3);

        System.out.println(solve(listOfLists, "color", "silver"));
    }

    private static int solve(List<List<String>> items,  String ruleKey, String ruleValue ){
        int k = -1;

        switch(ruleKey){
            case "type": k = 0; break;
            case "color": k = 1; break;
            case "name": k = 2; break;
        }
        int score = 0;
       
        for(int i = 0; i < items.size(); i++){
         //   System.out.println(items.get(i));
           if(items.get(i).get(k).equals(ruleValue)) score++;
        }
        
        return score;
    }
}
