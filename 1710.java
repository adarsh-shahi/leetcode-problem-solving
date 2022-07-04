import java.util.*;
class solve {
    public static void main(String[] args) {
        int[][] boxTypes = {
          {1,3},{2,2},{3,1}
        };
    
        System.out.println(solve(boxTypes, 4));
    }

    private static int solve(int[][] boxTypes, int truckSize){

      boxTypes = selectionSort(boxTypes);

      int maxUnits = 0;
      int currentBoxes = 0;
      int i = 0;
      while(i < boxTypes.length){
        if((boxTypes[i][0] + currentBoxes) < truckSize) {
          maxUnits += (boxTypes[i][0] * boxTypes[i][1]);
          currentBoxes += boxTypes[i][0];
        }
        else{
          int boxes = truckSize - currentBoxes;
          maxUnits += boxTypes[i][1] * boxes;
          currentBoxes += boxes;
        } 

        if(currentBoxes == truckSize) break;
        i++;
      }
        return maxUnits;
    }

    static int[][] selectionSort(int[][] array){
      for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
          if(array[i][1] < array[j][1]){
            int[] temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
        }
      }
      return array;
    }
    
}