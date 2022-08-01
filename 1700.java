import java.util.*;
class solve {
  public static void main(String[] args) {
    int[] students = {1,1,1,0,0,1};
    int[] sandwiches = {1,0,0,0,1,1};
    System.out.println(solve(students, sandwiches));
}

private static int solve(int[] students, int[] sandwiches){
//        List<Integer> studentsList = Arrays.stream(students).boxed().toList();
//        List<Integer> sandwichesList = Arrays.stream(students).boxed().toList();

    List<Integer> studentsList = new ArrayList<>();
    List<Integer> sandwichesList = new ArrayList<>();

    for (int i = 0; i < sandwiches.length; i++) {
        sandwichesList.add(sandwiches[i]);
    }
    for (int i = 0; i < students.length; i++) {
        studentsList.add(students[i]);
    }

    while(studentsList.get(0) == sandwichesList.get(0)){
        studentsList.remove(0);
        sandwichesList.remove(0);
    }

    for (int i = 0; i < studentsList.size(); i++) {
        int first = studentsList.get(0);
        int temp = studentsList.get(studentsList.size() - 1);
        for (int j = studentsList.size() - 1; j > 0; j--) {
            int previous = studentsList.get(j - 1);
            studentsList.set(j - 1, temp);
            temp = previous;
        }
        studentsList.set(studentsList.size() - 1, first);
        while(studentsList.get(0) == sandwichesList.get(0)){
            studentsList.remove(0);
            sandwichesList.remove(0);
        }


        int count = 1;
        boolean isEqual = false;
        for (int j = 0; j < studentsList.size() - 1; j++) {

            if(studentsList.get(j) != studentsList.get(j + 1)){
                isEqual = false;
                break;
            }
            else {
                isEqual = true;
                count++;
            }
        }
        if(isEqual) return count;

    }
    return 0;
}

}
