class solve {
  public static void main(String[] args) {
      for(int e: solve(new int[] {8,4,6,2,3})){
        System.out.println(e);
      }
  }

  private static int[] solve(int[] prices){
    int[] finalPrice = new int[prices.length];
      
    for (int i = 0; i < finalPrice.length - 1; i++) {
      boolean flag = false;
      for (int j = i + 1; j < finalPrice.length; j++) {
        if(prices[j] <= prices[i]){
          flag = true;
          finalPrice[i] = prices[i] - prices[j];
          break;
        }
      }
      if(!flag) finalPrice[i] = prices[i];
    }
    finalPrice[prices.length - 1] = prices[prices.length -1];
    return finalPrice;
    
  }
  
}
